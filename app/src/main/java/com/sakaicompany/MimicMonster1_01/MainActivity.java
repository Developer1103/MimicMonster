package com.sakaicompany.MimicMonster1_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnStart;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mobile Ads SDK を初期化する
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        // 広告を読み込む
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);

        SharedPreferences sharedPref = getSharedPreferences(GlobalConstants.PREF_NAME, MODE_PRIVATE);

        if (!sharedPref.contains("LearningResult")) {
            ArrayList<String> learningResult = new ArrayList<>();
            for (int i=0; i<12; i++) {
                learningResult.add("0");
            }
            GlobalStruct.setStringArrayPref(this, "LearningResult", learningResult);
        }

        if (!sharedPref.contains("TestResult")) {
            ArrayList<String> testResult = new ArrayList<>();
            for (int i=0; i<12; i++) {
                testResult.add("0");
            }
            GlobalStruct.setStringArrayPref(this, "TestResult", testResult);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnStart:
                GlobalStruct.playSound(this, R.raw.click);
                Intent myIntent = new Intent(MainActivity.this, CourseActivity.class);
                MainActivity.this.startActivity(myIntent);
                break;
            default:
                break;
        }
    }
}
