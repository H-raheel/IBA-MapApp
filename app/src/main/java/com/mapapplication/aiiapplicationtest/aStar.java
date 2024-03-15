package com.mapapplication.aiiapplicationtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class aStar{
    Node start;
    Node target;
    public ArrayList<Node> way;

    //aStar between two buildings
    public aStar(Node start, Node target){

        this.start=start;
        this.target=target;
        try{
            Node n=path(start,target);
        } catch (Exception e) {
            System.out.println("Invalid inputs");
        }
        way = printPath(target);
    }

    //aStar between building and a building in which class/rooms/labs is situated
    //BFS to reach class from floor entrance
    public aStar(Node start,Node target, classroom c){

        this.start=start;
        this.target=target;
        try{
            Node n=path(start,target);
        } catch (Exception e) {
            System.out.println("Invalid inputs");
        }
        way = printPath(target);
        Interior interior = new Interior(c.name);
        interior.getPath(c.name, true);

    }

    //aStar between building in which class/rooms/labs is situated and any building
    //BFS to reach entrance of the floor
    public aStar(classroom c, Node start,Node target){
        Interior interior = new Interior(c.name);
        interior.getPath(c.name, false);
        this.start=start;
        this.target=target;
        try{
            Node n=path(start,target);
        } catch (Exception e) {
            System.out.println("Invalid inputs");
        }
        way = printPath(target);

    }

    //aStar between different buildings of provided classes/rooms/labs, if different. If same, so BFS.
    public aStar(classroom c1, Node start,Node target, classroom c2){
        Interior interior1 = new Interior(c1.name);

        boolean t = false;
        if(start.name.equals("TABBAACADEMICBLOCK")){
            for(classroom c: interior1.Tabba.get(0).Floorplan.adjList){
                if(c.name.equals(c2.name)){
                    t = true;
                    MyGraph g = new MyGraph(interior1.Tabba.get(0).Floorplan.adjList);
                    g.shortestPath(c1.name, c2.name, start.name);
                }
            }
        }
        if(start.name.equals("AMANCED")){
            for(classroom c: interior1.Aman.get(0).Floorplan.adjList){
                if(c.name.equals(c2.name)){
                    t = true;
                    MyGraph g = new MyGraph(interior1.Aman.get(0).Floorplan.adjList);
                    g.shortestPath(c1.name, c2.name, start.name);
                }
            }
        }
        if(start.name.equals("STUDENTCENTRE")){
            for(classroom c: interior1.SC.get(0).Floorplan.adjList){
                if(c.name.equals(c2.name)){
                    t = true;
                    MyGraph g = new MyGraph(interior1.SC.get(0).Floorplan.adjList);
                    g.shortestPath(c1.name, c2.name, start.name);
                }
            }
        }
        if(start.name.equals("FAUJIFOUNDATIONBUILDING")){
            for(classroom c: interior1.Fauji.get(0).Floorplan.adjList){
                if(c.name.equals(c2.name)){
                    t = true;
                    MyGraph g = new MyGraph(interior1.Fauji.get(0).Floorplan.adjList);
                    g.shortestPath(c1.name, c2.name, start.name);
                }
            }
        }
        if(start.name.equals("ADAMJEEACADEMICBLOCK")){
            for(classroom c: interior1.Adamjee.get(0).Floorplan.adjList){
                if(c.name.equals(c2.name)){
                    t = true;
                    MyGraph g = new MyGraph(interior1.Adamjee.get(0).Floorplan.adjList);
                    g.shortestPath(c1.name, c2.name, start.name);
                }
            }
        }

        if(!t) {
            interior1.getPath(c1.name, false);
            this.start = start;
            this.target = target;
            try{
                Node n=path(start,target);
            } catch (Exception e) {
                System.out.println("Invalid inputs");
            }
            way = printPath(target);
            Interior interior2 = new Interior(c2.name);
            interior2.getPath(c2.name, true);
        }
    }


    //aStar code to determine path
    public Node path(Node start, Node target){
        PriorityQueue<Node> closedList = new PriorityQueue<>();
        PriorityQueue<Node> openList = new PriorityQueue<>();

        start.f = start.g + start.calculateHeuristic(target);
        //System.out.println("m1:"+start.name);
        openList.add(start);

        while(!openList.isEmpty()){
            Node n = openList.peek();
            if(n == target){
                return n;
            }

            for(Node.Edge edge : n.neighbors){
                Node m = edge.node;
                double totalWeight = n.g + edge.weight;

                if(!openList.contains(m) && !closedList.contains(m)){
                    m.parent = n;
                    m.g = totalWeight;
                    m.f = m.g + m.calculateHeuristic(target);
                    //System.out.println("m2:"+m.name);
                    openList.add(m);
                } else {
                    //System.out.println("hi");
                    if(totalWeight < m.g){
                        m.parent = n;
                        m.g = totalWeight;
                        m.f = m.g + m.calculateHeuristic(target);
                        //System.out.println("m3:"+m.name);
                        if(closedList.contains(m)){
                            closedList.remove(m);
                            openList.add(m);
                        }
                    }
                }
            }

            openList.remove(n);
            closedList.add(n);
        }
        return null;
    }

    //printing path between buildings on terminal
    public static ArrayList printPath(Node target){
        Node n = target;
        if(n==null)
            return null;
        ArrayList<Node> p = new ArrayList<>();
        List<String> ids = new ArrayList<>();

        while(n.parent != null){
            ids.add(n.name);
            //System.out.println(n.name);
            p.add(n);
            n = n.parent;
        }
        ids.add(n.name);
        p.add(n);
        Collections.reverse(ids);
        System.out.println("");
        return p;
    }

}