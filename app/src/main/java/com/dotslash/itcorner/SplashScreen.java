package com.dotslash.itcorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // StartAnimations();
        //finish();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
					//Thread.sleep(3000);
                    //startAnimations();
                    //finish();
                    startRegistrattioActivity();
                    //startActivity(new Intent(SplashScreen.this , HomePage.class));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    void startRegistrattioActivity() {
        Intent intent = new Intent(this , RegistrationActivity.class);
        startActivity(intent);
        finish();
    }
}
