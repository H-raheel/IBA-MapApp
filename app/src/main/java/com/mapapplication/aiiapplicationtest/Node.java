package com.mapapplication.aiiapplicationtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node implements Comparable<Node> {

    // Parent in the path
    public Node parent = null;

    public List<Edge> neighbors;

    // Evaluation functions
    public double f;
    public double g;

    public double[] h=new double[23];

    public String name;
    public double longitude;
    public double latitude;

    //Constructing Node constructors and updating the name accordingly
    Node(String name, double longitude, double latitude){
        name= name.replace(" ","");
        name=name.toUpperCase();
        this.name = name;
        this.h = h;
        this.longitude = longitude;
        this.latitude = latitude;
        this.neighbors = new ArrayList<>();
    }


    Node(String name){
        name= name.replace(" ","");
        name=name.toUpperCase();
        this.name = name;
        this.h = h;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public int compareTo(Node n) {
        return Double.compare(this.f, n.f);
    }

    //Another static class Edge\
    public static class Edge {
        Edge(int weight, Node node){
            this.weight = weight;
            this.node = node;
        }

        public int weight;
        public Node node;

        public Node getNode(){
            return node;
        }

        public int getWeight() {
            return weight;
        }
    }

    //Creating edge between adjacent buildings
    public void addBranch(int weight, Node node){
        Edge newEdge = new Edge(weight, node);
        neighbors.add(newEdge);
        newEdge = new Edge(weight, this);
        node.neighbors.add(newEdge);
    }

    //Finding the desired heuristic value, given that target name is passed as parameter
    public double calculateHeuristic(Node target){
        target.name= target.name.replace(" ","");
        if (target.name.equalsIgnoreCase("ADAMJEEACADEMICBLOCK"))
            return h[1];
        if (target.name.equalsIgnoreCase("ADAMJECAFE"))
            return h[3];
        if (target.name.equalsIgnoreCase("STATIONARYSTORE"))
            return h[2];
        if (target.name.equalsIgnoreCase("ROUNDABOUT"))
            return h[4];
        if (target.name.equalsIgnoreCase("STUDENTCENTRE"))
            return h[5];
        if (target.name.equalsIgnoreCase("CRICKETNETS"))
            return h[17];
        if (target.name.equalsIgnoreCase("CRICKETGROUND"))
            return h[6];
        if (target.name.equalsIgnoreCase("SOCCERFIELD"))
            return h[7];
        if (target.name.equalsIgnoreCase("CARPARKING"))
            return h[8];
        if (target.name.equalsIgnoreCase("G&TAUDITORIUM"))
            return h[9];
        if (target.name.equalsIgnoreCase("LIBRARY"))
            return h[11];
        if (target.name.equalsIgnoreCase("MALEPRAYERAREA"))
            return h[12];
        if (target.name.equalsIgnoreCase("FEMALEPRAYERAREA"))
            return h[21];
        if (target.name.equalsIgnoreCase("TABBAACADEMICBLOCK"))
            return h[13];
        if (target.name.equalsIgnoreCase("FAUJIGROUND"))
            return h[22];
        if (target.name.equalsIgnoreCase("AMANCED"))
            return h[14];
        if (target.name.equalsIgnoreCase("NATIONALBANKOFPAKISTANBUILDING"))
            return h[15];
        if (target.name.equalsIgnoreCase("FAUJIFOUNDATIONBUILDING"))
            return h[10];
        if (target.name.equalsIgnoreCase("MARTINDOW"))
            return h[19];
        if (target.name.equalsIgnoreCase("GATORADE"))
            return h[20];
        if (target.name.equalsIgnoreCase("COURTYARD"))
            return h[18];
        if (target.name.equalsIgnoreCase("GATE2"))
            return h[16];
        if (target.name.equalsIgnoreCase("GATE4"))
            return h[0];
        else
            return 0;

    }

    //Get functions
    public List<Edge> getNeighbors() {
        return neighbors;
    }

    public String getName() {
        return name;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

}
