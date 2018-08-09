package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DigitalMarketingActivity extends AppCompatActivity {

    ListView lvDigitalMarketing;
    String[] syllabus = {"Duration : 40 – 45 hrs / 60 – 75 hrs \n" ,
            "Definition : Digital marketing is any form of marketing products or services, which involves electronic devices." ,
            "\" Digital marketing is about something bigger than individual sales. \n " ,
            "It’s the umbrella hanging over top of all your customer/donor interactions \" \n" ,
            "The way in which digital marketing has developed since the 1990s and 2000s has changed the way brands and businesses utilize technology and digital marketing for their marketing. Digital marketing campaigns are becoming more prevalent, as digital platforms are increasingly incorporated into marketing plans, and as people use digital devices instead of going to physical shops."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_marketing);

        lvDigitalMarketing = (ListView) findViewById(R.id.lvDigitalMaketing);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , syllabus);
        lvDigitalMarketing.setAdapter(adapter);
    }
}
