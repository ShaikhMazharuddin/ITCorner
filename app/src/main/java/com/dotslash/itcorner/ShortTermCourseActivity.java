package com.dotslash.itcorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShortTermCourseActivity extends AppCompatActivity {

    Button btn, btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_term_course);

        hookup();
        addCliclkListener();
        click();
        clickjava();
        clickandroid();
        clickphp();
        clickweb();
    }

    void hookup() {

        //btn = (Button) findViewById(R.id.btn);
        btn = (Button) findViewById(R.id.btn);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
    }

    void addCliclkListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShortTermCourseActivity.this, Cprogram.class);
                startActivity(intent);
            }
        });

    }

    void click() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShortTermCourseActivity.this, CPlusPlus.class);
                startActivity(intent);
            }
        });

    }
    void clickjava() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShortTermCourseActivity.this, Java.class);
                startActivity(intent);
            }
        });
    }

    void clickandroid() {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShortTermCourseActivity.this, Android.class);
                startActivity(intent);
            }
        });


    }

    void clickphp() {
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShortTermCourseActivity.this, Php.class);
                startActivity(intent);
            }
        });
    }

    void clickweb() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShortTermCourseActivity.this, WebDesign.class);
                startActivity(intent);
            }
        });
    }
}
