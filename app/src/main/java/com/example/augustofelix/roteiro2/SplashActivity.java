package com.example.augustofelix.roteiro2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import java.util.logging.LogRecord;

public class SplashActivity extends AppCompatActivity implements Runnable  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(this,5000);

    }

    public void run(){
        Intent I = new Intent(this, MainActivity.class);
        startActivity(I);
        finish();
    }

}
