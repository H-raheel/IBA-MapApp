package com.mapapplication.aiiapplicationtest;
import java.util.ArrayList;

public class Interior {

    //Creating arraylist for each building
    ArrayList<Floor> Tabba=new ArrayList<Floor>();
    ArrayList<Floor> Aman=new ArrayList<Floor>();
    ArrayList<Floor> Adamjee=new ArrayList<Floor>();
    ArrayList<Floor> SC=new ArrayList<Floor>();
    ArrayList<Floor> Fauji=new ArrayList<Floor>();

    //Based on passed parameter string(names of class/room) creating an arraylist of the floor where class/room is located\
    //Creating edges between adjacent classes
    //Assigning x and y coordinates to each room/class in the arraylist for creating floor map
    Interior(String word){
        if(word.equals("MTS6") || word.equals("SEMINARROOM6") || word.equals("BREAKOUT1") ||
                word.equals("MTS7") || word.equals("SEMINARROOM7") || word.equals("BREAKOUT2") ||
                word.equals("MTS8") || word.equals("AILAB") || word.equals("IRLAB") || word.equals("BDALAB") ||
                word.equals("WEBSNLAB") || word.equals("ROBOTICSLAB")) {
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Tabba-North Ground Floor");
            entrance.isentrance=true;
            entrance.x=100;
            entrance.y=500;
            classes.add(entrance);
            classroom mts6 = new classroom("MTS6");
            mts6.x=100;
            mts6.y=100;
            classes.add(mts6);
            classroom seminarroom6 = new classroom("Seminar Room 6");
            seminarroom6.x=200;
            seminarroom6.y=100;
            classes.add(seminarroom6);
            classroom breakout1 = new classroom("Breakout 1");
            breakout1.x=300;
            breakout1.y=100;
            classes.add(breakout1);
            classroom mts7 = new classroom("MTS7");
            mts7.x=400;
            mts7.y=100;
            classes.add(mts7);
            classroom seminarroom7 = new classroom("Seminar Room 7");
            seminarroom7.x=500;
            seminarroom7.y=100;
            classes.add(seminarroom7);
            classroom breakout2 = new classroom("Breakout 2");
            breakout2.x=600;
            breakout2.y=100;
            classes.add(breakout2);
            classroom ailab = new classroom("AI Lab");
            ailab.x=700;
            ailab.y=100;
            classes.add(ailab);
            classroom roboticslab = new classroom("Robotics Lab");
            roboticslab.x=800;
            roboticslab.y=100;
            classes.add(roboticslab);
            classroom irlab = new classroom("IR Lab");
            irlab.x=900;
            irlab.y=100;
            classes.add(irlab);
            classroom websnlab = new classroom("Web SN Lab");
            websnlab.x=1000;
            websnlab.y=100;
            classes.add(websnlab);
            classroom bdalab = new classroom("BDA Lab");
            bdalab.x=1100;
            bdalab.y=100;
            classes.add(bdalab);
            classroom mts8 = new classroom("MTS8");
            mts8.x=1100;
            mts8.y=300;
            classes.add(mts8);
            MyGraph g = new MyGraph(classes);
            g.AddEdge(mts6, seminarroom6);
            g.AddEdge(seminarroom6, breakout1);
            g.AddEdge(mts6, mts7);
            g.AddEdge(mts7, breakout2);
            g.AddEdge(breakout2, seminarroom7);
            g.AddEdge(mts7, ailab);
            g.AddEdge(ailab, roboticslab);
            g.AddEdge(roboticslab, irlab);
            g.AddEdge(irlab, websnlab);
            g.AddEdge(websnlab, bdalab);
            g.AddEdge(bdalab, mts8);
            g.AddEdge(entrance,mts7);

            //TABBA BUILDING-ADD FLOORS HERE
            Floor f1 = new Floor("Tabba-North Ground Floor");
            f1.Floorplan=g;
            Tabba.add(f1);}

        if(word.equals("ITROOM") || word.equals("TABBAFACULTYOFFICE100") || word.equals("TABBAFACULTYOFFICE101") ||
                word.equals("TABBAFACULTYOFFICE102") || word.equals("MTC16") || word.equals("PHDSCHOLARS") ||
                word.equals("MTC17") || word.equals("MTC18") || word.equals("MTC19") || word.equals("MTC20") ||
                word.equals("MTC20A")) {
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Tabba-North First Floor");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom itroom = new classroom("IT Room");
            classes.add(itroom);
            classroom facultyoffice100 = new classroom("Tabba - Faculty Office 100");
            classes.add(facultyoffice100);
            classroom facultyoffice101 = new classroom("Tabba - Faculty Office 101");
            classes.add(facultyoffice101);
            classroom facultyoffice102 = new classroom("Tabba - Faculty Office 102");
            classes.add(facultyoffice102);
            classroom mtc16 = new classroom("MTC 16");
            classes.add(mtc16);
            classroom phdscholars = new classroom("Phd Scholars");
            classes.add(phdscholars);
            classroom mtc17 = new classroom("MTC 17");
            classes.add(mtc17);
            classroom mtc18 = new classroom("MTC 18");
            classes.add(mtc18);
            classroom mtc19 = new classroom("MTC 19");
            classes.add(mtc19);
            classroom mtc20 = new classroom("MTC 20");
            classes.add(mtc20);
            classroom mtc20a = new classroom("MTC 20-A");
            classes.add(mtc20a);

            MyGraph g = new MyGraph(classes);
            g.AddEdge(itroom, facultyoffice100);
            g.AddEdge(facultyoffice100, facultyoffice101);
            g.AddEdge(facultyoffice101, facultyoffice102);
            g.AddEdge(facultyoffice102, mtc16);
            g.AddEdge(mtc16, phdscholars);
            g.AddEdge(phdscholars, mtc17);
            g.AddEdge(phdscholars, entrance);
            g.AddEdge(mtc17, mtc18);
            g.AddEdge(mtc18, mtc19);
            g.AddEdge(mtc19, mtc20);
            g.AddEdge(mtc20, mtc20a);
            //TABBA BUILDING-ADD FLOORS HERE
            Floor f2 = new Floor("Tabba-North First Floor");
            f2.Floorplan=g;
            Tabba.add(f2);}

        if(word.equals("TABBAFACULTYOFFICE204") || word.equals("TABBAFACULTYOFFICE205") || word.equals("TABBAFACULTYOFFICE206") ||
                word.equals("TABBAFACULTYOFFICE207") || word.equals("TABBAFACULTYOFFICE208") || word.equals("TABBAFACULTYOFFICE209") ||
                word.equals("TABBAFACULTYOFFICE210") || word.equals("TABBAFACULTYOFFICE211") || word.equals("CONFERENCEROOM")){
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Tabba-North Second Floor");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom facultyoffice204 = new classroom("Tabba - Faculty Office 204");
            classes.add(facultyoffice204);
            classroom facultyoffice205 = new classroom("Tabba - Faculty Office 205");
            classes.add(facultyoffice205);
            classroom facultyoffice206 = new classroom("Tabba - Faculty Office 206");
            classes.add(facultyoffice206);
            classroom facultyoffice207 = new classroom("Tabba - Faculty Office 207");
            classes.add(facultyoffice207);
            classroom facultyoffice208 = new classroom("Tabba - Faculty Office 208");
            classes.add(facultyoffice208);
            classroom facultyoffice209 = new classroom("Tabba - Faculty Office 209");
            classes.add(facultyoffice209);
            classroom facultyoffice210 = new classroom("Tabba - Faculty Office 210");
            classes.add(facultyoffice210);
            classroom facultyoffice211 = new classroom("Tabba - Faculty Office 211");
            classes.add(facultyoffice211);
            classroom conferenceroom = new classroom("Conference Room");
            classes.add(conferenceroom);

            MyGraph g = new MyGraph(classes);
            g.AddEdge(entrance, facultyoffice204);
            g.AddEdge(facultyoffice204, facultyoffice205);
            g.AddEdge(facultyoffice205, facultyoffice206);
            g.AddEdge(facultyoffice206, facultyoffice207);
            g.AddEdge(facultyoffice207, facultyoffice208);
            g.AddEdge(facultyoffice208, facultyoffice209);
            g.AddEdge(facultyoffice209, facultyoffice210);
            g.AddEdge(facultyoffice210, facultyoffice211);
            g.AddEdge(facultyoffice211, conferenceroom);
            //TABBA BUILDING-ADD FLOORS HERE
            Floor f3 = new Floor("Tabba-North Second Floor");
            f3.Floorplan=g;
            Tabba.add(f3);}

        if(word.equals("TABBAFACULTYOFFICE235") || word.equals("TABBAFACULTYOFFICE234") || word.equals("TABBAFACULTYOFFICE233") ||
                word.equals("TABBAFACULTYOFFICE232") || word.equals("TABBAFACULTYOFFICE231") || word.equals("TABBAFACULTYOFFICE230") ||
                word.equals("TABBAFACULTYOFFICE229") || word.equals("TABBAFACULTYOFFICE228") || word.equals("TABBAFACULTYLOUNGE")){
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Tabba-South Second Floor");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom facultyoffice235 = new classroom("Tabba - Faculty Office 235");
            classes.add(facultyoffice235);
            classroom facultyoffice234 = new classroom("Tabba - Faculty Office 234");
            classes.add(facultyoffice234);
            classroom facultyoffice233 = new classroom("Tabba - Faculty Office 233");
            classes.add(facultyoffice233);
            classroom facultyoffice232 = new classroom("Tabba - Faculty Office 232");
            classes.add(facultyoffice232);
            classroom facultyoffice231 = new classroom("Tabba - Faculty Office 231");
            classes.add(facultyoffice231);
            classroom facultyoffice230 = new classroom("Tabba - Faculty Office 230");
            classes.add(facultyoffice230);
            classroom facultyoffice229 = new classroom("Tabba - Faculty Office 229");
            classes.add(facultyoffice229);
            classroom facultyoffice228 = new classroom("Tabba - Faculty Office 228");
            classes.add(facultyoffice228);
            classroom facultylounge = new classroom("Faculty Lounge");
            classes.add(facultylounge);

            MyGraph g = new MyGraph(classes);
            g.AddEdge(entrance, facultyoffice235);
            g.AddEdge(facultyoffice235, facultyoffice234);
            g.AddEdge(facultyoffice234, facultyoffice233);
            g.AddEdge(facultyoffice233, facultyoffice232);
            g.AddEdge(facultyoffice232, facultyoffice231);
            g.AddEdge(facultyoffice231, facultyoffice230);
            g.AddEdge(facultyoffice230, facultyoffice229);
            g.AddEdge(facultyoffice229, facultyoffice228);
            g.AddEdge(facultyoffice228, facultylounge);
            g.AddEdge(entrance, facultyoffice235);
            //TABBA BUILDING-ADD FLOORS HERE
            Floor f4 = new Floor("Tabba-South Second Floor");
            f4.Floorplan=g;
            Tabba.add(f4);}

        if(word.equals("TABBAFACULTYOFFICE122") || word.equals("TABBAFACULTYOFFICE123") ||
                word.equals("MTC21") || word.equals("PHDSCHOLARS") ||
                word.equals("MTC22") || word.equals("MTC23") || word.equals("MTC24") || word.equals("MTC25") ||
                word.equals("MTC26")){
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Tabba-South First Floor");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom facultyoffice122 = new classroom("Tabba - Faculty Office 122");
            classes.add(facultyoffice122);
            classroom facultyoffice123 = new classroom("Tabba - Faculty Office 123");
            classes.add(facultyoffice123);
            classroom mtc21 = new classroom("MTC 21");
            classes.add(mtc21);
            classroom phdscholars = new classroom("Phd Scholars");
            classes.add(phdscholars);
            classroom mtc22 = new classroom("MTC 22");
            classes.add(mtc22);
            classroom mtc23 = new classroom("MTC 23");
            classes.add(mtc23);
            classroom mtc24 = new classroom("MTC 24");
            classes.add(mtc24);
            classroom mtc25 = new classroom("MTC 25");
            classes.add(mtc25);
            classroom mtc26 = new classroom("MTC 26");
            classes.add(mtc26);

            MyGraph g = new MyGraph(classes);
            g.AddEdge(facultyoffice122, facultyoffice123);
            g.AddEdge(facultyoffice123, mtc21);
            g.AddEdge(mtc21, entrance);
            g.AddEdge(mtc21, phdscholars);
            g.AddEdge(phdscholars, mtc22);
            g.AddEdge(mtc22, mtc23);
            g.AddEdge(mtc23, mtc24);
            g.AddEdge(mtc24, mtc25);
            g.AddEdge(mtc25, mtc26);
            //TABBA BUILDING-ADD FLOORS HERE
            Floor f5 = new Floor("Tabba-South First Floor");
            f5.Floorplan=g;
            Tabba.add(f5);}

        if(word.equals("MTL4") || word.equals("GAMELAB") || word.equals("MTC27") || word.equals("MTC28") ||
                word.equals("MTC29"))
        {
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Tabba-South Ground Floor");
            classes.add(entrance);
            classroom mtl4 = new classroom("MTL 4");
            classes.add(mtl4);
            classroom gamelab = new classroom("GAME LAB");
            classes.add(gamelab);
            classroom mtc27 = new classroom("MTC 27");
            classes.add(mtc27);
            classroom mtc28 = new classroom("MTC 28");
            classes.add(mtc28);
            classroom mtc29 = new classroom("MTC 29");
            classes.add(mtc29);

            MyGraph g = new MyGraph(classes);
            g.AddEdge(entrance, mtl4);
            g.AddEdge(mtl4, gamelab);
            g.AddEdge(gamelab, mtc29);
            g.AddEdge(mtc29, mtc28);
            g.AddEdge(mtc28, mtc27);

            //TABBA BUILDING-ADD FLOORS HERE
            Floor f6 = new Floor("Tabba-South Ground Floor");
            f6.Floorplan=g;
            Tabba.add(f6);}

        for(int i=0;i< Tabba.size();i++){
            Floor f=Tabba.get(i);
            int x1=100;
            for(int j=0;j<f.Floorplan.adjList.size();j++){
                classroom c=f.Floorplan.adjList.get(j);
                System.out.println(c.name);
                if(c.isentrance){
                    c.x=100;
                    c.y=500;
                }
                else if (c.x==0 && c.y==0){
                    c.x=x1;
                    x1=x1+100;
                    c.y=100;}
            }
        }

        if(word.equals("ELEVATORGROUND") || word.equals("STAIRS1GROUND") ||
                word.equals("FINANCELAB") || word.equals("MCC13") ||
                word.equals("MCC14") || word.equals("NEUROMARKETINGLAB") || word.equals("STAIRS2GROUND") ||
                word.equals("MCC12") || word.equals("MCC10") || word.equals("MCC9") ||
                word.equals("SITTINGAREA") || word.equals("FACULTYOFFICEG03") || word.equals("FACULTYOFFICEG08") ||
                word.equals("FACULTYOFFICEG02") || word.equals("CONFERENCEROOM") ||
                word.equals("STAIRS3GROUND") ||word.equals("MCS3"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance AmanCED - Ground");
            entrance.isentrance=true;
            entrance.x=900;entrance.y=400;
            classes.add(entrance);
            classroom elevatorground = new classroom("Elevator - Ground");
            elevatorground.x=750;elevatorground.y=400;
            classes.add(elevatorground);
            classroom amaninchargeroom=new classroom("INCHARGEAMAN");
            amaninchargeroom.x=500;amaninchargeroom.y=350;
            classes.add(amaninchargeroom);
            classroom stairs1ground = new classroom("Stairs1 - Ground");
            stairs1ground.x=600;stairs1ground.y=400;
            classes.add(stairs1ground);
            classroom financelab = new classroom("Finance Lab");
            financelab.x=800;financelab.y=250;
            classes.add(financelab);
            classroom mcc13 = new classroom("MCC 13");
            mcc13.x=700;mcc13.y=100;
            classes.add(mcc13);
            classroom mcc14 = new classroom("MCC 14");
            mcc14.x=800;mcc14.y=100;
            classes.add(mcc14);

            classroom neuromarketinglab = new classroom("Neuro-Marketing Lab");
            neuromarketinglab.x=900;neuromarketinglab.y=100;
            classes.add(neuromarketinglab);
            classroom stairs2ground = new classroom("Stairs2 - Ground");
            stairs2ground.x=1200;stairs2ground.y=100;
            classes.add(stairs2ground);
            classroom mcc12 = new classroom("MCC 12");
            mcc12.x=600;mcc12.y=100;
            classes.add(mcc12);
            classroom mcc11 = new classroom("MCC 11");
            mcc11.x=300;mcc11.y=300;
            classes.add(mcc11);
            classroom mcc10 = new classroom("MCC 10");
            mcc10.x=300;mcc10.y=400;
            classes.add(mcc10);
            classroom mcc9 = new classroom("MCC 9");
            mcc9.x=300;mcc9.y=500;
            classes.add(mcc9);
            classroom sittingarea = new classroom("Aman Sitting Area");
            sittingarea.x=500;sittingarea.y=100;
            classes.add(sittingarea);
            classroom facultyofficeg03 = new classroom("Faculty Office G-03");
            facultyofficeg03.x=300;facultyofficeg03.y=500;
            classes.add(facultyofficeg03);
            classroom facultyofficeg02 = new classroom("Faculty Office G-02");
            facultyofficeg02.x=300;facultyofficeg02.y=550;
            classes.add(facultyofficeg02);
            classroom facultyofficeg08 = new classroom("Faculty Office G-08");
            facultyofficeg08.x=300;facultyofficeg08.y=200;
            classes.add(facultyofficeg08);
            classroom conferenceroom = new classroom("Conference Room");
            conferenceroom.x=375;conferenceroom.y=400;
            classes.add(conferenceroom);
            classroom stairs3ground = new classroom("Stairs3 - Ground");
            stairs3ground.x=375;stairs3ground.y=600;
            classes.add(stairs3ground);
            classroom mcs3 = new classroom("MCS 3");
            mcs3.x=375;mcs3.y=550;
            classes.add(mcs3);

            MyGraph g = new MyGraph(classes);
            g.AddEdge(amaninchargeroom,stairs1ground);
            g.AddEdge(conferenceroom,amaninchargeroom);
            g.AddEdge(entrance, elevatorground);
            g.AddEdge(elevatorground, stairs1ground);
            g.AddEdge(elevatorground, financelab);
            g.AddEdge(financelab, mcc13);
            g.AddEdge(mcc13, mcc14);
            g.AddEdge(mcc14, neuromarketinglab);
            g.AddEdge(neuromarketinglab, stairs2ground);
            g.AddEdge(mcc12, mcc13);
            g.AddEdge(financelab, mcc12);
            g.AddEdge(mcc12, sittingarea);
            g.AddEdge(sittingarea, facultyofficeg08);
            g.AddEdge(facultyofficeg08, mcc11);
            g.AddEdge(mcc11, mcc10);
            g.AddEdge(mcc10, mcc9);
            g.AddEdge(mcc9, facultyofficeg03);
            g.AddEdge(facultyofficeg03, facultyofficeg02);
            g.AddEdge(facultyofficeg02, stairs3ground);
            g.AddEdge(mcs3, conferenceroom);
            g.AddEdge(mcs3, stairs3ground);
            g.AddEdge(financelab,stairs2ground);

            //AMAN BUILDING-ADD FLOORS HERE
            Floor f7 = new Floor("AmanCED - Ground");
            f7.Floorplan=g;
            Aman.add(f7);}

        if(word.equals("ELEVATORSECOND") || word.equals("STAIRS1SECOND") || word.equals("STAIRS2SECOND") ||
                word.equals("STAIRS3SECOND") || word.equals("AMANFACULTYOFFICE204") || word.equals("AMANFACULTYOFFICE205") ||
                word.equals("AMANFACULTYOFFICE206") || word.equals("AMANFACULTYOFFICE207") || word.equals("AMANFACULTYOFFICE208")
                || word.equals("AMANFACULTYOFFICE209") || word.equals("AMANFACULTYOFFICE218") || word.equals("AMANFACULTYOFFICE219")
                || word.equals("AMANFACULTYOFFICE229") || word.equals("AMANFACULTYOFFICE232") || word.equals("AMANFACULTYOFFICE233")
                || word.equals("MCL3") || word.equals("MCL1") || word.equals("MCS5") || word.equals("MCC15")
                || word.equals("MBAEXECUTIVEPROGRAMOFFICE") || word.equals("ACCREDITIONOFFICESBS") || word.equals("AMANFACULTYLOUNGE")){

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("EntranceAmanced - Second");
            entrance.x=800;entrance.y=400;
            entrance.isentrance=true;
            classes.add(entrance);
            classroom elevatorsecond = new classroom("ELEVATORSECOND");
            elevatorsecond.x=700;elevatorsecond.y=400;
            classes.add(elevatorsecond);
            classroom stairs1second = new classroom("STAIRS1SECOND");
            stairs1second.x=600;stairs1second.y=400;
            classes.add(stairs1second);
            classroom mcl1 = new classroom("MCL1");
            mcl1.x=300;mcl1.y=500;
            classes.add(mcl1);
            classroom mcl3 = new classroom("MCL3");
            mcl3.x=850;mcl3.y=300;
            classes.add(mcl3);
            classroom mbapo = new classroom("MBAEXECUTIVEPROGRAMOFFICE");
            mbapo.x=300;mbapo.y=100;
            classes.add(mbapo);
            classroom stairs2second = new classroom("STAIRS2SECOND");
            stairs2second.x=1200;stairs2second.y=100;
            classes.add(stairs2second);
            classroom mcc15 = new classroom("MCC15");
            mcc15.x=600;mcc15.y=100;
            classes.add(mcc15);
            classroom accreditionofficesbs = new classroom("ACCREDITIONOFFICESBS");
            accreditionofficesbs.x=700;accreditionofficesbs.y=100;
            classes.add(accreditionofficesbs);

            classroom mcs5 = new classroom("MCS5");
            mcs5.x=300;mcs5.y=550;
            classes.add(mcs5);
            classroom facultylounge = new classroom("AMANFACULTYLOUNGE");
            facultylounge.x=300;facultylounge.y=550;
            classes.add(facultylounge);
            classroom facultyoffice204 = new classroom("AMANFACULTYOFFICE204");
            facultyoffice204.x=300;facultyoffice204.y=400;
            classes.add(facultyoffice204);
            classroom facultyoffice205 = new classroom("AMANFACULTYOFFICE205");
            facultyoffice205.x=300;facultyoffice205.y=400;
            classes.add(facultyoffice205);
            classroom facultyoffice206 = new classroom("AMANFACULTYOFFICE206");
            facultyoffice206.x=300;facultyoffice206.y=350;
            classes.add(facultyoffice206);
            classroom facultyoffice207 = new classroom("AMANFACULTYOFFICE207");
            facultyoffice207.x=300;facultyoffice207.y=300;
            classes.add(facultyoffice207);
            classroom facultyoffice208 = new classroom("AMANFACULTYOFFICE208");
            facultyoffice208.x=300;facultyoffice208.y=250;
            classes.add(facultyoffice208);
            classroom facultyoffice209 = new classroom("AMANFACULTYOFFICE209");
            facultyoffice209.x=300;facultyoffice209.y=250;
            classes.add(facultyoffice209);
            classroom facultyoffice218 = new classroom("AMANFACULTYOFFICE218");
            facultyoffice218.x=350;facultyoffice218.y=500;
            classes.add(facultyoffice218);
            classroom facultyoffice219 = new classroom("AMANFACULTYOFFICE219");
            facultyoffice219.x=350;facultyoffice219.y=450;
            classes.add(facultyoffice219);
            classroom facultyoffice232 = new classroom("AMANFACULTYOFFICE232");
            facultyoffice232.x=900;facultyoffice232.y=100;
            classes.add(facultyoffice232);
            classroom facultyoffice233 = new classroom("AMANFACULTYOFFICE233");
            facultyoffice233.x=1000;facultyoffice233.y=100;
            classes.add(facultyoffice233);
            classroom facultyoffice229 = new classroom("AMANFACULTYOFFICE229");
            facultyoffice229.x=350;facultyoffice229.y=80;
            classes.add(facultyoffice229);
            classroom stairs3second = new classroom("STAIRS3SECOND");
            stairs3second.x=300;stairs3second.y=600;
            classes.add(stairs3second);

            MyGraph g = new MyGraph(classes);
            g.AddEdge(accreditionofficesbs,mcc15);
            g.AddEdge(stairs1second,facultyoffice219);
            g.AddEdge(stairs2second,facultyoffice233);
            g.AddEdge(entrance, elevatorsecond);
            g.AddEdge(elevatorsecond, stairs1second);
            g.AddEdge(elevatorsecond, mcl3);
            g.AddEdge(mcl3, stairs2second);
            g.AddEdge(mcl3, facultyoffice233);
            g.AddEdge(facultyoffice233, facultyoffice232);
            g.AddEdge(facultyoffice232, accreditionofficesbs);
            g.AddEdge(mcl3, mcc15);
            g.AddEdge(mcc15, facultyoffice229);
            g.AddEdge(facultyoffice229, mbapo);
            g.AddEdge(mbapo, facultyoffice209);
            g.AddEdge(facultyoffice209, facultyoffice208);
            g.AddEdge(facultyoffice208, facultyoffice207);
            g.AddEdge(facultyoffice207, facultyoffice206);
            g.AddEdge(facultyoffice206, facultyoffice205);
            g.AddEdge(facultyoffice205, facultyoffice204);
            g.AddEdge(facultyoffice204, mcl1);
            g.AddEdge(mcl1, facultylounge);
            g.AddEdge(facultylounge, stairs3second);
            g.AddEdge(facultylounge, mcs5);
            g.AddEdge(mcs5, facultyoffice218);
            g.AddEdge(facultyoffice218, facultyoffice219);
            g.AddEdge(mcl1,facultyoffice218 );
            g.AddEdge(facultyoffice204, facultyoffice219);


            //AMAN BUILDING-ADD FLOORS HERE
            Floor f8 = new Floor("AmanCED - Second");
            f8.Floorplan=g;
            Aman.add(f8);}

        if(word.equals("ELEVATORFIRST") || word.equals("STAIRS1FIRST") || word.equals("STAIRS2FIRST") ||
                word.equals("STAIRS3FIRST") || word.equals("AMANFACULTYOFFICE126") || word.equals("AMANFACULTYOFFICE127") ||
                word.equals("AMANFACULTYOFFICE133") || word.equals("AMANFACULTYOFFICE134") || word.equals("AMANFACULTYOFFICE135") ||
                word.equals("AMANFACULTYOFFICE136") || word.equals("AMANFACULTYOFFICE137") || word.equals("AMANFACULTYOFFICE138") ||
                word.equals("AMANFACULTYOFFICE103") || word.equals("AMANFACULTYOFFICE104") || word.equals("AMANFACULTYOFFICE105") ||
                word.equals("AMANFACULTYOFFICE106") || word.equals("AMANFACULTYOFFICE107") || word.equals("AMANFACULTYOFFICE108") ||
                word.equals("AMANFACULTYOFFICE109") || word.equals("AMANFACULTYOFFICE110") || word.equals("MCL2") || word.equals("MCL1") ||
                word.equals("MCS4") || word.equals("CEDOFFICE") || word.equals("ELECTRICROOM") || word.equals("DEANOFFICESBS")
        )

        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("ENTRANCEAMANCEDFIRST");
            entrance.x=800;entrance.y=400;
            entrance.isentrance=true;
            classes.add(entrance);
            classroom stairs1first = new classroom("STAIRS1FIRST");
            stairs1first.x=600;stairs1first.y=400;
            classes.add(stairs1first);
            classroom stairs2first = new classroom("STAIRS2FIRST");
            stairs2first.x=1200;
            stairs2first.y=100;
            classes.add(stairs2first);
            classroom elevatorfirst= new classroom("ELEVATORFIRST");
            elevatorfirst.x=700;elevatorfirst.y=400;
            classes.add(elevatorfirst);
            classroom facultyoffice126 = new classroom("AMANFACULTYOFFICE126");
            facultyoffice126.x=800;facultyoffice126.y=150;
            classes.add(facultyoffice126);
            classroom facultyoffice127 = new classroom("AMANFACULTYOFFICE127");
            facultyoffice127.x=1000; facultyoffice127.y=150;
            classes.add(facultyoffice127);
            classroom facultyoffice133 = new classroom("AMANFACULTYOFFICE133");
            facultyoffice133.x=600;facultyoffice133.y=100;
            classes.add(facultyoffice133);
            classroom facultyoffice134 = new classroom("AMANFACULTYOFFICE134");
            facultyoffice134.x=700; facultyoffice134.y=100;
            classes.add(facultyoffice134);
            classroom facultyoffice135 = new classroom("AMANFACULTYOFFICE135");
            facultyoffice135.x=800;facultyoffice135.y=100;
            classes.add(facultyoffice135);
            classroom facultyoffice136 = new classroom("AMANFACULTYOFFICE136");
            facultyoffice136.x=900;facultyoffice136.y=100;
            classes.add(facultyoffice136);
            classroom facultyoffice137 = new classroom("AMANFACULTYOFFICE137");
            facultyoffice137.x=1000;facultyoffice137.y=100;
            classes.add(facultyoffice137);
            classroom facultyoffice138 = new classroom("AMANFACULTYOFFICE138");
            facultyoffice138.x=1100;facultyoffice138.y=100;
            classes.add(facultyoffice138);
            classroom facultyoffice103 = new classroom("AMANFACULTYOFFICE103");
            facultyoffice103.x=300;facultyoffice103.y=550;
            classes.add(facultyoffice103);
            classroom facultyoffice104 = new classroom("AMANFACULTYOFFICE104");
            facultyoffice104.x=300;facultyoffice104.y=500;
            classes.add(facultyoffice104);
            classroom facultyoffice105 = new classroom("AMANFACULTYOFFICE105");
            facultyoffice105.x=300;facultyoffice105.y=450;
            classes.add(facultyoffice105);
            classroom facultyoffice106 = new classroom("AMANFACULTYOFFICE106");
            facultyoffice106.x=300;facultyoffice106.y=400;
            classes.add(facultyoffice106);
            classroom facultyoffice107 = new classroom("AMANFACULTYOFFICE107");
            facultyoffice107.x=300;facultyoffice107.y=300;
            classes.add(facultyoffice107);
            classroom facultyoffice108 = new classroom("AMANFACULTYOFFICE108");
            facultyoffice108.x=300;facultyoffice108.y=200;
            classes.add(facultyoffice108);
            classroom facultyoffice109 = new classroom("AMANFACULTYOFFICE109");
            facultyoffice109.x=300;facultyoffice109.y=250;
            classes.add(facultyoffice109);
            classroom facultyoffice110 = new classroom("AMANFACULTYOFFICE110");
            facultyoffice110.x=300;facultyoffice110.y=150;
            classes.add(facultyoffice110);
            classroom electricroom = new classroom("ELECTRICROOM");
            electricroom.x=500;
            electricroom.y=400;
            classes.add(electricroom);
            classroom mcl2 = new classroom("MCL2");
            mcl2.x=300;
            mcl2.y=100;
            classes.add(mcl2);
            classroom deanofficesbs = new classroom("DEANOFFICESBS");
            deanofficesbs.x=300;
            deanofficesbs.y=80;
            classes.add(deanofficesbs);
            classroom mcs4 = new classroom("MCS4");
            mcs4.x=350;
            mcs4.y=550;
            classes.add(mcs4);
            classroom cedoffice = new classroom("CEDOFFICE");
            cedoffice.x=350;
            cedoffice.y=500;
            classes.add(cedoffice);
            classroom stairs3first = new classroom("STAIRS3FIRST");
            stairs3first.x=300;
            stairs3first.y=600;
            classes.add(stairs3first);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, elevatorfirst);
            g.AddEdge(elevatorfirst, stairs1first);
            g.AddEdge(elevatorfirst, facultyoffice133);
            g.AddEdge(facultyoffice133, facultyoffice134);
            g.AddEdge(facultyoffice134, facultyoffice135);
            g.AddEdge(facultyoffice135, facultyoffice136);
            g.AddEdge(facultyoffice136, facultyoffice137);
            g.AddEdge(facultyoffice137, facultyoffice138);
            g.AddEdge(facultyoffice138, stairs2first);
            g.AddEdge(facultyoffice133, mcl2);
            g.AddEdge(facultyoffice108, facultyoffice109);
            g.AddEdge(facultyoffice109, facultyoffice110);
            g.AddEdge(facultyoffice108, facultyoffice107);
            g.AddEdge(facultyoffice107, facultyoffice106);
            g.AddEdge(facultyoffice106, facultyoffice105);
            g.AddEdge(facultyoffice105, facultyoffice104);
            g.AddEdge(facultyoffice104, facultyoffice103);
            g.AddEdge(facultyoffice110, mcl2);
            g.AddEdge(stairs3first, mcs4);
            g.AddEdge(cedoffice, mcs4);
            g.AddEdge(facultyoffice103, stairs3first);
            g.AddEdge(facultyoffice103, mcs4);
            g.AddEdge(cedoffice, facultyoffice104 );
            g.AddEdge(mcl2, deanofficesbs);
            g.AddEdge(cedoffice, electricroom);
            g.AddEdge(electricroom, stairs1first);
            g.AddEdge(stairs2first,facultyoffice127);
            g.AddEdge(facultyoffice126,facultyoffice127);
            g.AddEdge(entrance,facultyoffice126);

            //AMAN BUILDING-ADD FLOORS HERE
            Floor f9 = new Floor("AmanCED - First");
            f9.Floorplan=g;
            Aman.add(f9);}

        if(word.equals("STAIRSADAMJEE") || word.equals("MAC1") ||
                word.equals("MAC2") || word.equals("MAC3") || word.equals("MAC4") || word.equals("MAC5") ||
                word.equals("MAC6") || word.equals("MAC7") || word.equals("MAC8"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Adamjee - First");
            entrance.x=300;entrance.y=500;
            entrance.isentrance=true;
            classes.add(entrance);
            classroom stairs = new classroom("STAIRSADAMJEE");
            stairs.x=600;stairs.y=500;
            classes.add(stairs);
            classroom mac1 = new classroom("MAC1");
            classes.add(mac1);
            classroom mac2 = new classroom("MAC2");
            classes.add(mac2);
            classroom mac3 = new classroom("MAC3");
            classes.add(mac3);
            classroom mac4 = new classroom("MAC4");
            classes.add(mac4);
            classroom mac5 = new classroom("MAC5");
            classes.add(mac5);
            classroom mac6 = new classroom("MAC6");
            classes.add(mac6);
            classroom mac7 = new classroom("MAC7");
            classes.add(mac7);
            classroom mac8 = new classroom("MAC8");
            classes.add(mac8);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, mac4);
            g.AddEdge(mac4, mac3);
            g.AddEdge(mac3, mac2);
            g.AddEdge(mac2, mac1);
            g.AddEdge(mac4, mac5);
            g.AddEdge(mac5, mac6);
            g.AddEdge(mac6, mac7);
            g.AddEdge(mac7, mac8);
            g.AddEdge(mac7, stairs);
            int k=100;
            for(int i=0;i<g.adjList.size();i++){
                if( g.adjList.get(i).name.contains("MAC")){
                    System.out.println(g.adjList.get(i).name);
                    g.adjList.get(i).x=k;
                    k=k+100;
                    g.adjList.get(i).y=350;}

            }
            //ADAMJEE BUILDING-ADD FLOORS HERE
            Floor f10 = new Floor("Adamjee - First");
            f10.Floorplan=g;
            Adamjee.add(f10);}

        if(word.equals("SCELEVATORGROUND") || word.equals("SCSTAIRS1GROUND") || word.equals("SCSTAIRS2GROUND") ||
                word.equals("STUDENTLOUNGE") || word.equals("ATM") || word.equals("CAFETERIA") || word.equals("BADMINTONANDTENNIS") ||
                word.equals("SPORTSSOCIETYOFFICE"))
        {
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Student Centre - Ground");
            entrance.x=600;entrance.y=600;
            entrance.isentrance=true;
            classes.add(entrance);
            classroom scstairs1ground = new classroom("SCSTAIRS1GROUND");
            scstairs1ground.x=300;scstairs1ground.y=600;
            classes.add(scstairs1ground);
            classroom scelevatorground = new classroom("SCELEVATORGROUND");
            scelevatorground.x=400;scelevatorground.y=600;
            classes.add(scelevatorground);
            classroom scstairs2ground = new classroom("SCSTAIRS2GROUND");
            scstairs2ground.x=600;
            scstairs2ground.y=200;
            classes.add(scstairs2ground);
            classroom studentlounge = new classroom("STUDENTLOUNGE");
            studentlounge.x=700;studentlounge.y=500;
            classes.add(studentlounge);
            classroom balls = new classroom("BALLS");
            balls.x=700;balls.y=450;
            classes.add(balls);
            classroom atm = new classroom("ATM");
            atm.x=700;atm.y=300;
            classes.add(atm);
            classroom cafeteria = new classroom("CAFETERIA");
            cafeteria.x=400;cafeteria.y=200;
            classes.add(cafeteria);
            classroom badmintonandtennis = new classroom("BADMINTONANDTENNIS");
            badmintonandtennis.x=400;badmintonandtennis.y=500;
            classes.add(badmintonandtennis);
            classroom sportsoffice = new classroom("SPORTSSOCIETYOFFICE");
            sportsoffice.x=500;
            sportsoffice.y=200;
            classes.add(sportsoffice);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, scelevatorground);
            g.AddEdge(entrance, studentlounge);
            g.AddEdge(scstairs1ground, badmintonandtennis);
            g.AddEdge(badmintonandtennis, cafeteria);
            g.AddEdge(studentlounge, balls);
            g.AddEdge(balls, atm);
            g.AddEdge(atm, scstairs2ground);
            g.AddEdge(scstairs2ground, sportsoffice);
            g.AddEdge(sportsoffice, cafeteria);
            g.AddEdge(scelevatorground, scstairs1ground);

            //STUDENT CENTRE BUILDING-ADD FLOORS HERE
            Floor f11 = new Floor("Student Centre - Ground");
            f11.Floorplan=g;
            SC.add(f11);}

        if(word.equals("SCELEVATORFIRST") || word.equals("SCSTAIRS1FIRST") || word.equals("SCSTAIRS2FIRST") ||
                word.equals("SOCIETYOFFICE") || word.equals("EVENTHALL") || word.equals("TROPHIES") || word.equals("PLAYARENA") ||
                word.equals("MALEGYM") || word.equals("FEMALEGYM") || word.equals("CENTREOFWRITING"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Student Centre - First");
            entrance.x=300;entrance.y=600;
            entrance.isentrance=true;
            classes.add(entrance);

            classroom scstairs1first = new classroom("SCSTAIRS1FIRST");
            scstairs1first.x=300;scstairs1first.y=600;
            classes.add(scstairs1first);
            classroom scelevatorfirst = new classroom("SCELEVATORFIRST");
            scelevatorfirst.x=350;scelevatorfirst.y=600;
            classes.add(scelevatorfirst);
            classroom scstairs2first = new classroom("SCSTAIRS2FIRST");
            scstairs2first.x=700;scstairs2first.y=200;
            classes.add(scstairs2first);
            classroom societyoffice = new classroom("SOCIETYOFFICE");
            societyoffice.x= 450;societyoffice.y=200;
            classes.add(societyoffice);
            classroom eventhall = new classroom("EVENTHALL");
            eventhall.x=400; eventhall.y=350;
            classes.add(eventhall);
            classroom trophies = new classroom("TROPHIES");
            trophies.x=400;trophies.y=400;
            classes.add(trophies);
            classroom playarena = new classroom("PLAYARENA");
            playarena.x=400;playarena.y=500;
            classes.add(playarena);
            classroom centreofwriting = new classroom("CENTREOFWRITING");
            centreofwriting.x=700;
            centreofwriting.y=600;
            classes.add(centreofwriting);
            classroom malegym = new classroom("MALEGYM");
            malegym.x=700;
            malegym.y=500;
            classes.add(malegym);
            classroom femalegym = new classroom("FEMALEGYM");
            femalegym.x=700;femalegym.y=300;
            classes.add(femalegym);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, scelevatorfirst);
            g.AddEdge(entrance, playarena);
            g.AddEdge(playarena, trophies);
            g.AddEdge(trophies, eventhall);
            g.AddEdge(eventhall, societyoffice);
            g.AddEdge(societyoffice, scstairs2first);
            g.AddEdge(scstairs2first, femalegym);
            g.AddEdge(femalegym, malegym);
            g.AddEdge(malegym, centreofwriting);
            g.AddEdge(scelevatorfirst, centreofwriting);

            //STUDENT CENTRE BUILDING-ADD FLOORS HERE
            Floor f13 = new Floor("Student Centre - First");
            f13.Floorplan=g;
            SC.add(f13);}

        if(word.equals("BREAKOUT9") || word.equals("BREAKOUT10") ||
                word.equals("MAV1") || word.equals("ADAMJEEFACULTYLOUNGE") || word.equals("MAV2") || word.equals("BREAKOUT1") ||
                word.equals("SITTINGAREA") || word.equals("ADAMJEEOFFICE") || word.equals("BREAKOUT2") || word.equals("BREAKOUT5") ||
                word.equals("BREAKOUT6") || word.equals("BREAKOUT8") || word.equals("BREAKOUT7"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Adamjee - Ground");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom breakout9 = new classroom("BREAKOUT9");
            classes.add(breakout9);
            classroom breakout10 = new classroom("BREAKOUT10");
            classes.add(breakout10);
            classroom mav1 = new classroom("MAV1");
            classes.add(mav1);
            classroom afacultylounge = new classroom("ADAMJEEFACULTYLOUNGE");
            classes.add(afacultylounge);
            classroom mav2 = new classroom("MAV2");
            classes.add(mav2);
            classroom breakout1 = new classroom("BREAKOUT1");
            classes.add(breakout1);
            classroom breakout2 = new classroom("BREAKOUT2");
            classes.add(breakout2);
            classroom sittingarea = new classroom("SITTINGAREA");
            classes.add(sittingarea);
            classroom aoffice = new classroom("ADAMJEEOFFICE");
            classes.add(aoffice);
            classroom breakout5 = new classroom("BREAKOUT5");
            classes.add(breakout5);
            classroom breakout6 = new classroom("BREAKOUT6");
            classes.add(breakout6);
            classroom breakout8 = new classroom("BREAKOUT8");
            classes.add(breakout8);
            classroom breakout7 = new classroom("BREAKOUT7");
            classes.add(breakout7);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, breakout7);
            g.AddEdge(sittingarea, aoffice);
            g.AddEdge(aoffice, breakout2);
            g.AddEdge(breakout2, breakout1);
            g.AddEdge(breakout1, mav2);
            g.AddEdge(sittingarea, breakout9);
            g.AddEdge(breakout9, breakout10);
            g.AddEdge(breakout10, afacultylounge);
            g.AddEdge(breakout6, breakout5);
            g.AddEdge(breakout5, sittingarea);
            g.AddEdge(breakout8, breakout7);
            g.AddEdge(breakout8, sittingarea);

            //ADAMJEE BUILDING-ADD FLOORS HERE
            Floor f14 = new Floor("Adamjee - Ground");
            f14.Floorplan=g;
            Adamjee.add(f14);}

        if(word.equals("RECORDROOM") || word.equals("MAILDISPATCHOFFICE") || word.equals("MAINTENANCEOFFICE") || word.equals("SECURITYOFFICE")
                || word.equals("TELEPHONEEXCHANGE") || word.equals("ADMINOFFICE") || word.equals("UNDERGRADUATEPROGRAMOFFICE") ||
                word.equals("GRADUATEPROGRAMOFFICE"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Fauji North - Ground");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom adminoffice = new classroom("ADMINOFFICE");
            classes.add(adminoffice);
            classroom gpo = new classroom("GRADUATEPROGRAMOFFICE");
            classes.add(gpo);
            classroom ugpo = new classroom("UNDERGRADUATEPROGRAMOFFICE");
            classes.add(ugpo);
            classroom recordroom = new classroom("RECORDROOM");
            classes.add(recordroom);
            classroom maildispatchoffice = new classroom("MAILDISPATCHOFFICE");
            classes.add(maildispatchoffice);
            classroom telephoneexchange = new classroom("TELEPHONEEXCHANGE");
            classes.add(telephoneexchange);
            classroom securityoffice = new classroom("SECURITYOFFICE");
            classes.add(securityoffice);
            classroom maintenanceoffice = new classroom("MAINTENANCEOFFICE");
            classes.add(maintenanceoffice);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, adminoffice);
            g.AddEdge(entrance, maildispatchoffice);
            g.AddEdge(adminoffice, gpo);
            g.AddEdge(gpo, ugpo);
            g.AddEdge(ugpo, recordroom);
            g.AddEdge(recordroom, maintenanceoffice);
            g.AddEdge(maintenanceoffice, securityoffice);
            g.AddEdge(securityoffice, ugpo);
            g.AddEdge(securityoffice, telephoneexchange);
            g.AddEdge(telephoneexchange, gpo);
            g.AddEdge(telephoneexchange, maildispatchoffice);
            g.AddEdge(maildispatchoffice, adminoffice);

            //FAUJI BUILDING-ADD FLOORS HERE
            Floor f15 = new Floor("Fauji North - Ground");
            f15.Floorplan=g;
            Fauji.add(f15);}

        if(word.equals("TRANSPORTOFFICE") || word.equals("ARCHIVES/DISPLAY") || word.equals("PURCHASEOFFICE") || word.equals("CONTROLLEROFEXAMINATIONS")
                || word.equals("EXAMINATIONDEPARTMENT") || word.equals("EMBAPROGRAMOFFICE"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("ENTRANCEFAUJISOUTHGROUND");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom transportoffice = new classroom("TRANSPORTOFFICE");
            classes.add(transportoffice);
            classroom archives = new classroom("ARCHIVES/DISPLAY");
            classes.add(archives);
            classroom purchaseoffice = new classroom("PURCHASEOFFICE");
            classes.add(purchaseoffice);
            classroom mbapo = new classroom("EMBAPROGRAMOFFICE");
            classes.add(mbapo);
            classroom ed = new classroom("EXAMINATIONDEPARTMENT");
            classes.add(ed);
            classroom coe = new classroom("CONTROLLEROFEXAMINATIONS");
            classes.add(coe);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, transportoffice);
            g.AddEdge(entrance,mbapo);
            g.AddEdge(transportoffice, mbapo);
            g.AddEdge(transportoffice, archives);
            g.AddEdge(mbapo, ed);
            g.AddEdge(ed, archives);
            g.AddEdge(archives, purchaseoffice);
            g.AddEdge(ed, coe);
            g.AddEdge(coe, purchaseoffice);

            //FAUJI BUILDING-ADD FLOORS HERE
            Floor f16 = new Floor("Fauji South - Ground");
            f16.Floorplan=g;
            Fauji.add(f16);}

        if(word.equals("HEADOFHR") || word.equals("HRDEPARTMENT") || word.equals("ADMINISTRATIVEDEPARTMENT") || word.equals("SR.MANAGERCORPORAETAFFAIRS")
                || word.equals("REGISTRAR") || word.equals("DEANANDDIRECTOR") || word.equals("BOARDROOM"))
        {
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Fauji South - First");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom headofhr = new classroom("HEADOFHR");
            classes.add(headofhr);
            classroom hrdepartment = new classroom("HRDEPARTMENT");
            classes.add(hrdepartment);
            classroom administrativedepartment = new classroom("ADMINISTRATIVEDEPARTMENT");
            classes.add(administrativedepartment);
            classroom mca = new classroom("SR.MANAGERCORPORAETAFFAIRS");
            classes.add(mca);
            classroom registrar = new classroom("REGISTRAR");
            classes.add(registrar);
            classroom deananddirector = new classroom("DEANANDDIRECTOR");
            classes.add(deananddirector);
            classroom boardroom = new classroom("BOARDROOM");
            classes.add(boardroom);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(boardroom, entrance);
            g.AddEdge(entrance, headofhr);
            g.AddEdge(entrance, mca);
            g.AddEdge(headofhr, hrdepartment);
            g.AddEdge(mca, registrar);
            g.AddEdge(mca, headofhr);
            g.AddEdge(registrar, hrdepartment);
            g.AddEdge(hrdepartment, administrativedepartment);
            g.AddEdge(registrar, deananddirector);
            g.AddEdge(administrativedepartment, deananddirector);

            //FAUJI BUILDING-ADD FLOORS HERE
            Floor f17 = new Floor("Fauji South - First");
            f17.Floorplan=g;
            Fauji.add(f17);}

        if(word.equals("INTERNALAUDIT") || word.equals("DIRECTORFINANCE") || word.equals("FINANCEDEPARTMENT") || word.equals("MEETINGROOM")
                || word.equals("BOARDROOM"))
        {
            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Fauji North - First");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom internalaudit = new classroom("Internal Audit");
            classes.add(internalaudit);
            classroom directorfinance = new classroom("Director Finance");
            classes.add(directorfinance);
            classroom meetingroom = new classroom("Meeting Room");
            classes.add(meetingroom);
            classroom financedepartment = new classroom("Finance Department");
            classes.add(financedepartment);
            classroom boardroom = new classroom("Boardroom");
            classes.add(boardroom);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(boardroom, entrance);
            g.AddEdge(entrance, internalaudit);
            g.AddEdge(entrance, meetingroom);
            g.AddEdge(internalaudit, meetingroom);
            g.AddEdge(internalaudit, directorfinance);
            g.AddEdge(directorfinance, financedepartment);
            g.AddEdge(meetingroom, financedepartment);

            //FAUJI BUILDING-ADD FLOORS HERE
            Floor f18 = new Floor("Fauji North - First");
            f18.Floorplan=g;
            Fauji.add(f18);}

        if(word.equals("FAUJIFACULTYOFFICE201") || word.equals("FAUJIFACULTYOFFICE202") || word.equals("FAUJIFACULTYOFFICE203") ||
                word.equals("FAUJIFACULTYOFFICE204") || word.equals("FAUJIFACULTYOFFICE205") || word.equals("FAUJIFACULTYOFFICE206") ||
                word.equals("FAUJIFACULTYOFFICE207") || word.equals("FAUJIFACULTYOFFICE208") || word.equals("FAUJIFACULTYOFFICE209") ||
                word.equals("FAUJIFACULTYOFFICE210") || word.equals("FAUJIFACULTYLOUNGE"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Fauji North - Second");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom ffacultyoffice201 = new classroom("FAUJIFACULTYOFFICE201");
            classes.add(ffacultyoffice201);
            classroom ffacultyoffice202 = new classroom("FAUJIFACULTYOFFICE202");
            classes.add(ffacultyoffice202);
            classroom ffacultyoffice203 = new classroom("FAUJIFACULTYOFFICE203");
            classes.add(ffacultyoffice203);
            classroom ffacultyoffice204 = new classroom("FAUJIFACULTYOFFICE204");
            classes.add(ffacultyoffice204);
            classroom ffacultyoffice205 = new classroom("FAUJIFACULTYOFFICE205");
            classes.add(ffacultyoffice205);
            classroom ffacultyoffice206 = new classroom("FAUJIFACULTYOFFICE206");
            classes.add(ffacultyoffice206);
            classroom ffacultyoffice207 = new classroom("FAUJIFACULTYOFFICE207");
            classes.add(ffacultyoffice207);
            classroom ffacultyoffice208 = new classroom("FAUJIFACULTYOFFICE208");
            classes.add(ffacultyoffice208);
            classroom ffacultyoffice209 = new classroom("FAUJIFACULTYOFFICE209");
            classes.add(ffacultyoffice209);
            classroom ffacultyoffice210 = new classroom("FAUJIFACULTYOFFICE210");
            classes.add(ffacultyoffice210);
            classroom ffacultylounge = new classroom("FAUJIFACULTYLOUNGE");
            classes.add(ffacultylounge);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, ffacultylounge);
            g.AddEdge(entrance, ffacultyoffice201);
            g.AddEdge(entrance, ffacultyoffice206);
            g.AddEdge(ffacultyoffice201, ffacultyoffice206);
            g.AddEdge(ffacultyoffice201, ffacultyoffice202);
            g.AddEdge(ffacultyoffice206, ffacultyoffice207);
            g.AddEdge(ffacultyoffice202, ffacultyoffice207);
            g.AddEdge(ffacultyoffice202, ffacultyoffice203);
            g.AddEdge(ffacultyoffice207, ffacultyoffice208);
            g.AddEdge(ffacultyoffice203, ffacultyoffice208);
            g.AddEdge(ffacultyoffice204, ffacultyoffice203);
            g.AddEdge(ffacultyoffice209, ffacultyoffice208);
            g.AddEdge(ffacultyoffice209, ffacultyoffice204);
            g.AddEdge(ffacultyoffice204, ffacultyoffice205);
            g.AddEdge(ffacultyoffice209, ffacultyoffice210);
            g.AddEdge(ffacultyoffice210, ffacultyoffice205);

            //FAUJI BUILDING-ADD FLOORS HERE
            Floor f19 = new Floor("Fauji North - Second");
            f19.Floorplan=g;
            Fauji.add(f19);}

        if(word.equals("ASSISTANTROOM2") || word.equals("FAUJIFACULTYOFFICE212") || word.equals("FAUJIFACULTYOFFICE213") ||
                word.equals("FAUJIFACULTYOFFICE214") || word.equals("FAUJIFACULTYOFFICE215") || word.equals("FAUJIFACULTYOFFICE216") ||
                word.equals("FAUJIFACULTYOFFICE217") || word.equals("FAUJIFACULTYOFFICE218") || word.equals("FAUJIFACULTYOFFICE219") ||
                word.equals("FAUJIFACULTYOFFICE220") || word.equals("FAUJIFACULTYLOUNGE"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Fauji South - Second");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom assistantroom2 = new classroom("ASSISTANTROOM2");
            classes.add(assistantroom2);
            classroom ffacultyoffice212 = new classroom("FAUJIFACULTYOFFICE212");
            classes.add(ffacultyoffice212);
            classroom ffacultyoffice213 = new classroom("FAUJIFACULTYOFFICE213");
            classes.add(ffacultyoffice213);
            classroom ffacultyoffice214 = new classroom("FAUJIFACULTYOFFICE214");
            classes.add(ffacultyoffice214);
            classroom ffacultyoffice215 = new classroom("FAUJIFACULTYOFFICE215");
            classes.add(ffacultyoffice215);
            classroom ffacultyoffice216 = new classroom("FAUJIFACULTYOFFICE216");
            classes.add(ffacultyoffice216);
            classroom ffacultyoffice217 = new classroom("FAUJIFACULTYOFFICE217");
            classes.add(ffacultyoffice217);
            classroom ffacultyoffice218 = new classroom("FAUJIFACULTYOFFICE218");
            classes.add(ffacultyoffice218);
            classroom ffacultyoffice219 = new classroom("FAUJIFACULTYOFFICE219");
            classes.add(ffacultyoffice219);
            classroom ffacultyoffice220 = new classroom("FAUJIFACULTYOFFICE220");
            classes.add(ffacultyoffice220);
            classroom ffacultylounge = new classroom("FAUJIFACULTYLOUNGE");
            classes.add(ffacultylounge);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, ffacultylounge);
            g.AddEdge(entrance, assistantroom2);
            g.AddEdge(entrance, ffacultyoffice216);
            g.AddEdge(assistantroom2, ffacultyoffice216);
            g.AddEdge(assistantroom2, ffacultyoffice212);
            g.AddEdge(ffacultyoffice216, ffacultyoffice217);
            g.AddEdge(ffacultyoffice212, ffacultyoffice217);
            g.AddEdge(ffacultyoffice212, ffacultyoffice213);
            g.AddEdge(ffacultyoffice217, ffacultyoffice218);
            g.AddEdge(ffacultyoffice213, ffacultyoffice218);
            g.AddEdge(ffacultyoffice214, ffacultyoffice213);
            g.AddEdge(ffacultyoffice219, ffacultyoffice218);
            g.AddEdge(ffacultyoffice219, ffacultyoffice214);
            g.AddEdge(ffacultyoffice214, ffacultyoffice215);
            g.AddEdge(ffacultyoffice219, ffacultyoffice220);
            g.AddEdge(ffacultyoffice220, ffacultyoffice215);

            //FAUJI BUILDING-ADD FLOORS HERE
            Floor f20 = new Floor("Fauji South - Second");
            f20.Floorplan=g;
            Fauji.add(f20);}

        if(word.equals("FAUJIFACULTYOFFICE301") || word.equals("FAUJIFACULTYOFFICE302") || word.equals("FAUJIFACULTYOFFICE303") ||
                word.equals("FAUJIFACULTYOFFICE304") || word.equals("FAUJIFACULTYOFFICE305") || word.equals("FAUJIFACULTYOFFICE306") ||
                word.equals("FAUJIFACULTYOFFICE307") || word.equals("COMMUNICATIONDEPARTMENT") || word.equals("ALUMNIDEPARTMENT") ||
                word.equals("FAUJIFACULTYMEETINGROOM"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Fauji North - Third");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom communicationdepartment = new classroom("Communication Department");
            classes.add(communicationdepartment);
            classroom alumnidepartment = new classroom("Alumni Department");
            classes.add(alumnidepartment);
            classroom ffacultyoffice303 = new classroom("Fauji - Faculty Office 303");
            classes.add(ffacultyoffice303);
            classroom ffacultyoffice304 = new classroom("Fauji - Faculty Office 304");
            classes.add(ffacultyoffice304);
            classroom ffacultyoffice305 = new classroom("Fauji - Faculty Office 305");
            classes.add(ffacultyoffice305);
            classroom ffacultyoffice306 = new classroom("Fauji - Faculty Office 306");
            classes.add(ffacultyoffice306);
            classroom ffacultyoffice307 = new classroom("Fauji - Faculty Office 307");
            classes.add(ffacultyoffice307);
            classroom ffacultyoffice301 = new classroom("Fauji - Faculty Office 301");
            classes.add(ffacultyoffice301);
            classroom ffacultyoffice302 = new classroom("Fauji - Faculty Office 302");
            classes.add(ffacultyoffice302);
            classroom ffacultymr = new classroom("Fauji - Faculty Meeting Room");
            classes.add(ffacultymr);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, ffacultymr);
            g.AddEdge(entrance, communicationdepartment);
            g.AddEdge(entrance, ffacultyoffice305);
            g.AddEdge(communicationdepartment, alumnidepartment);
            g.AddEdge(alumnidepartment, ffacultyoffice306);
            g.AddEdge(communicationdepartment, ffacultyoffice305);
            g.AddEdge(ffacultyoffice305, ffacultyoffice306);
            g.AddEdge(alumnidepartment, ffacultyoffice303);
            g.AddEdge(ffacultyoffice303, ffacultyoffice307);
            g.AddEdge(ffacultyoffice306, ffacultyoffice307);
            g.AddEdge(ffacultyoffice304, ffacultyoffice303);

            //FAUJI BUILDING-ADD FLOORS HERE
            Floor f21 = new Floor("Fauji North - Third");
            f21.Floorplan=g;
            Fauji.add(f21);}

        if(word.equals("FAUJIFACULTYOFFICE308") || word.equals("FAUJIFACULTYMEETINGROOM") ||
                word.equals("COMMUNICATIONDEPARTMENT") || word.equals("ALUMNIDEPARTMENT"))
        {

            ArrayList<classroom> classes=new ArrayList<classroom>();
            classroom entrance=new classroom("Entrance Fauji South - Third");
            entrance.isentrance=true;
            classes.add(entrance);
            classroom ffacultyoffice308 = new classroom("Fauji - Faculty Office 308");
            classes.add(ffacultyoffice308);
            classroom testing_services_department4 = new classroom("Testing Services Department");
            classes.add(testing_services_department4);
            classroom coordinator_testing_services = new classroom("Coordinator Testing Services");
            classes.add(coordinator_testing_services);
            classroom ffacultymr = new classroom("Fauji - Faculty Meeting Room");
            classes.add(ffacultymr);

            MyGraph g = new MyGraph(classes);

            g.AddEdge(entrance, ffacultymr);
            g.AddEdge(entrance, ffacultyoffice308);
            g.AddEdge(entrance, testing_services_department4);
            g.AddEdge(testing_services_department4, ffacultyoffice308);
            g.AddEdge(ffacultyoffice308, coordinator_testing_services);


            //FAUJI BUILDING-ADD FLOORS HERE
            Floor f22 = new Floor("Fauji South - Third");
            f22.Floorplan=g;
            Fauji.add(f22);}


    }

    //returns the required floor
    private Floor getFloor(String word){
        if(word.equals("MTS6") || word.equals("SEMINARROOM6") || word.equals("BREAKOUT1") ||
                word.equals("MTS7") || word.equals("SEMINARROOM7") || word.equals("BREAKOUT2") ||
                word.equals("MTS8") || word.equals("AILAB") || word.equals("IRLAB") || word.equals("BDALAB") ||
                word.equals("WEBSNLAB") || word.equals("ROBOTICSLAB")){
            System.out.println("Go to Tabba North Ground floor");
            return Tabba.get(0);
        }
        if(word.equals("ITROOM") || word.equals("TABBAAFACULTYOFFICE100") || word.equals("TABBAAFACULTYOFFICE101") ||
                word.equals("TABBAAFACULTYOFFICE102") || word.equals("MTC16") || word.equals("PHDSCHOLARS") ||
                word.equals("MTC17") || word.equals("MTC18") || word.equals("MTC19") || word.equals("MTC20") ||
                word.equals("MTC20A")) {
            System.out.println("Go to Tabba North First floor");
            return Tabba.get(0);
        }
        if(word.equals("TABBAFACULTYOFFICE204") || word.equals("TABBAFACULTYOFFICE205") || word.equals("TABBAFACULTYOFFICE206") ||
                word.equals("TABBAFACULTYOFFICE207") || word.equals("TABBAFACULTYOFFICE208") || word.equals("TABBAFACULTYOFFICE209") ||
                word.equals("TABBAFACULTYOFFICE210") || word.equals("TABBAFACULTYOFFICE211") || word.equals("CONFERENCEROOM")
        ){
            System.out.println("Go to Tabba North Second floor");
            return Tabba.get(0);
        }
        if(word.equals("TABBAFACULTYOFFICE235") || word.equals("TABBAFACULTYOFFICE234") || word.equals("TABBAFACULTYOFFICE233") ||
                word.equals("TABBAFACULTYOFFICE232") || word.equals("TABBAFACULTYOFFICE231") || word.equals("TABBAFACULTYOFFICE230") ||
                word.equals("TABBAFACULTYOFFICE229") || word.equals("TABBAFACULTYOFFICE228") || word.equals("TABBAFACULTYLOUNGE")
        ) {
            System.out.println("Go to Tabba South Second floor");
            return Tabba.get(0);
        }
        if(word.equals("TABBAFACULTYOFFICE122") || word.equals("TABBAFACULTYOFFICE123") ||
                word.equals("MTC21") || word.equals("PHDSCHOLARS") ||
                word.equals("MTC22") || word.equals("MTC23") || word.equals("MTC24") || word.equals("MTC25") ||
                word.equals("MTC26")){
            System.out.println("Go to Tabba South First floor");
            return Tabba.get(0);
        }
        if(word.equals("MTL4") || word.equals("GAMELAB") || word.equals("MTC27") || word.equals("MTC28") ||
                word.equals("MTC29")) {
            System.out.println("Go to Tabba South Ground floor");
            return Tabba.get(0);
        }
        if(word.equals("ELEVATORGROUND") || word.equals("STAIRS1GROUND") ||
                word.equals("FINANCELAB") || word.equals("MCC13") ||
                word.equals("MCC14") || word.equals("NEUROMARKETINGLAB") || word.equals("STAIRS2GROUND") ||
                word.equals("MCC12") || word.equals("MCC10") || word.equals("MCC9") ||
                word.equals("SITTINGAREA") || word.equals("FACULTYOFFICEG03") || word.equals("FACULTYOFFICEG08") ||
                word.equals("FACULTYOFFICEG02") || word.equals("CONFERENCEROOM") ||
                word.equals("STAIRS3GROUND") || word.equals("MCS3")) {
            System.out.println("Go to Aman Ground Floor");
            return Aman.get(0);
        }

        if(word.equals("ELEVATORSECOND") || word.equals("STAIRS1SECOND") || word.equals("STAIRS2SECOND") ||
                word.equals("STAIRS3SECOND") || word.equals("AMANFACULTYOFFICE204") || word.equals("AMANFACULTYOFFICE205") ||
                word.equals("AMANFACULTYOFFICE206") || word.equals("AMANFACULTYOFFICE207") || word.equals("AMANFACULTYOFFICE208")
                || word.equals("AMANFACULTYOFFICE209") || word.equals("AMANFACULTYOFFICE218") || word.equals("AMANFACULTYOFFICE219")
                || word.equals("AMANFACULTYOFFICE229") || word.equals("AMANFACULTYOFFICE232") ||
                word.equals("AMANFACULTYOFFICE233") || word.equals("MCL3") || word.equals("MCL1") || word.equals("MCS5") || word.equals("MCC15")
                || word.equals("MBAEXECUTIVEPROGRAMOFFICE") || word.equals("ACCREDITIONOFFICESBS") || word.equals("AMANFACULTYLOUNGE")){
            System.out.println("Go to Aman Second Floor");
            return Aman.get(0);
        }

        if(word.equals("ELEVATORFIRST") || word.equals("STAIRS1FIRST") || word.equals("STAIRS2FIRST") ||
                word.equals("STAIRS3FIRST") || word.equals("AMANFACULTYOFFICE126") || word.equals("AMANFACULTYOFFICE127") ||
                word.equals("AMANFACULTYOFFICE133") || word.equals("AMANFACULTYOFFICE134") || word.equals("AMANFACULTYOFFICE135")
                || word.equals("AMANFACULTYOFFICE136") || word.equals("AMANFACULTYOFFICE137") || word.equals("AMANFACULTYOFFICE138")
                || word.equals("AMANFACULTYOFFICE103") || word.equals("AMANFACULTYOFFICE104") ||
                word.equals("AMANFACULTYOFFICE105") || word.equals("AMANFACULTYOFFICE106") || word.equals("AMANFACULTYOFFICE107") ||
                word.equals("AMANFACULTYOFFICE108") || word.equals("AMANFACULTYOFFICE109") ||
                word.equals("AMANFACULTYOFFICE110") || word.equals("MCL2") || word.equals("MCL1") || word.equals("MCS4") || word.equals("CEDOFFICE")
                || word.equals("ELECTRICROOM") || word.equals("DEANOFFICESBS")){
            System.out.println("Go to Aman First Floor");
            return Aman.get(0);
        }
        if(word.equals("STAIRSADAMJEE") || word.equals("MAC1") ||
                word.equals("MAC2") || word.equals("MAC3") || word.equals("MAC4") || word.equals("MAC5") ||
                word.equals("MAC6") || word.equals("MAC7") || word.equals("MAC8")){
            System.out.println("Go to Adamjee First Floor");
            return Adamjee.get(0);
        }

        if(word.equals("SCELEVATORGROUND") || word.equals("SCSTAIRS1GROUND") || word.equals("SCSTAIRS2GROUND") ||
                word.equals("STUDENTLOUNGE") || word.equals("ATM") || word.equals("CAFETERIA") || word.equals("BADMINTONANDTENNIS") ||
                word.equals("SPORTSSOCIETYOFFICE")){
            System.out.println("Go to Student Centre Ground Floor");
            return SC.get(0);
        }
        if(word.equals("SCELEVATORFIRST") || word.equals("SCSTAIRS1FIRST") || word.equals("SCSTAIRS2FIRST") ||
                word.equals("SOCIETYOFFICE") || word.equals("EVENTHALL") || word.equals("TROPHIES") || word.equals("PLAYARENA") ||
                word.equals("MALEGYM") || word.equals("FEMALEGYM") || word.equals("CENTREOFWRITING")){
            System.out.println("Go to Student Centre First Floor");
            return SC.get(0);
        }
        if(word.equals("BREAKOUT9") || word.equals("BREAKOUT10") ||
                word.equals("MAV1") || word.equals("ADAMJEEFACULTYLOUNGE") || word.equals("MAV2") || word.equals("BREAKOUT1") ||
                word.equals("SITTINGAREA") || word.equals("ADAMJEEOFFICE") || word.equals("BREAKOUT2") || word.equals("BREAKOUT5") ||
                word.equals("BREAKOUT6") || word.equals("BREAKOUT8") || word.equals("BREAKOUT7")){
            System.out.println("Go to Adamjee Ground Floor");
            return Adamjee.get(0);
        }
        if(word.equals("RECORDROOM") || word.equals("MAILDISPATCHOFFICE") || word.equals("MAINTENANCEOFFICE") || word.equals("SECURITYOFFICE")
                || word.equals("TELEPHONEEXCHANGE") || word.equals("ADMINOFFICE") || word.equals("UNDERGRADUATEPROGRAMOFFICE") ||
                word.equals("GRADUATEPROGRAMOFFICE")){
            System.out.println("Go to Fauji North Ground Floor");
            Fauji.get(0);
        }
        if(word.equals("TRANSPORTOFFICE") || word.equals("ARCHIVESDISPLAY") || word.equals("PURCHASEOFFICE") || word.equals("CONTROLLEROFEXAMINATIONS")
                || word.equals("EXAMINATIONDEPARTMENT") || word.equals("EMBAPROGRAMOFFICE")
        ){
            System.out.println("Go to Fauji South Ground Floor");
            Fauji.get(0);
        }
        if(word.equals("HEADOFHR") || word.equals("HRDEPARTMENT") || word.equals("ADMINISTRATIVEDEPARTMENT") || word.equals("SR.MANAGERCORPORATEAFFAIRS")
                || word.equals("REGISTRAR") || word.equals("DEANANDDIRECTOR") || word.equals("BOARDROOM")
        ){
            System.out.println("Go to Fauji South First Floor");
            Fauji.get(0);
        }
        if(word.equals("INTERNALAUDIT") || word.equals("DIRECTORFINANCE") || word.equals("FINANCEDEPARTMENT") || word.equals("MEETINGROOM")
                || word.equals("BOARDROOM")){
            System.out.println("Go to Fauji North First Floor");
            Fauji.get(0);
        }
        if(word.equals("FAUJIFACULTYOFFICE201") || word.equals("FAUJIFACULTYOFFICE202") || word.equals("FAUJIFACULTYOFFICE203") ||
                word.equals("FAUJIFACULTYOFFICE204")
                || word.equals("FAUJIFACULTYOFFICE205") || word.equals("FAUJIFACULTYOFFICE206") || word.equals("FAUJIFACULTYOFFICE207") ||
                word.equals("FAUJIFACULTYOFFICE208") || word.equals("FAUJIFACULTYOFFICE209") ||
                word.equals("FAUJIFACULTYOFFICE210") || word.equals("FAUJIFACULTYLOUNGE")){
            System.out.println("Go to Fauji North Second Floor");
            Fauji.get(0);
        }
        if(word.equals("ASSISTANTROOM2") || word.equals("FAUJIFACULTYOFFICE212") || word.equals("FAUJIFACULTYOFFICE213") ||
                word.equals("FAUJIFACULTYOFFICE214")
                || word.equals("FAUJIFACULTYOFFICE215") || word.equals("FAUJIFACULTYOFFICE216") || word.equals("FAUJIFACULTYOFFICE217") ||
                word.equals("FAUJIFACULTYOFFICE218") || word.equals("FAUJIFACULTYOFFICE219") ||
                word.equals("FAUJIFACULTYOFFICE220") || word.equals("FAUJIFACULTYLOUNGE")){
            System.out.println("Go to Fauji South Second Floor");
            Fauji.get(0);
        }
        if(word.equals("FAUJIFACULTYOFFICE301") || word.equals("FAUJIFACULTYOFFICE302") || word.equals("FAUJIFACULTYOFFICE303") ||
                word.equals("FAUJIFACULTYOFFICE304")
                || word.equals("FAUJIFACULTYOFFICE305") || word.equals("FAUJIFACULTYOFFICE306") || word.equals("FAUJIFACULTYOFFICE307") ||
                word.equals("COMMUNICATIONDEPARTMENT") || word.equals("ALUMNIDEPARTMENT") || word.equals("FAUJIFACULTYMEETINGROOM")){
            System.out.println("Go to Fauji North Third Floor");
            Fauji.get(0);
        }
        if(word.equals("FAUJIFACULTYOFFICE308") || word.equals("FAUJIFACULTYMEETINGROOM") ||
                word.equals("COMMUNICATIONDEPARTMENT") || word.equals("ALUMNIDEPARTMENT")){
            System.out.println("Go to Fauji South Third Floor");
            Fauji.get(0);
        }

        return null;
    }

    //Accessing required list to find path, and calling function of find path( function of Floor class)
    public void getPath(String word, boolean b){
        Floor f = getFloor(word);
        f.findpath(word, b);
    }

    public static void main(String[] args){
    }
}

