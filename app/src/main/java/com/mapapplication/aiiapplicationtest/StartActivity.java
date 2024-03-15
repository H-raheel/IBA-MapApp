package com.mapapplication.aiiapplicationtest;
import android.graphics.Canvas;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StartActivity extends AppCompatActivity {
    public Node target;
    public Node head;

    @Override
    //Creates map of the building, and highlights the path between start and end building
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve start and end values from intent extras
        String startValue = getIntent().getStringExtra("startValue");
        String endValue = getIntent().getStringExtra("endValue");
        aStar a = finding(startValue, endValue);
        setContentView(R.layout.activity_start);
        MapView mapView = findViewById(R.id.mapView);
        mapView.invalidate(a.way);
    }

    public aStar finding(String h, String t){
        Buildings b = new Buildings();
         ArrayList<Node> NODES = b.buildings;
        for (Node r : NODES) {
            if (r.name.equals(h)) {
                head = r;
                break;
            }
        }
        //Finding out whether that whether start and end provided is any class/room/lab or building
        String hword = "";
        if (h.equalsIgnoreCase("AMANCED") || h.equalsIgnoreCase("TABBAACADEMICBLOCK") || h.equalsIgnoreCase("ADAMJEEACADEMICBLOCK") ||
                h.equalsIgnoreCase("ADAMJECAFE") || h.equalsIgnoreCase("STATIONARYSTORE") || h.equalsIgnoreCase("CRICKETNETS") || h.equalsIgnoreCase("CRICKETGROUND")
                || h.equalsIgnoreCase("STUDENTCENTRE") || h.equalsIgnoreCase("ROUNDABOUT") || h.equalsIgnoreCase("SOCCERFIELD") || h.equalsIgnoreCase("CARPARKING")
                || h.equalsIgnoreCase("GATORADE") || h.equalsIgnoreCase("FAUJIGROUND") || h.equalsIgnoreCase("LIBRARY") || h.equalsIgnoreCase("FAUJIFOUNDATIONBUILDING")
                || h.equalsIgnoreCase("NATIONALBANKOFPAKISTANBUILDING") || h.equalsIgnoreCase("COURTYARD") || h.equalsIgnoreCase("MALEPRAYERAREA") || h.equalsIgnoreCase("FEMALEPRAYERAREA")
                || h.equalsIgnoreCase("MARTINDOW") || h.equalsIgnoreCase("GATE2") || h.equalsIgnoreCase("GATE4") || h.equalsIgnoreCase("G&TAUDITORIUM")) {
        } else {
            if (h.equalsIgnoreCase("MTS6") || h.equalsIgnoreCase("SEMINARROOM6") || h.equalsIgnoreCase("BREAKOUT1") ||
                    h.equalsIgnoreCase("MTS7") || h.equalsIgnoreCase("SEMINARROOM7") || h.equalsIgnoreCase("BREAKOUT2") ||
                    h.equalsIgnoreCase("MTS8") || h.equalsIgnoreCase("AILAB") || h.equalsIgnoreCase("IRLAB") || h.equalsIgnoreCase("BDALAB") || h.equalsIgnoreCase("WEBSNLAB") || h.equalsIgnoreCase("ROBOTICSLAB") ||
                    h.equalsIgnoreCase("ITROOM") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE100") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE101") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE102") || h.equalsIgnoreCase("MTC16") ||
                    h.equalsIgnoreCase("PHDSCHOLARS") || h.equalsIgnoreCase("MTC17") || h.equalsIgnoreCase("MTC18") || h.equalsIgnoreCase("MTC19") || h.equalsIgnoreCase("MTC20") || h.equalsIgnoreCase("MTC20-A") ||
                    h.equalsIgnoreCase("TABBAAFACULTYOFFICE204") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE205") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE206") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE207") ||
                    h.equalsIgnoreCase("TABBAAFACULTYOFFICE208") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE209") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE210") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE211") ||
                    h.equalsIgnoreCase("CONFERENCEROOM") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE235") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE234") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE233") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE232") ||
                    h.equalsIgnoreCase("TABBAAFACULTYOFFICE231") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE230") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE229") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE228") || h.equalsIgnoreCase("TABBAAFACULTYLOUNGE") ||
                    h.equalsIgnoreCase("TABBAAFACULTYOFFICE122") || h.equalsIgnoreCase("TABBAAFACULTYOFFICE123") || h.equalsIgnoreCase("MTC21") || h.equalsIgnoreCase("PHDSCHOLARS") || h.equalsIgnoreCase("MTC22") || h.equalsIgnoreCase("MTC23") ||
                    h.equalsIgnoreCase("MTC24") || h.equalsIgnoreCase("MTC25") || h.equalsIgnoreCase("MTC26") || h.equalsIgnoreCase("MTL4") || h.equalsIgnoreCase("GAMELAB") ||
                    h.equalsIgnoreCase("MTC27") || h.equalsIgnoreCase("MTC28") || h.equalsIgnoreCase("MTC29")) {
                head = NODES.get(14);
                hword = h;
            }
            if (h.equals("ELEVATORGROUND") || h.equals("STAIRS1GROUND") ||
                    h.equals("FINANCELAB") || h.equals("MCC13") ||
                    h.equals("MCC14") || h.equals("NEUROMARKETINGLAB") || h.equals("STAIRS2GROUND") ||
                    h.equals("MCC12") || h.equals("MCC10") || h.equals("MCC9") ||
                    h.equals("SITTINGAREA") || h.equals("FACULTYOFFICEG03") || h.equals("FACULTYOFFICEG08") ||
                    h.equals("FACULTYOFFICEG02") || h.equals("CONFERENCEROOM") ||
                    h.equals("STAIRS3GROUND") || h.equals("MCS3") || h.equals("ELEVATORSECOND") || h.equals("STAIRS1SECOND") || h.equals("STAIRS2SECOND") ||
                    h.equals("STAIRS3SECOND") || h.equals("AMANFACULTYOFFICE204") || h.equals("AMANFACULTYOFFICE205") ||
                    h.equals("AMANFACULTYOFFICE206") || h.equals("AMANFACULTYOFFICE207") || h.equals("AMANFACULTYOFFICE208")
                    || h.equals("AMANFACULTYOFFICE209") || h.equals("AMANFACULTYOFFICE218") || h.equals("AMANFACULTYOFFICE219")
                    || h.equals("AMANFACULTYOFFICE229") || h.equals("AMANFACULTYOFFICE232") ||
                    h.equals("AMANFACULTYOFFICE233") || h.equals("MCL3") || h.equals("MCL1") || h.equals("MCS5") || h.equals("MCC15")
                    || h.equals("MBAEXECUTIVEPROGRAMOFFICE") || h.equals("ACCREDITIONOFFICESBS") ||
                    h.equals("AMANFACULTYLOUNGE") || h.equals("ELEVATORFIRST") || h.equals("STAIRS1FIRST") || h.equals("STAIRS2FIRST") ||
                    h.equals("STAIRS3FIRST") || h.equals("AMANFACULTYOFFICE126") || h.equals("AMANFACULTYOFFICE127") ||
                    h.equals("AMANFACULTYOFFICE133") || h.equals("AMANFACULTYOFFICE134") || h.equals("AMANFACULTYOFFICE135")
                    || h.equals("AMANFACULTYOFFICE136") || h.equals("AMANFACULTYOFFICE137") || h.equals("AMANFACULTYOFFICE138")
                    || h.equals("AMANFACULTYOFFICE103") || h.equals("AMANFACULTYOFFICE104") ||
                    h.equals("AMANFACULTYOFFICE105") || h.equals("AMANFACULTYOFFICE106") || h.equals("AMANFACULTYOFFICE107") ||
                    h.equals("AMANFACULTYOFFICE108") || h.equals("AMANFACULTYOFFICE109") ||
                    h.equals("AMANFACULTYOFFICE110") || h.equals("MCL2") || h.equals("MCS4") ||
                    h.equals("CEDOFFICE")
                    || h.equals("ELECTRICROOM") || h.equals("DEANOFFICESBS")) {
                head = NODES.get(15);
                hword = h;
            }
            if (h.equals("SCELEVATORGROUND") || h.equals("SCSTAIRS1GROUND") || h.equals("SCSTAIRS2GROUND") ||
                    h.equals("STUDENTLOUNGE") || h.equals("ATM") || h.equals("CAFETERIA") || h.equals("BADMINTONANDTENNIS") ||
                    h.equals("SPORTSSOCIETYOFFICE") || h.equals("SCELEVATORFIRST") || h.equals("SCSTAIRS1FIRST") || h.equals("SCSTAIRS2FIRST") ||
                    h.equals("SOCIETYOFFICE") || h.equals("EVENTHALL") || h.equals("TROPHIES") || h.equals("PLAYARENA") ||
                    h.equals("MALEGYM") || h.equals("FEMALEGYM") || h.equals("CENTREOFWRITING")) {
                head = NODES.get(4);
                hword = h;
            }
            if (h.equals("STAIRSADAMJEE") || h.equals("MAC1") ||
                    h.equals("MAC2") || h.equals("MAC3") || h.equals("MAC4") || h.equals("MAC5") ||
                    h.equals("MAC6") || h.equals("MAC7") || h.equals("MAC8") || h.equals("BREAKOUT9") || h.equals("BREAKOUT10") ||
                    h.equals("MAV1") || h.equals("ADAMJEE-FACULTYLOUNGE") || h.equals("MAV2") || h.equals("BREAKOUT1") ||
                    h.equals("SITTINGAREA") || h.equals("ADAMJEEOFFICE") || h.equals("BREAKOUT2") || h.equals("BREAKOUT5") ||
                    h.equals("BREAKOUT6") || h.equals("BREAKOUT8") || h.equals("BREAKOUT7")
            ) {
                head = NODES.get(0);
                hword = h;
            }
            if (h.equals("RECORDROOM") || h.equals("MAILDISPATCHOFFICE") || h.equals("MAINTENANCEOFFICE") || h.equals("SECURITYOFFICE")
                    || h.equals("TELEPHONEEXCHANGE") || h.equals("ADMINOFFICE") || h.equals("UNDERGRADUATEPROGRAMOFFICE") ||
                    h.equals("GRADUATEPROGRAMOFFICE") || h.equals("TRANSPORTOFFICE") || h.equals("ARCHIVESDISPLAY") || h.equals("PURCHASEOFFICE") || h.equals("CONTROLLEROFEXAMINATIONS")
                    || h.equals("EXAMINATIONSDepartment") || h.equals("EMBAPROGRAMOFFICE")
                    || h.equals("HEADOFHR") || h.equals("HRDEPARTMENT") || h.equals("ADMINISTRATIVEDEPARTMENT") || h.equals("SRMANAGERCORPORATEAFFAIRS")
                    || h.equals("REGISTRAR") || h.equals("DEANANDDIRECTOR") || h.equals("BOARDROOM") || h.equals("INTERNALAUDIT") || h.equals("DIRECTORFINANCE") || h.equals("FINANCEDEPARTMENT") || h.equals("MEETINGROOM")
                    || h.equals("BOARDROOM") || h.equals("FAUJIFACULTYOFFICE201") || h.equals("FAUJIFACULTYOFFICE202") || h.equals("FAUJIFACULTYOFFICE203") ||
                    h.equals("FAUJIFACULTYOFFICE204")
                    || h.equals("FAUJIFACULTYOFFICE205") || h.equals("FAUJIFACULTYOFFICE206") || h.equals("FAUJIFACULTYOFFICE207") ||
                    h.equals("FAUJIFACULTYOFFICE208") || h.equals("FAUJIFACULTYOFFICE209") ||
                    h.equals("FAUJIFACULTYOFFICE210") || h.equals("FAUJIFACULTYLOUNGE") || h.equals("ASSISTANTROOM2") || h.equals("FAUJIFACULTYOFFICE212") || h.equals("FAUJIFACULTYOFFICE213") ||
                    h.equals("FAUJIFACULTYOFFICE214")
                    || h.equals("FAUJIFACULTYOFFICE215") || h.equals("FAUJIFACULTYOFFICE216") || h.equals("FAUJIFACULTYOFFICE217") ||
                    h.equals("FAUJIFACULTYOFFICE218") || h.equals("FAUJIFACULTYOFFICE219") ||
                    h.equals("FAUJIFACULTYOFFICE220") || h.equals("FAUJIFACULTYLOUNGE") || h.equals("FAUJIFACULTYOFFICE301") || h.equals("FAUJIFACULTYOFFICE302") || h.equals("FAUJIFACULTYOFFICE303") ||
                    h.equals("FAUJIFACULTYOFFICE304")
                    || h.equals("FAUJIFACULTYOFFICE305") || h.equals("FAUJIFACULTYOFFICE306") || h.equals("FAUJIFACULTYOFFICE307") ||
                    h.equals("COMMUNICATIONDEPARTMENT") || h.equals("ALUMNIDEPARTMENT") || h.equals("FAUJIFACULTYMEETINGROOM") || h.equals("FAUJIFACULTYOFFICE308") ||
                    h.equals("FAUJIFACULTYMEETINGROOM") ||
                    h.equals("COMMUNICATIONDEPARTMENT") || h.equals("ALUMNIDEPARTMENT")) {
                head = NODES.get(17);
                hword = h;
            }


        }


        // if (!es) {
        for (Node w : NODES) {
            if (w.name.equals(t)) {
                target = w;
                break;
            }
        }


        aStar a;
        String tword = "";
        if (t.equals("AMANCED") || t.equals("TABBAACADEMICBLOCK") || t.equals("ADAMJEEACADEMICBLOCK") ||
                t.equals("ADAMJECAFE") || t.equals("STATIONARYSTORE") || t.equals("CRICKETNETS") || t.equals("CRICKETGROUND")
                || t.equals("STUDENTCENTRE") || t.equals("ROUNDABOUT") || t.equals("SOCCERFIELD") || t.equals("CARPARKING")
                || t.equals("GATORADE") || t.equals("FAUJIGROUND") || t.equals("LIBRARY") || t.equals("FAUJIFOUNDATIONBUILDING")
                || t.equals("NATIONALBANKOFPAKISTANBUILDING") || t.equals("COURTYARD") || t.equals("MALEPRAYERAREA") || t.equals("FEMALEPRAYERAREA")
                || t.equals("MARTINDOW") || t.equals("GATE2") || t.equals("GATE4") || t.equals("G&TAUDITORIUM")) {
        } else {
            if (t.equals("MTS6") || t.equals("SEMINARROOM6") || t.equals("BREAKOUT1") || t.equals("MTS7") || t.equals("SEMINARROOM7") || t.equals("BREAKOUT2") ||
                    t.equals("MTS8") || t.equals("AILAB") || t.equals("IRLAB") || t.equals("BDALAB") || t.equals("WEBSNLAB") || t.equals("ROBOTICSLAB") ||
                    t.equals("ITROOM") || t.equals("TABBAAFACULTYOFFICE100") || t.equals("TABBAAFACULTYOFFICE101") || t.equals("TABBAAFACULTYOFFICE102") || t.equals("MTC16") ||
                    t.equals("PHDSCHOLARS") || t.equals("MTC17") || t.equals("MTC18") || t.equals("MTC19") || t.equals("MTC20") || t.equals("MTC20A") ||
                    t.equals("TABBAAFACULTYOFFICE204") || t.equals("TABBAAFACULTYOFFICE205") || t.equals("TABBAAFACULTYOFFICE206") || t.equals("TABBAAFACULTYOFFICE207") ||
                    t.equals("TABBAAFACULTYOFFICE208") || t.equals("TABBAAFACULTYOFFICE209") || t.equals("TABBAAFACULTYOFFICE210") || t.equals("TABBAAFACULTYOFFICE211") ||
                    t.equals("CONFERENCEROOM") || t.equals("TABBAAFACULTYOFFICE235") || t.equals("TABBAAFACULTYOFFICE234") || t.equals("TABBAAFACULTYOFFICE233") ||
                    t.equals("TABBAAFACULTYOFFICE232") || t.equals("TABBAAFACULTYOFFICE231") || t.equals("TABBAAFACULTYOFFICE230") || t.equals("TABBAAFACULTYOFFICE229") ||
                    t.equals("TABBAAFACULTYOFFICE228") || t.equals("TABBAAFACULTYLOUNGE") || t.equals("TABBAAFACULTYOFFICE122") || t.equals("TABBAAFACULTYOFFICE123") ||
                    t.equals("MTC21") || t.equals("PHDSCHOLARS") || t.equals("MTC22") || t.equals("MTC23") || t.equals("MTC24") || t.equals("MTC25") ||
                    t.equals("MTC26") || t.equals("MTL4") || t.equals("GAMELAB") || t.equals("MTC27") || t.equals("MTC28") || t.equals("MTC29")) {
                target = NODES.get(14);
                tword = t;
            }
            if (t.equals("ELEVATORGROUND") || t.equals("STAIRS1GROUND") ||
                    t.equals("FINANCELAB") || t.equals("MCC13") ||
                    t.equals("MCC14") || t.equals("NEUROMARKETINGLAB") || t.equals("STAIRS2GROUND") ||
                    t.equals("MCC12") || t.equals("MCC10") || t.equals("MCC9") ||
                    t.equals("SITTINGAREA") || t.equals("FACULTYOFFICEG03") || t.equals("FACULTYOFFICEG08") ||
                    t.equals("FACULTYOFFICEG02") || t.equals("CONFERENCEROOM") ||
                    t.equals("STAIRS3GROUND") || t.equals("MCS3") || t.equals("ELEVATORSECOND") || t.equals("STAIRS1SECOND") || t.equals("STAIRS2SECOND") ||
                    t.equals("STAIRS3SECOND") || t.equals("AMANFACULTYOFFICE204") || t.equals("AMANFACULTYOFFICE205") ||
                    t.equals("AMANFACULTYOFFICE206") || t.equals("AMANFACULTYOFFICE207") || t.equals("AMANFACULTYOFFICE208")
                    || t.equals("AMANFACULTYOFFICE209") || t.equals("AMANFACULTYOFFICE218") || t.equals("AMANFACULTYOFFICE219")
                    || t.equals("AMANFACULTYOFFICE229") || t.equals("AMANFACULTYOFFICE232") ||
                    t.equals("AMANFACULTYOFFICE233") || t.equals("MCL3") || t.equals("MCL1") || t.equals("MCS5") || t.equals("MCC15")
                    || t.equals("MBAEXECUTIVEPROGRAMOFFICE") || t.equals("ACCREDITIONOFFICESBS") ||
                    t.equals("AMANFACULTYLOUNGE") || t.equals("ELEVATORFIRST") || t.equals("STAIRS1FIRST") || t.equals("STAIRS2FIRST") ||
                    t.equals("STAIRS3FIRST") || t.equals("AMANFACULTYOFFICE126") || t.equals("AMANFACULTYOFFICE127") ||
                    t.equals("AMANFACULTYOFFICE133") || t.equals("AMANFACULTYOFFICE134") || t.equals("AMANFACULTYOFFICE135")
                    || t.equals("AMANFACULTYOFFICE136") || t.equals("AMANFACULTYOFFICE137") || t.equals("AMANFACULTYOFFICE138")
                    || t.equals("AMANFACULTYOFFICE103") || t.equals("AMANFACULTYOFFICE104") ||
                    t.equals("AMANFACULTYOFFICE105") || t.equals("AMANFACULTYOFFICE106") || t.equals("AMANFACULTYOFFICE107") ||
                    t.equals("AMANFACULTYOFFICE108") || t.equals("AMANFACULTYOFFICE109") ||
                    t.equals("AMANFACULTYOFFICE110") || t.equals("MCL2") || t.equals("MCL1") || t.equals("MCS4") || t.equals("CEDOFFICE")
                    || t.equals("ELECTRICROOM") || t.equals("DEANOFFICESBS")) {
                target = NODES.get(15);
                tword = t;
            }
            if (t.equals("SCELEVATORGROUND") || t.equals("SCSTAIRS1GROUND") || t.equals("SCSTAIRS2GROUND") ||
                    t.equals("STUDENTLOUNGE") || t.equals("ATM") || t.equals("CAFETERIA") || t.equals("BADMINTONANDTENNIS") ||
                    t.equals("SPORTSSOCIETYOFFICE") || t.equals("SCELEVATORFIRST") || t.equals("SCSTAIRS1FIRST") || t.equals("SCSTAIRS2FIRST") ||
                    t.equals("SOCIETYOFFICE") || t.equals("EVENTHALL") || t.equals("TROPHIES") || t.equals("PLAYARENA") ||
                    t.equals("MALEGYM") || t.equals("FEMALEGYM") || t.equals("CENTREOFWRITING")) {
                target = NODES.get(4);
                tword = t;
            }
            if (t.equals("STAIRSADAMJEE") || t.equals("MAC1") ||
                    t.equals("MAC2") || t.equals("MAC3") || t.equals("MAC4") || t.equals("MAC5") ||
                    t.equals("MAC6") || t.equals("MAC7") || t.equals("MAC8") || t.equals("BREAKOUT9") || t.equals("BREAKOUT10") ||
                    t.equals("MAV1") || t.equals("ADAMJEEFACULTYLOUNGE") || t.equals("MAV2") || t.equals("BREAKOUT1") ||
                    t.equals("SITTINGAREA") || t.equals("ADAMJEEOFFICE") || t.equals("BREAKOUT2") || t.equals("BREAKOUT5") ||
                    t.equals("BREAKOUT6") || t.equals("BREAKOUT8") || t.equals("BREAKOUT7")
            ) {
                target = NODES.get(0);
                tword = t;
            }
            if (t.equals("RECORDROOM") || t.equals("MAILDISPATCHOFFICE") || t.equals("MAINTENANCEOFFICE") || t.equals("SECURITYOFFICE")
                    || t.equals("TELEPHONEEXCHANGE") || t.equals("ADMINOFFICE") || t.equals("UNDERGRADUATEPROGRAMOFFICE") ||
                    t.equals("GRADUATEPROGRAMOFFICE") || t.equals("TRANSPORTOFFICE") || t.equals("ARCHIVESDISPLAY") || t.equals("PURCHASEOFFICE") || t.equals("CONTROLLEROFEXAMINATIONS")
                    || t.equals("EXAMINATIONSPROGRAMOFFICE") || t.equals("EMBAPROGRAMOFFICE")
                    || t.equals("HEADOFHR") || t.equals("HRDEPARTMENT") || t.equals("ADMINISTRATIVEDEPARTMENT") || t.equals("SRMANAGERCORPORAFAIRS")
                    || t.equals("REGISTRAR") || t.equals("DEANANDDIRECTOR") || t.equals("BOARDROOM") || t.equals("INTERNALAUDIT") || t.equals("DIRECTORFINANCE") || t.equals("FINANCEDEPARTMENT") || t.equals("MEETINGROOM")
                    || t.equals("FAUJIFACULTYOFFICE201") || t.equals("FAUJIFACULTYOFFICE202") || t.equals("FAUJIFACULTYOFFICE203") ||
                    t.equals("FAUJIFACULTYOFFICE204")
                    || t.equals("FAUJIFACULTYOFFICE205") || t.equals("FAUJIFACULTYOFFICE206") || t.equals("FAUJIFACULTYOFFICE207") ||
                    t.equals("FAUJIFACULTYOFFICE208") || t.equals("FAUJIFACULTYOFFICE209") ||
                    t.equals("FAUJIFACULTYOFFICE210") || t.equals("FAUJIFACULTYLOUNGE") || t.equals("ASSISTANTROOM2") || t.equals("FAUJIFACULTYOFFICE212") || t.equals("FAUJIFACULTYOFFICE213") ||
                    t.equals("FAUJIFACULTYOFFICE214")
                    || t.equals("FAUJIFACULTYOFFICE215") || t.equals("FAUJIFACULTYOFFICE216") || t.equals("FAUJIFACULTYOFFICE217") ||
                    t.equals("FAUJIFACULTYOFFICE218") || t.equals("FAUJIFACULTYOFFICE219") ||
                    t.equals("FAUJIFACULTYOFFICE220") || t.equals("FAUJIFACULTYLOUNGE") || t.equals("FAUJIFACULTYOFFICE301") || t.equals("FAUJIFACULTYOFFICE302") || t.equals("FAUJIFACULTYOFFICE303") ||
                    t.equals("FAUJIFACULTYOFFICE304")
                    || t.equals("FAUJIFACULTYOFFICE305") || t.equals("FAUJIFACULTYOFFICE306") || t.equals("FAUJIFACULTYOFFICE307") ||
                    t.equals("COMMUNICATIONDEPARTMENT") || t.equals("ALUMNIDEPARTMENT") || t.equals("FAUJIFACULTYMEETINGROOM") || t.equals("FAUJIFACULTYOFFICE308") || t.equals("FAUJIFACULTYMEETINGROOM") || t.equals("COMMUNICATIONDEPARTMENT") || t.equals("ALUMNIDEPARTMENT")) {
                target = NODES.get(17);
                tword = t;
            }
        }
        aStar path = new aStar(head, target);
        return path;
    }
}