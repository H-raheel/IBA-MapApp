package com.mapapplication.aiiapplicationtest;

import java.util.*;

public class MyGraph {
    ArrayList<classroom> adjList;
    int count;

    MyGraph(ArrayList<classroom> a) {
        adjList = a;
        count = 1;
    }

    public void AddVertex(classroom c) {
        adjList.add(c);
        count++;
    }

    //Creating edges between two classes adjacent to each other
    public void AddEdge(classroom c1, classroom c2) {
        if (adjList.contains(c1) && adjList.contains(c2)) {
            c1.adjacent.add(c2);
            c2.adjacent.add(c1);
        }
    }

    //BFS Algorithm
    public void shortestPath(String l1, String l2, String floordetail) {
        //Updating strings of start and end accordingly
        l1=l1.replace(" ","");
        l1=l1.replace("-","");
        l2=l2.replace(" ","");
        l2=l2.replace("-","");
        l1=l1.toUpperCase();
        l2=l2.toUpperCase();
        int[] prev = new int[adjList.size()];
        Queue<classroom> Q = new ArrayDeque<classroom>();
        boolean[] visited = new boolean[adjList.size()];
        int i = 0;
        int d = -1;
        boolean r = false;
        String s = "";

        for (i = 0; i < adjList.size(); i++) {
            if (adjList.get(i).name.equals(l1))
                break;
        }
        //Actual implementation of BFS
        if (i < adjList.size()) {
            classroom v = adjList.get(i);
            Q.add(v);
            visited[i] = true;
            prev[i] = -1;
            while (!Q.isEmpty()) {
                v = Q.remove();
                int p = adjList.indexOf(v);
                LinkedList<classroom> l = v.adjacent;
                for (int j = 0; j < l.size(); j++) {
                    classroom b = l.get(j);
                    int m = adjList.indexOf(b);
                    if (!visited[m]) {
                        Q.add(b);
                        visited[m] = true;
                        prev[m] = p;
                    }
                    if (b.name.equals(l2)) {
                        r = true;
                        d = adjList.indexOf(b);
                        break;
                    }
                }
                if (r == true)
                    break;
            }
            if (r == false) {
                System.out.println("Path does not exist");
                return;
            } else {
                int k = d;
                s = adjList.get(k).name;
                k = prev[k];
                while (k != -1) {
                    s = adjList.get(k).name + " -> " + s;
                    k = prev[k];
                }
            }
        } else {
            System.out.println("Source does not exist");
            return;
        }

        // Display the path using a GUI
        String finalL = l2;
        String finalL1 = l1;
//        Platform.runLater(() -> {
//            Stage popupStage = new Stage();
//            Pane pane = new Pane();
//            Scene scene = new Scene(pane, 500, 500);
//            popupStage.setScene(scene);
//            popupStage.show();
//            int startX = 50;
//            int startY = 50;
//            int endX = 450;
//            int endY = 450;
//            int circleRadius = 20;
//            int padding = 5;
//            classroom startClass = null;
//            classroom endClass = null;
//// Find start and end classes
//            for (classroom c : adjList) {
//                if (c.name.equals(finalL1)) {
//                    startClass = c;
//                }
//                if (c.name.equalsIgnoreCase(finalL)) {
//                    endClass = c;
//                }
//            }
//            // Draw edges and vertices
//            for (classroom c : adjList) {
//                Circle circle = new Circle(c.x, c.y, circleRadius);
//                circle.setFill(Color.LIGHTGRAY);
//                c.name= c.name.replace("AMANFACULTYOFFICE","");
//                c.name= c.name.replace("TABBAFACULTYOFFICE","");
//                c.name= c.name.replace("AMANCED","");
//                c.name=c.name.replace("AMAN","");
//                if(c.name.contains("STAIRS"))
//                    c.name="STAIRS";
//                Text text = new Text(c.name);
//
//                text.setX(c.x - (text.getLayoutBounds().getWidth() / 2));
//                text.setY(c.y + (text.getLayoutBounds().getHeight() / 2));
//                pane.getChildren().addAll(circle, text);
//                for (classroom adjacentClass : c.adjacent) {
//                    Line line = new Line(c.x, c.y, adjacentClass.x, adjacentClass.y);
//                    pane.getChildren().add(line);
//                }
//            }
//
//            // Highlight shortest path
//            classroom currentClass = endClass;
//            while (currentClass != startClass) {
//                for (classroom adjacentClass : currentClass.adjacent) {
//                    if (adjacentClass == adjList.get(prev[adjList.indexOf(currentClass)])) {
//                        Line line = new Line(currentClass.x, currentClass.y, adjacentClass.x, adjacentClass.y);
//                        line.setStroke(Color.BLUE);
//                        line.setStrokeWidth(3);
//                        pane.getChildren().add(line);
//                        currentClass = adjacentClass;
//                        break;
//                    }
//                }
//            }
//        });
    }
}