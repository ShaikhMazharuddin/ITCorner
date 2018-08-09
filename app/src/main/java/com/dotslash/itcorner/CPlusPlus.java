package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CPlusPlus extends AppCompatActivity {

    ListView listcpp;

    String [] Courses={"Duration : 56 Hrs\n",
            "Pre-requisite :\n" ,
            "C Programming\n" ,
            "Contents :\n" ,
            " Concepts of Object Oriented Programming\n",
            "Class and Object\n",
            " C++ as a better C\n",
            "Operator Overloading\n",
            " Inheritance\n",
            " Polymorphism\n",
            " File IO\n",
            " Exception Handling\n",
            " RTTI, Type Casting\n" ,
            " Templates\n",
            " Namespaces\n" ,
            " Standard Template Library\n",
            "Key Learnings :\n" ,
            " Ability to analyze problem statement and develop a OOP design.\n" ,
            "Implement OOP design using C++.\n" ,
            "Recommended Next Course :\n" ,
            " Advanced Technologies like .NET or Java"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_plus);

        hookUp();
        addClickListener();
        fillcourses();
    }

    void hookUp() {
        listcpp = (ListView) findViewById(R.id.listCpp);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Courses);
        listcpp.setAdapter(adapter);
    }

    private void addClickListener() {
        listcpp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(CPlusPlus.this,listcpp.getAdapter().getItem(i).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
