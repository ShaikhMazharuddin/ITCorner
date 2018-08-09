package com.dotslash.itcorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdvancedDiplomaActivity extends AppCompatActivity {

    Button btn,btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_diploma);

        hookup();
        add();
        clickJava();
        clicknet();
    }

    void hookup() {

        btn = (Button) findViewById(R.id.btn);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

    }

    void add() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdvancedDiplomaActivity.this, AdvancedDiplomaInJava.class);
                startActivity(intent);
            }
        });

    }

    void clickJava() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdvancedDiplomaActivity.this, AdvancedDplomaInNet.class);
                startActivity(intent);
            }
        });

    }

    void clicknet() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdvancedDiplomaActivity.this, AdvancedDiplomaInOpenSource.class);
                startActivity(intent);
            }
        });

    }
}
