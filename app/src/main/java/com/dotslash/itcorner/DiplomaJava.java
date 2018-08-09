package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DiplomaJava extends AppCompatActivity {

    ListView listdiploma;
    String[] DiplomaCourses = {"Duration : 3.5 Months\n",
            "Eligibility :\n" ,
            "BE | BTech | MCA | MCS | MCM | MSc | BCA | BCS | BSc etc\n" ,
            "Pre-requisite :\n" +
                    "Basic Knowledge of C Programming\n" ,
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
            "Programming in C++\n" ,
            " Concepts of Object Oriented Programming\n" ,
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
            "Various Input fields in html\n" ,
            "Tables, Frames, Lists, Layouts\n" ,
            "Fonts, Colors\n" +
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
            "XML CSS and XSLT\n",
            "XML Namespaces\n" ,
            "XML HTTP Request Object\n" ,
            "***********2) JAVA TECHNOLOGIES************\n" ,
            "Core Java\n" ,
            "Installation and settings of Java\n" ,
            "JDK, JVM, Classpath etc\n" ,
            "Packages, Eclipse IDE\n" ,
            "OOP in Java\n" ,
            "Inheritance and Polymorphism\n" ,
            " Interfaces\n" ,
            "Exception Handling\n" ,
            " Generics and Collections\n" ,
            "Multi-threading\n" ,
            " Thread Synchronization\n" ,
            "Java Util, Wrapper Classes\n" ,
            " RMI\n" ,
            " Swing\n" ,
            "Applet\n" ,
            " Annotations\n" ,
            "Input and Output management\n" ,
            " Managing Files and Directories\n" ,
            "Networking programming\n" ,
            "JDBC\n" ,
            "Handling Transactions\n" ,
            "Advanced Java\n" ,
            " Servlet Basics, Servlet life cycle\n" ,
            "Servlet Deployment , Web.xml file\n" ,
            "ServletContext and ServletConfig\n" ,
            "Include, Forward, sendRedirect\n" ,
            " Session and State management\n" ,
            "Page, Request, Session and Application Scopes\n" ,
            "Java Beans\n" ,
            "Advanced JDBC concepts\n" ,
            "JSP: Different elements, Life Cycle\n" ,
            "JSTL, Expression Languages, Custom\n" ,
            "Tags\n" ,
            "MVC Arhitecture\n" ,
            "Strut Framework\n" ,
            "Hibernate\n" ,
            " JNDI, JMS\n" ,
            "\tIntroduction to Spring Framework\n" ,
            "Enterprise Java\n" ,
            "Servlet Basics, Servlet life cycle\n" ,
            "\tServlet Deployment , Web.xml file\n" ,
            " ServletContext and ServletConfig\n" ,
            "Include, Forward, sendRedirect\n" ,
            " Session and State management\n" ,
            "Page, Request, Session and Application Scopes\n" ,
            " Java Beans\n" ,
            " Advanced JDBC concepts\n" ,
            "JSP: Different elements, Life Cycle\n" ,
            " JSTL, Expression Languages, Custom Tags\n" ,
            " Using Glassfish: Installation and Deployment\n" ,
            "MVC Arhitecture\n" ,
            " Strut Framework\n" ,
            " Hibernate\n" ,
            " JNDI, JMS\n" ,
            " EJB : Session, Entity and Message driven beans\n" ,
            "Introduction to Spring Framework\n" ,
            "3) INTERVIEW SKILLS\n" ,
            "Interview Techniques\n" ,
            "Frequently Asked Questions\n" ,
            "Group Discussion\n" ,
            "Resume Writing\n" ,
            "Mock Test Based on MNC Test Pattern\n" ,
            "4) EVALUATION\n",
            "Technical Assignments\n" ,
            "Technical Test\n" ,
            "Technical Interview\n" ,
            "5) INTERNATIONAL CERTIFICATION\n" ,
            "Guidance for International Certification\n" ,
            "6) PROJECT (OPTIONAL)\n" ,
            "Design\n" ,
            "Development\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma_java);

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

                Toast.makeText(DiplomaJava.this, listdiploma.getAdapter().getItem(i).toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
