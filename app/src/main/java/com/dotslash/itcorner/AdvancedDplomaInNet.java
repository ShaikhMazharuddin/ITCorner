package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AdvancedDplomaInNet extends AppCompatActivity {

    ListView listdiploma;
    String[] DiplomaCourses = {"Duration : 3.5 Months\n" ,
            "Eligibility :\n" ,
            "BE | BTech | MCA | MCS | MCM | MSc | BCA | BCS | BSc etc\n" ,
            "Pre-requisite :\n" ,
            "Basic Knowledge of C Programming\n" ,
            "1) PROGRAMMING FUNDAMENTALS :\n" ,
            "Programming in C\n",
            " Introduction to Programming\n" ,
            "Data Types, Operators\n" ,
            "Compilation, Linking, Execution, Debugging\n" ,
            " Integrated Development Environment\n" ,
            " Console Input and Output\n" ,
            "Control Structures\n" ,
            " Functions\n" ,
            " Pointers\n" ,
            " Storage classes, Dynamic Memory allocation\n" ,
            "Arrays, Strings\n" ,
            " File IO\n" ,
            " Structures and Unions\n" ,
            "Command Line arguments\n" ,
            "Macros\n" ,
            "Programming in C++\n" ,
            " Concepts of Object Oriented Programming\n" ,
            "C++ as a better C\n" ,
            " Operator Overloading\n" ,
            "Inheritance\n" ,
            "Polymorphism\n" ,
            "File IO\n" ,
            "Exception Handling\n" ,
            " RTTI, Type Casting\n" ,
            "Templates\n" ,
            " Namespaces\n" ,
            "Standard Template Library\n" ,
            "Database Fundamentals & SQL\n" ,
            "Database fundamentals\n" ,
            "Normalization\n" ,
            " SQL / PL-SQL\n" ,
            "Stored Procedure, Function\n" ,
            "Triggers,Indexes, Clusters\n" ,
            "Introduction to OS & Networking\n" ,
            "Overview of Operating System\n" ,
            "Concept of Process and Thread\n" ,
            " Memory Management\n" ,
            "Network Basics\n" ,
            "Classification of Networks\n" ,
            "Network Topologies\n" ,
            "Network Communication and Protocols\n" ,
            "TCP/IP fundamentals\n" ,
            "2) WEB FUNDAMENTALS\n" ,
            "HTML\n" ,
            "HTML Basics: Structure, Elements and Attributes\n" ,
            "Various Input fields in html\n",
            "Tables, Frames, Lists, Layouts\n" ,
            "Fonts, Colors\n" ,
            " Images, Audio, Videos\n" ,
            "HTML Forms\n" ,
            "Cascading Style Sheet\n" ,
            "Java Script\n" ,
            "Java Script Language basics\n" ,
            "Variables, Data Types, Functions, Operators\n" ,
            "Control flow using conditional and Iterative statements\n" ,
            "Managing HTML DOM and Events\n" ,
            " Java Script Objects\n" ,
            "Window Management using Java Script\n" ,
            "XML\n" ,
            "XML Basics: Structure, Elements and Attributes\n" ,
            "XML Schema, DTD\n" ,
            "XML Editors: Using Altova XML Spy\n" ,
            "XML DOM, Parsers\n" ,
            "Validation of XML\n" ,
            "XML CSS and XSLT\n" ,
            "XML Namespaces\n" ,
            "XML HTTP Request Object\n" ,
            "3) .NET TECHNOLOGIES\n" ,
            "Programming .NET using C#\n" ,
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
            "ASP.NET\n" ,
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
            "Advanced .NET 4.0\n" ,
            "Web-services: Concept and Implementation\n" ,
            "Concept of Ajax, .NET Ajax Toolkit\n" ,
            "Using Silverlight\n" ,
            "Windows Presentation Foundation\n" ,
            "Windows Communication Foundation\n" ,
            "Workflow Foundation\n" ,
            " Introduction to Microsoft SharePoint\n" ,
            "3) INTERVIEW SKILLS\n" ,
            "Interview Techniques\n" ,
            "Frequently Asked Questions\n" ,
            "Group Discussion\n" ,
            "Resume Writing\n" ,
            "Mock Test Based on MNC Test Pattern"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_dploma_in_net);

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

                Toast.makeText(AdvancedDplomaInNet.this, listdiploma.getAdapter().getItem(i).toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
