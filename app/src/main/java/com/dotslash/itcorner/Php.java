package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Php extends AppCompatActivity {

    ListView listphp;
    String[] Courses={" Duration : 80 Hrs\n" ,
            "Pre-requisite :\n" ,
            "HTML, Java Script\n" ,
            "Contents :\n" ,
            "Basics of PHP\n" ,
            "Using Web Forms\n" ,
            "Data Validation\n" ,
            "Session and State management\n" ,
            "User Identification\n" ,
            "ŸWorking with Databases\n" ,
            "Handling XML\n" ,
            "File Handling\n" ,
            "ŸSending Emails\n" ,
            "Regular Expressions\n" ,
            "AJAX using PHP\n" ,
            "Key Learnings :\n" ,
            "Develop and Deploy web applications using PHP\n" ,
            "Improved productivity in web development process\n  "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);

        hookUp();
        addClickListener();
        fillcourses();
    }

    void hookUp() {
        listphp = (ListView) findViewById(R.id.listphp);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Courses);
        listphp.setAdapter(adapter);
    }

    private void addClickListener() {
        listphp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //    Toast.makeText(Php.this, listphp.getAdapter().getItem(i).toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
