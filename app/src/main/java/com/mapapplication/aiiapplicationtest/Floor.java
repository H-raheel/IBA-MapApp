package com.mapapplication.aiiapplicationtest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Floor {

    String name;
    MyGraph Floorplan;

    Floor(String d) {
        name = d;
    }

    //calls BFS for two conditions:
    //1. From entrance of floor to class
    //2. From class to floor entrance
    public void findpath(String target, boolean b){
        if(b) Floorplan.shortestPath("ENTRANCE "+name,target,name);
        else {Floorplan.shortestPath(target, "ENTRANCE "+name,name);}
    }
}