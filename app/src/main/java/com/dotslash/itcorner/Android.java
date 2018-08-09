package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Android extends AppCompatActivity {

    ListView listandroid;
    String[] Courses={"Duration : 60 Hrs\n" ,
            "Pre-requisite :\n" ,
            "Core Java\n" ,
            "Contents :\n" ,
            " Overview of Android\n" ,
            "Installation and Settings\n" ,
            "\tArchitecture of Android Platform\n" ,
            "Application Components\n" ,
            "Writing Simple Application\n" ,
            "Deploying and Running Application on an Android Phone\n" ,
            "Android Activities\n",
            "Android Services\n",
            "UI and Event Handling\n" ,
            " Content Providers\n" ,
            " Fragments, Intents/Filters\n" ,
            "Key Learnings :\n" ,
            "Develop and Deploy Mobile applications on Android\n" ,
            "\tUnderstanding and Using Android Marketplace.\n" ,
            "Recommended Next Course :\n" ,
            " Advanced Android Programming"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        hookUp();
        addClickListener();
        fillcourses();
    }

    void hookUp() {
        listandroid = (ListView) findViewById(R.id.listandroid);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Courses);
        listandroid.setAdapter(adapter);
    }

    private void addClickListener() {
        listandroid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Toast.makeText(Android.this,listandroid.getAdapter().getItem(i).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
