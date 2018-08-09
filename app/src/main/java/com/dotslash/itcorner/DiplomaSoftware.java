package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DiplomaSoftware extends AppCompatActivity {

    ListView listdiploma;
    String[] DiplomaCourses={"Duration : 1.5 Months\n" ,
            "Eligibility :\n" ,
            "BE | BTech | MCA | MCS | MCM | MSc | BCA | BCS | BSc etc\n" ,
            "Pre-requisite :\n" ,
            " Basic Knowledge of C Programming.\n" ,
            "1) PROGRAMMING FUNDAMENTALS :\n" ,
            "Programming in C\n" ,
            " Introduction to Programming\n" ,
            "Data Types, Operators\n" ,
            " Integrated Development Environment\n" ,
            "Control Structures\n" ,
            " Functions\n" ,
            " Pointers\n" ,
            "Arrays, Strings\n" ,
            " File IO\n" ,
            " Structures and Unions\n" ,
            "Command Line arguments\n" ,
            "Database Fundamentals & SQL\n" ,
            "Database fundamentals\n" ,
            "Normalization\n" ,
            " SQL / PL-SQL\n" ,
            "Stored Procedure, Function\n" ,
            "Triggers\n" ,
            "Introduction to OS & Networking\n" ,
            "Overview of Operating System\n" ,
            "Concept of Process and Thread\n" ,
            " Memory Management\n" ,
            "Network Basics\n" ,
            "Classification of Networks\n" ,
            "Network Topologies\n" ,
            "Network Communication and Protocols\n" ,
            "TCP/IP fundamentals\n" ,
            "Linux Fundamentals\n" ,
            "Introduction to Linux\n" ,
            "Basic Commands\n" ,
            "2) SOFTWARE TESTING\n" ,
            "Manual Testing\n" ,
            " Testing Overview\n" ,
            "SDLC\n" ,
            " STLC\n" ,
            "Methods of testing\n" ,
            " Validation\n" ,
            " Types of Testing\n" ,
            "Verification\n" ,
            "Walk through, inspection and Review\n" ,
            " V Model\n" ,
            "Special Tests: Requirement, Installation, UI, Usability, Internationalization, Localization, Performance, Load, Stress and many more\n" +
                    " Test plan\n" ,
            "Test Case Design Methods\n" ,
            " Writing and Reviewing Test Cases\n" ,
            " Test Execution\n" ,
            "\tDefect Management\n" ,
            "Quality\n" ,
            "Test Estimation and Metrics\n" ,
            "\n",
            "*********Automated Testing*********\n" ,
            "Role of tools in testing\n" ,
            "Selenium\n" ,
            "Overview of Automated testing\n" ,
            "Using Selenium\n" ,
            "Selenium IDE\n" ,
            "Basic recording and Playback\n" ,
            "\tSynchronization\n" ,
            "Commands\n" ,
            "Regular Expressions\n" ,
            "TestLink\n" ,
            "Users, Roles and Permissions\n" ,
            "Managing project, Modules and Sub modules\n" ,
            "Creating test plan, test cases\n" ,
            "Execution of Test cases\n" ,
            "Bugzilla\n" ,
            "Life Cycle\n" ,
            "Users, Roles and Permissions\n" ,
            "Managing project, Modules and Submodules\n",
            "Logging and resolving a bug\n" ,
            "Search functionality\n" ,
            "Quick Test Professional (QTP)\n" ,
            "Basic Concepts & Overview (Slides Only)\n" ,
            "Quality Center (QC)\n" ,
            "Basic Concepts & Overview (Slides Only)\n" ,
            "3) INTERVIEW SKILLS\n" ,
            "Interview Techniques\n" ,
            "Frequently Asked Questions\n" ,
            "Group Discussion\n" ,
            "Resume Writing\n" ,
            "Mock Test Based on MNC Test Pattern\n" ,
            "4) EVALUATION\n" ,
            "Technical Assignments\n" ,
            "Technical Test\n" ,
            "Technical Interview\n" ,
            "5) INTERNATIONAL CERTIFICATION\n" ,
            "Preparation for International Certification - ISTQB\n" ,
            "Practice Mock Test\n" ,
            "6) PROJECT\n" ,
            "Testing Project\n" ,
            ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma_software);

        hookUp();
        addClickListener();
        fillcourses();

    }

    void hookUp() {
        listdiploma = (ListView) findViewById(R.id.listdiploma);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DiplomaCourses);
        listdiploma.setAdapter(adapter);
    }

    private void addClickListener() {
        listdiploma.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(DiplomaSoftware.this,listdiploma.getAdapter().getItem(i).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
