package com.dotslash.itcorner;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.os.AsyncTask;
import android.widget.Toast;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by shaikh on 09,Sep,17.
 */

public class SendMail extends AsyncTask<Void , Void , Void> {

    Context context;
    Session session;
    //
    String email , subject , message;
    ProgressDialog progressDialog;
    //constructor
    public SendMail(Context context, String email , String subject, String message) {
        this.context = context;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        //adding progress bar
        progressDialog =ProgressDialog.show(context , "registering" , "Pleaase Wait .." , false , false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        //removing the progress bar
        //and giving the confirmation by toast
        progressDialog.dismiss();
        Toast.makeText(context , "Registered Successfully" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected Void doInBackground(Void... params) {
//Creating propertiies
        Properties properties = new Properties();
        //configuring prop[erties for gmail
        properties.put("mail.smtp.host" , "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port" , "465");
        properties.put("mail.smtp.socketFactory.class" , "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth" , "true");
        properties.put("mail.smtp.port" , "587");

        //creating new session
        session = Session.getDefaultInstance(properties , new javax.mail.Authenticator(){
            //authenticating the passord
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(Config.EMAIL , Config.PASSWORD);
            }
        });
        try {
            //Creating message object
            MimeMessage mm = new MimeMessage(session);

            //sender address
            mm.setFrom(new InternetAddress(email));

            //add reciepient
            mm.addRecipient(javax.mail.Message.RecipientType.TO , new InternetAddress(Config.EMAIL));

            //adding subject
            mm.setSubject(subject);

            //adding message
            mm.setText(message);

            //sending
            Transport.send(mm);
        }catch (MessagingException me){
            me.printStackTrace();
        }

        return null;
    }
}
