package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Java extends AppCompatActivity {

    ListView listjava;
    String[] Courses = {"Duration : 80 Hrs\n",
            "Pre-requisite :\n",
            "C Programming, (Preferably C++)\n",
            "Contents :\n",
            " Installation and settings of Java\n",
            "JDK, JVM, Classpath etc\n",
            "Packages, Eclipse IDE\n",
            "OOP in Java\n",
            "Inheritance and Polymorphism\n",
            "Interfaces\n",
            " Exception Handling\n",
            " Generics and Collections\n",
            "\tMulti-threading\n",
            "\tThread Synchronization\n",
            "Java Util, Wrapper Classes\n",
            "RMI\n",
            "Swing\n",
            " Applet\n",
            "Annotations\n",
            " Input and Output management\n",
            " Managing Files and Directories\n",
            " Networking programming\n",
            " JDBC\n",
            "Handling Transactions\n",
            "Key Learnings :\n",
            " Write platform independent applications\n",
            "Deploy and run such applications on different platforms\n",
            " Object oriented modelling in Java\n",
            " Design and development of multithreaded database applications\n",
            "Recommended Next Course :\n",
            " Advanced Java Mobile Application development using Android\n",
            "*******ADVANCED JAVA********\n",
            "Duration : 72 Hrs\n",
            "Pre-requisite :\n",
            "Java Java\n",
            "Contents :\n",
            "Servlet Basics, Servlet life cycle\n",
            "\tServlet Deployment , Web.xml file\n",
            " ServletContext and ServletConfig\n",
            "Include, Forward, sendRedirect\n",
            " Session and State management\n",
            "Page, Request, Session and Application Scopes\n",
            " Java Beans\n",
            " Advanced JDBC concepts\n",
            "JSP: Different elements, Life Cycle\n",
            " JSTL, Expression Languages, Custom Tags\n",
            " Using Glassfish: Installation and Deployment\n",
            "MVC Arhitecture\n",
            " Strut Framework\n",
            " Hibernate\n",
            " JNDI, JMS\n",
            " EJB : Session, Entity and Message driven beans\n",
            "Introduction to Spring Framework\n",
            "Key Learnings :\n",
            " Write web applications using Java\n",
            "Deploy web applications using different web servers on different platforms\n",
            "Develop flexible extensible architecture using MVC pattern\n",
            "Recommended Next Course :\n",

            "Enterprise Application development using Java, Mobile Application Development on Android\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        hookUp();
        addClickListener();
        fillcourses();
    }

    void hookUp() {
        listjava = (ListView) findViewById(R.id.listjava);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Courses);
        listjava.setAdapter(adapter);
    }

    private void addClickListener() {
        listjava.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //   Toast.makeText(Java.this, listjava.getAdapter().getItem(i).toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
