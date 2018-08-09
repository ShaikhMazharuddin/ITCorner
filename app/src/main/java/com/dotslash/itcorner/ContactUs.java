package com.dotslash.itcorner;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactUs extends AppCompatActivity implements View.OnClickListener {

    TextView txtPuneCall, txtAurangabadCidcoCall, txtAurangabadUsmanpuraCall;
    TextView txtpuneEmail, txtAurangabad1Email, txtAurangabad2Email;
    String puneCall = "+91 7722001132", cidcoCall = "+91 7722001146", usmanpuraCall = "+91 7722001137";
    String myNo = "7030409878";
    String emailPune , emailAurangabad1 , emailAurangabad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        hookUp();
        addListener();
    }

    protected void hookUp() {
        //For Call
        txtPuneCall = (TextView) findViewById(R.id.txtPuneCall);
        txtAurangabadCidcoCall = (TextView) findViewById(R.id.txtAurangabadCidcoCall);
        txtAurangabadUsmanpuraCall = (TextView) findViewById(R.id.txtAurangabadUsmanpuraCall);
        //Foe Email
        txtpuneEmail = (TextView) findViewById(R.id.txtPuneEmail);
        emailPune = txtpuneEmail.getText().toString();

        txtAurangabad1Email = (TextView) findViewById(R.id.txtEmailAurangabad1);
        emailAurangabad1 = txtAurangabad1Email.getText().toString();

        txtAurangabad2Email = (TextView) findViewById(R.id.txtEmailAurangabad2);
        emailAurangabad2 = txtAurangabad2Email.getText().toString();
    }

    protected void addListener() {
        //for call
        txtPuneCall.setOnClickListener(this);
        txtAurangabadCidcoCall.setOnClickListener(this);
        txtAurangabadUsmanpuraCall.setOnClickListener(this);
        //For Email
        txtpuneEmail.setOnClickListener(this);
        txtAurangabad1Email.setOnClickListener(this);
        txtAurangabad2Email.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            //Call
            case R.id.txtPuneCall:
                String pune = txtPuneCall.getText().toString();
                showCallDialog(pune);

                break;
            case R.id.txtAurangabadCidcoCall:
                String cidco = txtAurangabadCidcoCall.getText().toString();
                showCallDialog(cidco);
                break;
            case R.id.txtAurangabadUsmanpuraCall:
                String usmanpura = txtAurangabadUsmanpuraCall.getText().toString();
                showCallDialog(usmanpura);
                break;
            //Email
            case R.id.txtPuneEmail:

                showEmailDialog(emailPune);
                break;
            case R.id.txtEmailAurangabad1:
                showEmailDialog(emailAurangabad1);
                break;
            case R.id.txtEmailAurangabad2:
                showEmailDialog(emailAurangabad2);
                break;
        }
    }

    protected void showCallDialog(final String phoneNo) {
        AlertDialog.Builder callDialog = new AlertDialog.Builder(this);
        callDialog.setTitle("Call...");
        callDialog.setMessage("You want to make a call to:\n" + phoneNo);
        callDialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                makeCall(phoneNo);

            }
        });
        callDialog.setNegativeButton("No", null);
        callDialog.setCancelable(false);
        callDialog.show();
    }

    protected void makeCall(String number) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number)));
    }

    protected void showEmailDialog(final String mailTo){
        AlertDialog.Builder emailDialog = new AlertDialog.Builder(this);
        emailDialog.setTitle("Mail Us...");
        emailDialog.setMessage("Do You want to mail to "+mailTo);
        emailDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                sendEmail(mailTo);//change email
            }
        });
        emailDialog.setNegativeButton("No" , null);
        emailDialog.setCancelable(false);
        emailDialog.show();
    }

    protected void sendEmail(String mailTo){
        Intent intent =new Intent (Intent.ACTION_SENDTO);
        intent.setType("text/mail");
        intent.putExtra(Intent.EXTRA_SUBJECT , "Regarding Enquiry");
        intent.setData(Uri.parse("mailto:"+mailTo));
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}
