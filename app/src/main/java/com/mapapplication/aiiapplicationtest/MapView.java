package com.mapapplication.aiiapplicationtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MapView extends View {

    private float mLastTouchX;
    private float mLastTouchY;


    private static final int CIRCLE_RADIUS = 10;

    private ArrayList<Node> NODES = new ArrayList<>();
    private double maxLatitude;
    private double minLatitude;
    private double maxLongitude;
    private double minLongitude;

    private double latitudeRange;
    private double longitudeRange;
    private double latitudeScale;
    private double longitudeScale;

    ArrayList<Node> p;

    public MapView(Context context) {
        super(context);
        Initialization();
    }

    public MapView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Initialization();
    }

    public MapView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Initialization();
    }

    private float mPosX;
    private float mPosY;

    @Override
    //Draws the map and the highlighted path
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(mPosX, mPosY);
        callPath(canvas);
        printWay(p, canvas);
        canvas.restore();
    }

    private float mMaxPosX;
    private float mMinPosX;
    private float mMaxPosY;
    private float mMinPosY;
    private float mPinchDistance = 0f;

    private static final float MAX_PERCENTAGE_OUT_OF_BOUNDS = 0.1f; // 10% out of bounds

    @Override
    //Creates panning on the screen
    public boolean onTouchEvent(MotionEvent ev) {
        final int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN: {
                final float x = ev.getX();
                final float y = ev.getY();
                mLastTouchX = x;
                mLastTouchY = y;
                break;
            }

            case MotionEvent.ACTION_MOVE: {
                final float x = ev.getX();
                final float y = ev.getY();
                final float dx = x - mLastTouchX;
                final float dy = y - mLastTouchY;
                mPosX += dx;
                mPosY += dy;

                // Calculate the max and min position values based on the view size and the max percentage out of bounds
                float viewWidth = getWidth();
                float viewHeight = getHeight();
                float maxPosX = viewWidth * (1 + MAX_PERCENTAGE_OUT_OF_BOUNDS);
                float minPosX = viewWidth * -MAX_PERCENTAGE_OUT_OF_BOUNDS;
                float maxPosY = viewHeight * (1 + MAX_PERCENTAGE_OUT_OF_BOUNDS);
                float minPosY = viewHeight * -MAX_PERCENTAGE_OUT_OF_BOUNDS;

                // Restrict the panning so it doesn't go too far away from the boundaries
                float restrictedMaxPosX = maxPosX - getWidth() * 0.1f;
                float restrictedMinPosX = minPosX + getWidth() * 0.2f;
                float restrictedMaxPosY = maxPosY - getHeight() * 0.1f;
                float restrictedMinPosY = minPosY + getHeight() * 0.2f;

                if (mPosX > restrictedMaxPosX) {
                    mPosX = restrictedMaxPosX;
                } else if (mPosX < restrictedMinPosX) {
                    mPosX = restrictedMinPosX;
                }

                if (mPosY > restrictedMaxPosY) {
                    mPosY = restrictedMaxPosY;
                } else if (mPosY < restrictedMinPosY) {
                    mPosY = restrictedMinPosY;
                }

                // Make sure the view isn't panned outside of the allowed range
                if (mPosX < minPosX) {
                    mPosX = minPosX;
                } else if (mPosX > maxPosX) {
                    mPosX = maxPosX;
                }

                if (mPosY < minPosY) {
                    mPosY = minPosY;
                } else if (mPosY > maxPosY) {
                    mPosY = maxPosY;
                }

                invalidate(p);
                mLastTouchX = x;
                mLastTouchY = y;
                break;
            }
        }
        return true;
    }

    //Initialization
    public void Initialization() {
        Buildings b = new Buildings();
        NODES = b.buildings;
    }
    //Draws the map on the screen
    private void callPath(Canvas canvas) {
        maxLatitude = NODES.get(0).getLatitude();
        minLatitude = NODES.get(0).getLatitude();
        maxLongitude = NODES.get(0).getLongitude();
        minLongitude = NODES.get(0).getLongitude();

        for (Node node : NODES) {
            if (node.getLatitude() > maxLatitude) {
                maxLatitude = node.getLatitude();
            }
            if (node.getLatitude() < minLatitude) {
                minLatitude = node.getLatitude();
            }
            if (node.getLongitude() > maxLongitude) {
                maxLongitude = node.getLongitude();
            }
            if (node.getLongitude() < minLongitude) {
                minLongitude = node.getLongitude();
            }
        }

        // Calculate the scaling factor for the map
        latitudeRange = maxLatitude - minLatitude;
        longitudeRange = maxLongitude - minLongitude;
        latitudeScale = (double) getHeight() / latitudeRange;
        longitudeScale = (double) getWidth() / longitudeRange;

        // Adjust the scaling factor to add more white space to the right and bottom part of the map
        latitudeRange *= 1.2;
        longitudeRange *= 1.2;
        latitudeScale = (double) getHeight() / latitudeRange;
        longitudeScale = (double) getWidth() / longitudeRange;

        // Draw the nodes as circles on the canvas with labels
        // minLongitude -= (longitudeRange * 0.2);
        for (Node node : NODES) {
            double scaledLatitude = ((node.getLatitude() - minLatitude) * latitudeScale) - (getHeight() * 0.1);
            double scaledLongitude = ((node.getLongitude() - minLongitude) * longitudeScale) - (getWidth() * 0.1);

            Paint circlePaint = new Paint();
            circlePaint.setColor(Color.parseColor("#D87093"));

            Paint textPaint = new Paint();
            textPaint.setColor(Color.parseColor("#000000"));
            textPaint.setTextSize(16);

            canvas.drawCircle((float) scaledLongitude, (float) scaledLatitude, CIRCLE_RADIUS, circlePaint);
            canvas.drawText(node.getName(), (float) scaledLongitude + CIRCLE_RADIUS, (float) scaledLatitude - CIRCLE_RADIUS, textPaint);

            for (Node.Edge r : node.getNeighbors()) {
                Node node1 = r.getNode();
                Node node2 = node;
                double scaledLatitude1 = ((node1.getLatitude() - minLatitude) * latitudeScale) - (getHeight() * 0.1);
                double scaledLongitude1 = ((node1.getLongitude() - minLongitude) * longitudeScale) - (getWidth() * 0.1);
                double scaledLatitude2 = ((node2.getLatitude() - minLatitude) * latitudeScale) - (getHeight() * 0.1);
                double scaledLongitude2 = ((node2.getLongitude() - minLongitude) * longitudeScale) - (getWidth() * 0.1);

                Paint linePaint = new Paint();
                linePaint.setStrokeWidth(3);
                linePaint.setColor(Color.parseColor("#000000"));

                float midLatitude = (float) ((scaledLatitude1 + scaledLatitude2) / 2);
                float midLongitude = (float) ((scaledLongitude1 + scaledLongitude2) / 2);


                canvas.drawLine((float) scaledLongitude1, (float) scaledLatitude1, (float) scaledLongitude2, (float) scaledLatitude2, linePaint);
                canvas.drawText(Double.toString(r.weight), midLongitude, midLatitude, textPaint);
            }
        }
    }
    //Draws the yellow/highlighted path between two buildings
    public void printWay(ArrayList<Node> path,Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(2);

        for (int i = 0; i < path.size() - 1; i++) {
            Node node1 = path.get(i);
            Node node2 = path.get(i + 1);

            double scaledLatitude1 = ((node1.getLatitude() - minLatitude) * latitudeScale) - (getHeight() * 0.1);
            double scaledLongitude1 = ((node1.getLongitude() - minLongitude) * longitudeScale) - (getWidth() * 0.1);
            double scaledLatitude2 = ((node2.getLatitude() - minLatitude) * latitudeScale) - (getHeight() * 0.1);
            double scaledLongitude2 = ((node2.getLongitude() - minLongitude) * longitudeScale) - (getWidth() * 0.1);

            Paint linePaint = new Paint();
            linePaint.setStrokeWidth(3);
            linePaint.setColor(Color.YELLOW);

            float midLatitude = (float) ((scaledLatitude1 + scaledLatitude2) / 2);
            float midLongitude = (float) ((scaledLongitude1 + scaledLongitude2) / 2);


            canvas.drawLine((float) scaledLongitude1, (float) scaledLatitude1, (float) scaledLongitude2, (float) scaledLatitude2, linePaint);


        }
    }

    //invalidate function with one added parameter and instruction
    public void invalidate(ArrayList<Node> way){
        p = way;
        super.invalidate();
    }





}
