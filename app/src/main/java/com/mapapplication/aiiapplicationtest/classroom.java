package com.mapapplication.aiiapplicationtest;

import java.util.LinkedList;

import java.util.LinkedList;

public class classroom {

    //variables declaration
    String name;
    int x=0;
    int y=0;
    LinkedList<classroom> adjacent = new LinkedList<>();
    boolean isentrance;

    //updating names of classes accordingly
    classroom(String d) {
        d=d.toUpperCase();
        d=d.replace(" ","");
        d=d.replace("/","");
        d=d.replace("-","");

        name = d;
    }

}

