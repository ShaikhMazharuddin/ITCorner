package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DiplomaNet extends AppCompatActivity {

    ListView listnet;
    String[]DiplomaCourses ={"Duration : 2 Months\n" ,
            "Eligibility :\n" ,
            "BE | BTech | MCA | MCS | MCM | MSc | BCA | BCS | BSc etc\n" ,
            "Pre-requisite :\n" ,
            "Good Knowledge of C, C++ Programming\n" ,
            "1) PROGRAMMING FUNDAMENTALS :\n" ,
            "Programming in C\n" ,
            " Introduction to Programming\n" ,
            "Data Types, Operators\n" ,
            " Integrated Development Environment\n" ,
            "Control Structures\n" ,
            " Functions\n",
            " Pointers\n" ,
            "Arrays, Strings\n",
            " File IO\n" ,
            " Structures and Unions\n" ,
            "Command Line arguments\n" ,
            "Programming in C++\n",
            "Concepts of Object Oriented Programming\n" ,
            "Class and Object\n" ,
            " Operator Overloading\n" ,
            "Inheritance\n" ,
            "Polymorphism\n" ,
            "File IO\n" ,
            "Exception Handling\n" ,
            " RTTI, Type Casting\n" ,
            "Templates\n" ,
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
            "2) .NET TECHNOLOGIES\n" ,
            "C# .NET\n" ,
            "Introduction to. Net Framework\n" ,
            "Using Visual Studio 2010\n" ,
            "OOP : Class, Object\n" ,
            "Inheritance, Polymorphism\n" ,
            " Interfaces\n" ,
            "Properties\n" ,
            "Indexers\n" ,
            "Attributes : Standard and Custom\n" ,
            " Exception Handling\n" ,
            "File IO and Serialization\n" ,
            "Multi-Threading\n" ,
            " Thread Synchronization\n" ,
            "Reflection\n" ,
            "Events and Delegates\n" ,
            "\tWinForms\n" ,
            " Custom controls\n" ,
            "ADO.NET : Connected/Disconnected Architecture\n" ,
            "\tData Binding and data bound controls\n" ,
            "Generics and Collections\n" ,
            "Handling XML\n" ,
            " COM Interoperability\n" ,
            "Deployment of .Net applications\n" ,
            "Windows Services\n" ,
            "Remoting\n" ,
            "Web Services\n" ,
            "Introduction to WCF, WPF & WF\n" ,

            "**********ASP.NET**********\n" ,
            "Introduction to Asp .NET\n" ,
            "Page Life Cycle\n" ,
            "Using IIS server, Creating virtual directories\n" ,
            "Asp .NET Web server Controls, Validation controls\n" ,
            " Custom Controls, User Controls\n" ,
            "Page Designing: Master pages,\n" ,
            " Skins, Themes, CSS\n" ,
            "Session and State management\n" ,
            "Caching: Page level, Partial caching\n" ,
            "Site Navigation and Personalization\n" ,
            " Data Binding and Ado. Net\n" ,
            "Debugging, tracing and error handling\n" ,
            "Language Integrated Queries (LINQ)\n" ,
            " Web administration\n" ,
            "Security: Membership, Roles, Permissions\n" ,
            "WCF\n" ,
            "Concept of AJAX\n" ,
            "\tDeployment of web application\n" ,
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
            "Guidance for International Certification\n" ,
            "6) PROJECT (OPTIONAL)\n" ,
            "Design\n" ,
            "Development\n" ,
            "  "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma_net);

        hookUp();
        addClickListener();
        fillcourses();
    }

    void hookUp() {
        listnet = (ListView) findViewById(R.id.listnet);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DiplomaCourses);
        listnet.setAdapter(adapter);
    }

    private void addClickListener() {
        listnet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(DiplomaNet.this,listnet.getAdapter().getItem(i).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
