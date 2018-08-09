package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class WebDesign extends AppCompatActivity {

    ListView listweb;
    String[] Courses = {"HTML\n",
            " Duration : 15 Hrs\n",
            "Pre-requisite :\n",
            "Basic Computer Knowledge\n",
            "Contents :\n",
            " HTML Basics: Structure, Elements and Attributes\n",
            "Various Input fields in html\n",
            "Tables, Frames, Lists, Layouts\n",
            "Fonts, Colors\n",
            "Images, Audio, Videos\n",
            "HTML Forms\n",
            " Cascading Style Sheet\n",
            "Key Learnings :\n",
            " Ability to write presentable web pages.\n",
            "Present different type of contents like text, images, videos etc\n",
            " Use of different browsers available to render html pages..\n",
            "Recommended Next Course :\n",
            " Java Script\n",
            "******JAVA SCRIPT******\n",
            "Duration : 15 Hrs\n",
            "Pre-requisite :\n",
            "HTML\n",
            "Contents :\n",
            "Java Script Language basics\n",
            "\tVariables, Data Types, Functions, Operators\n",
            " Control flow using conditional and Iterative statements\n",
            "Managing HTML DOM and Events\n",
            " Java Script Objects\n",
            " Window Management using Java Script\n",
            "Key Learnings :\n",
            "Perform basic data processing and data validation on the client side.\n",
            "Read and manipulate html DOM\n",
            "Writing simple web based client side utilities\n",
            "Recommended Next Course :\n",
            "Advanced Technologies like .Net or Java\n",
            "******XML******\n",
            "Duration : 20 Hrs\n",
            "Pre-requisite :\n",
            "HTML, Java Script\n",
            "Contents :\n",
            "XML Basics: Structure, Elements and Attributes\n",
            "XML Schema, DTD\n",
            " XML Editors: Using Altova XML Spy\n",
            "XML DOM, Parsers\n",
            "Validation of XML\n",
            " XML CSS and XSLT\n",
            "XML Namespaces\n",
            " XML HTTP Request Object\n",
            "Key Learnings :\n",
            "Representing data in the form of a valid XML document\n",
            "Use of XML editors\n",
            "Representing XML Document with HTML.\n",
            "Recommended Next Course :\n",
            " Advanced Technologies like .Net or Java"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_design);

        hookUp();
        addClickListener();
        fillcourses();
    }

    void hookUp() {
        listweb = (ListView) findViewById(R.id.listweb);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Courses);
        listweb.setAdapter(adapter);
    }

    private void addClickListener() {
        listweb.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(WebDesign.this, listweb.getAdapter().getItem(i).toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
