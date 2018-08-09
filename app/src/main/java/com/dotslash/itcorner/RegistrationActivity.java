package com.dotslash.itcorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    String[] education = {"BCA", "BSC", "MSC", "MCA", "BE", "BTech", "IT", "Other"};
    String name, email, college, educationStream, mobileNo;
    EditText etName, etEmail, etCollege, etContactNo;
    Button btnRegister;
    Spinner spEducation;
    TextView txtSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        hookUp();
        addListener();
    }

    void hookUp() {
        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etCollege = (EditText) findViewById(R.id.etCollege);
        etContactNo = (EditText) findViewById(R.id.etContact);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        txtSkip =(TextView) findViewById(R.id.txtSkip);
        spEducation = (Spinner) findViewById(R.id.spEducation);
        ArrayAdapter<String> educationAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, education);
        spEducation.setAdapter(educationAdapter);

    }

    void addListener() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                composeMail();
            }
        });
        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrationActivity.this , HomePage.class));
            }
        });
    }

    void composeMail() {
        name = etName.getText().toString();
        email = etEmail.getText().toString();
        mobileNo = etContactNo.getText().toString();
        educationStream = spEducation.getSelectedItem().toString();
        college = etCollege.getText().toString();
        String subject = "Regarding Enquiry";
        String message = "\n Name : " + name + "\n Email : " + email + "\n College : " + college + "\n Mobile No : " + "\n Education Stream : " + educationStream;
        SendMail sendMail = new SendMail(this, email, subject, message);
        sendMail.execute();
        startActivity(new Intent(RegistrationActivity.this, HomePage.class));
    }
}
