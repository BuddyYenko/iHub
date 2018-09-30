package com.example.s215087038.ihub;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        new BackTask().execute();

    }



    class BackTask extends AsyncTask<Void, Void, Void> {



        @Override

        protected Void doInBackground(Void... params) {

            WebServiceCall com = new WebServiceCall();

            //Call Webservice class method and pass values and get response

            String mResponse = com.getSoapResponse("HelloWorld");

            Log.i("Output", "----"+mResponse);

            return null;

        }

    }



}