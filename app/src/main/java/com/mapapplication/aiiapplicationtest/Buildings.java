package com.mapapplication.aiiapplicationtest;

import java.util.ArrayList;


import java.util.ArrayList;

import java.util.ArrayList;

public class Buildings {
    public ArrayList buildings;


    Buildings(){
        buildings = new ArrayList<Node>();
        //Creating the Nodes for each building, and creating the array of hn values of each repective building
        Node AdamjeeAcademicBlock = new Node("Adamjee Academic Block",24.94027027918072, 67.11422861489089);
        double[] heuristicsA={79.68, 0, 39.47, 51.05, 76.42, 127.1, 207.41, 162.65, 209.66, 52.2, 148.1, 118.57, 103.77, 112.39, 151, 162.28, 91.87, 105.3, 60.55, 163.92, 69.21, 76.39, 68.53};
        AdamjeeAcademicBlock.h=heuristicsA;
        buildings.add(AdamjeeAcademicBlock);
        Node AdamjeeCafe = new Node("Adamjee Cafe", 24.940405259949276, 67.11373642955465);
        double[] heuristicsCafe={100.17, 51.05, 19.47, 0, 30.41, 76.07, 141.03, 135.61, 204.43, 84, 191.35, 154.58, 120.9, 97.57, 157.15, 184.9, 144.69, 60.77, 61.49, 114.6, 40.46, 107.61,114.92};
        AdamjeeCafe.h=heuristicsCafe;
        buildings.add(AdamjeeCafe);
        Node StationaryStore = new Node("Stationary Store", 24.940260550831322, 67.11382628355337);
        double [] heuristicsSS={81.18, 39.47, 0, 19.47, 49.36, 90.99, 157.11, 152.94, 218.41, 83.07, 186.76, 153.31, 125.09, 114.09, 166.68, 190.32, 130.45, 79.9, 68.8, 123.35, 56.98, 107.92,108.35};
        StationaryStore.h=heuristicsSS;
        buildings.add(StationaryStore);
        Node Roundabout = new Node("Roundabout", 24.94064464021841, 67.11358904634557);
        double [] heuristicRoundabout={127.86, 76.42, 49.36, 30.41, 0, 65.79, 114.05, 108.82, 190.11, 94.47, 202.38, 161.49, 115.94, 81.07, 146.04, 187.19, 166.31, 29.94, 62.44, 101.97, 25.95, 115.59};
        Roundabout.h=heuristicRoundabout;
        buildings.add(Roundabout);
        Node StudentCentre = new Node("Student Centre", 24.94059843069237, 67.11299896038388);
        double [] heuristicSC={155.81, 127.1, 90.99, 76.07, 65.79, 0, 73.45, 127.64, 233.2, 160.16, 268.25, 228.45, 179.38, 133.36, 204.41, 248.8, 224.21, 62.89, 128.38, 36.48, 79.65, 172.96,195.98};
        StudentCentre.h=heuristicSC;
        buildings.add(StudentCentre);
        Node CricketNets = new Node("Cricket Nets", 24.940868391362596, 67.11342543160166);
        double [] heuristicsCricketNet={158.68, 105.3, 79.9, 60.77, 29.94, 62.89, 90.35, 84.46, 174.28, 113.08, 217.57, 174.21, 119.76, 70.52, 141.33, 191.63, 192.28, 0, 75.63, 97.95, 38.63, 130.62,154.88};
        CricketNets.h=heuristicsCricketNet;
        buildings.add(CricketNets);
        Node CricketGround = new Node("Cricket Ground", 24.9410702534592, 67.11252689161451);
        double [] heuristicsCricketGround={237.4, 207.41, 157.11, 141.03, 114.05, 73.45, 0, 121.15, 220.4, 202.7, 306.85, 262.54, 203.47, 145.1, 211.77, 269.6, 281.55, 90.35, 166.05, 76.06, 128.96, 220.01,247.57};
        CricketGround.h=heuristicsCricketGround;
        buildings.add(CricketGround);
        Node SoccerField = new Node("Soccer Field", 24.941629628642513, 67.11354344879986);
        double [] heuristicsSoccer={229.69, 163.26, 152.56, 135.86, 108.82, 127.64, 121.15, 0, 101.31, 141.28, 220.99, 175.41, 111.42, 52.27, 99.66, 164.34, 233, 84.46, 108, 168.58, 96.81, 145.3,185.1};
        SoccerField.h=heuristicsSoccer;
        buildings.add(SoccerField);
        Node CarParking = new Node("Car Parking", 24.942167112829765, 67.11435079371152);
        double [] heuristicsParking={286.01, 209.66, 218.41, 204.43, 190.11, 233.2, 220.4, 101.31, 0, 166.65, 193.85, 158.19, 112.66, 107.61, 64.95, 117.94, 91.2, 174.28, 153.22, 266.34, 166.11, 154.89,197.36};
        CarParking.h=heuristicsParking;
        buildings.add(CarParking);
        Node GandTAuditorium = new Node("G&T Auditorium", 24.940712738449655, 67.11435884033803);
        double [] heuristicsAuditorium={124.61, 52.2, 83.07, 84, 94.47, 160.16, 202.7, 141.28, 166.65, 0, 107.85, 71.06, 58.84, 86.29, 104.56, 108.51, 89.19, 113.08, 38.39, 195.1, 74.01, 25.34,44.99};
        GandTAuditorium.h=heuristicsAuditorium;
        buildings.add(GandTAuditorium);
        Node FaujiGround = new Node("Fauji Ground", 24.940653936456886, 67.11533495307309);
        double[] Fg={122.79,68.53,108.35,114.92,133.84,195.98,247.57,185.1,197.37,44.99,80.97,56.99,84.55,129.04,132.39,113.06,49.83,154.88,82.47,229.96,113.49,45.03,0};
        FaujiGround.h=Fg;
        buildings.add(FaujiGround);
        Node Library = new Node("Library", 24.940962810188942, 67.11513915182215);
        double [] heuristicsLibrary={174.18, 118.54, 153.31, 154.58, 161.49, 228.45, 262.54, 175.41, 158.19, 71.06, 45.65, 0, 65.14, 123.12, 95.27, 54.17, 98.3, 174.21, 99.8, 263.41, 137.75, 46.62,56.99};
        Library.h=heuristicsLibrary;
        buildings.add(Library);
        Node MalePrayerArea = new Node("Male Prayer Area", 24.941188992834967, 67.11454906584922);
        double [] heuristicsMP={184.85, 109.88, 125.09, 120.9, 115.94, 179.38, 203.47, 111.42, 112.66, 58.84, 109.92, 65.14, 0, 58.91, 48.48, 68.83, 139.8, 119.76, 57.68, 215.82, 89.54, 42.61,84.55};
        MalePrayerArea.h=heuristicsMP;
        buildings.add(MalePrayerArea);
        Node FemalePrayerArea = new Node("Female Prayer Area", 24.940947021227203, 67.11460512423751);
        double [] heuristicsFP={152.41, 76.39, 107.92, 107.61, 115.59, 172.96, 54.84, 145.3, 154.89, 25.34, 87.04, 46.62, 42.61, 89.59, 90.97, 83.4, 93.78, 130.62, 54.84, 217.9, 92.49, 0,45.03};
        FemalePrayerArea.h=heuristicsFP;
        buildings.add(FemalePrayerArea);
        Node TabbaAcademicBlock = new Node("Tabba Academic Block", 24.941275350765313, 67.11394261863504);
        double [] heuristicstabba={177.95,108.6,114.09,97.57,81.07,133.26,145.1,52.27,107.61,86.29,168.76,123.12,58.91,0,70.62,125.59,177.64,70.52,55.43,169.63,57.69,89.59,129.04};
        TabbaAcademicBlock.h=heuristicstabba;
        buildings.add(TabbaAcademicBlock);
        Node AmanCED = new Node("AmanCED", 24.94160508530768, 67.1145452507485);
        double [] heuristicsAman={228.63,153.2,166.68,157.15,146.04,204.41,211.77,99.66,64.95,104.56,134.81,95.27,48.48,70.62,0,66.4,180.25,141.33,98.37,239.72,122.9,90.97,132.39};
        AmanCED.h=heuristicsAman;
        buildings.add(AmanCED);
        Node NationalBankOfPakistanBuilding = new Node("National Bank Of Pakistan  Building", 24.941455620060463, 67.11519871687261);
        double [] heuristicsNBP={229.83,158.56,190.32,184.9,187.19,248.8,269.6,164.34,117.94,108.51,77.75,54.17,68.83,125.59,66.4,0,155.39,191.63,127.46,287.35,158.81,83.4,113.06};
        NationalBankOfPakistanBuilding.h=heuristicsNBP;
        buildings.add(NationalBankOfPakistanBuilding);
        Node FaujiFoundationBuilding = new Node("Fauji Foundation Building", 24.940813718125618, 67.11557696191021);
        double[] heuristicsF={194.13,148.73,186.76,191.35,202.38,268.25,306.85,220.99,193.85,107.85,0,45.65,109.92,168.76,134.81,77.75,97.74,217.57,141.92,303.24,178.46,87.02,80.97};
        FaujiFoundationBuilding.h=heuristicsF;
        buildings.add(FaujiFoundationBuilding);
        Node MartinDow = new Node("Martin Dow", 24.940413361788533, 67.1124936025648);
        double[] heuristicsMartin={172.54, 163.92, 123.35, 114.6, 101.97, 36.48, 76.06, 168.58, 266.34, 195.1, 303.24, 263.41, 215.82, 169.63, 239.72, 287.35, 254.02, 97.95, 164.33, 0, 126.26, 217.9,229.96};
        MartinDow.h=heuristicsMartin;
        buildings.add(MartinDow);
        Node Gatorade = new Node("Gatorade", 24.94074966119667, 67.11378140181894);
        double [] heuristicsgatorade={136.45,70.07,55.56,39.75,25.95,79.65,128.96,96.81,166.11,74.01,181.39,138.85,90.68,57.69,122.9,158.81,154.15,38.63,39.04,126.26,0,92.49,113.49};
        Gatorade.h=heuristicsgatorade;
        buildings.add(Gatorade);
        Node Courtyard = new Node("Courtyard", 24.940792365816844, 67.1141625903847);
        double [] heuristicscourtyard={135.47,60.55,68.8,61.49,62.44,128.38,166.05,108,153.22,38.39,141.92,99.8,57.68,55.43,98.37,127.46,124.89,75.63,0,164.33,39.04,54.84,82.47};
        Courtyard.h=heuristicscourtyard;
        buildings.add(Courtyard);
        Node Gate2 = new Node("Gate2", 24.94046793654129, 67.11589299969988);
        double [] heuristicsg2={116.88, 91.58, 130.45, 144.69, 166.31, 224.21, 281.55, 233, 91.2, 89.19, 97.74, 98.3, 139.8, 177.64, 180.25, 155.39, 0, 192.28, 124.89, 254.02, 154.15, 93.78,49.83};
        Gate2.h=heuristicsg2;
        buildings.add(Gate2);
        Node Gate4 = new Node("Gate4", 24.93972664058085, 67.11414727088317);
        double [] heuristics4={0, 82.13, 80.76, 96.81, 127.86, 155.81, 237.4, 230.44, 286.01, 114.39, 194.13, 174.18, 184.85, 177.95, 228.63, 229.8, 116.88, 158.68, 135.47, 172.58, 136.45, 152.41, 122.79};
        Gate4.h=heuristics4;
        buildings.add(Gate4);

        //Creating all branches between adjacent buildings along with their gn balue
        AdamjeeAcademicBlock.addBranch(190, AdamjeeCafe);
        AdamjeeAcademicBlock.addBranch(170,  StationaryStore);
        AdamjeeAcademicBlock.addBranch(80, GandTAuditorium);
        AdamjeeAcademicBlock.addBranch(130,  FaujiGround);
        AdamjeeAcademicBlock.addBranch(210, Roundabout);
        AdamjeeAcademicBlock.addBranch(120, Gate4);
        StationaryStore.addBranch(20, AdamjeeCafe);
        Roundabout.addBranch(40,TabbaAcademicBlock);
        Roundabout.addBranch(40,StudentCentre);
        Roundabout.addBranch(30,CricketNets);
        StudentCentre.addBranch(50, MartinDow);
        StudentCentre.addBranch(60, CricketGround);
        StudentCentre.addBranch(80, CricketNets );
        CricketNets.addBranch(60, TabbaAcademicBlock);
        CricketNets.addBranch(50, Gatorade);
        CricketGround.addBranch(300, SoccerField);
        SoccerField.addBranch(400,CarParking);
        CarParking.addBranch(200, NationalBankOfPakistanBuilding);
        GandTAuditorium.addBranch(70, FemalePrayerArea);
        GandTAuditorium.addBranch(20, FaujiGround);
        GandTAuditorium.addBranch(30, Courtyard );
        FemalePrayerArea.addBranch(40, Library);
        FemalePrayerArea.addBranch(50, MalePrayerArea );
        FemalePrayerArea.addBranch(30, FaujiGround);
        FaujiGround.addBranch(20, FaujiFoundationBuilding);
        FaujiGround.addBranch(20, Library);
        FaujiGround.addBranch(20, Gate2);
        Library.addBranch(70, FaujiFoundationBuilding);
        MalePrayerArea.addBranch(110, Courtyard);
        MalePrayerArea.addBranch(130, NationalBankOfPakistanBuilding);
        MalePrayerArea.addBranch(280, AmanCED);
        MalePrayerArea.addBranch(300, TabbaAcademicBlock);
        TabbaAcademicBlock.addBranch(100, Gatorade);
        AmanCED.addBranch(150, NationalBankOfPakistanBuilding);
        Gatorade.addBranch(40, Courtyard);
        Gatorade.addBranch(20, Roundabout);
        AmanCED.addBranch(350, TabbaAcademicBlock);
        System.out.println();

    }

    //printing all the buildings along with the list of buildings which are adjacent to them
    public void printAll(ArrayList<Node> a){
        for(Node n : a){
            System.out.println();
            System.out.print(n.name+" -> ");
            for(Node.Edge friends: n.neighbors){
                System.out.print(friends.node.name+" , ");
            }

        }
    }
}