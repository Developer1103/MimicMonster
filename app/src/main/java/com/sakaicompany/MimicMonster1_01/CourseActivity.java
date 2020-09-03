package com.sakaicompany.MimicMonster1_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CourseActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCourse1, btnCourse2, btnCourse3, btnCourse4, btnCourse5, btnCourse6, btnCourse7, btnCourse8, btnCourse9, btnCourse10, btnCourse11, btnCourse12;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        // 広告を読み込む
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btnCourse1 = (Button) findViewById(R.id.btnCourse1);
        btnCourse1.setTag(1);
        btnCourse1.setOnClickListener(this);
        btnCourse2 = (Button) findViewById(R.id.btnCourse2);
        btnCourse2.setTag(2);
        btnCourse2.setOnClickListener(this);
        btnCourse3 = (Button) findViewById(R.id.btnCourse3);
        btnCourse3.setTag(3);
        btnCourse3.setOnClickListener(this);
        btnCourse4 = (Button) findViewById(R.id.btnCourse4);
        btnCourse4.setTag(4);
        btnCourse4.setOnClickListener(this);
        btnCourse5 = (Button) findViewById(R.id.btnCourse5);
        btnCourse5.setTag(5);
        btnCourse5.setOnClickListener(this);
        btnCourse6 = (Button) findViewById(R.id.btnCourse6);
        btnCourse6.setTag(6);
        btnCourse6.setOnClickListener(this);
        btnCourse7 = (Button) findViewById(R.id.btnCourse7);
        btnCourse7.setTag(7);
        btnCourse7.setOnClickListener(this);
        btnCourse8 = (Button) findViewById(R.id.btnCourse8);
        btnCourse8.setTag(8);
        btnCourse8.setOnClickListener(this);
        btnCourse9 = (Button) findViewById(R.id.btnCourse9);
        btnCourse9.setTag(9);
        btnCourse9.setOnClickListener(this);
        btnCourse10 = (Button) findViewById(R.id.btnCourse10);
        btnCourse10.setTag(10);
        btnCourse10.setOnClickListener(this);
        btnCourse11 = (Button) findViewById(R.id.btnCourse11);
        btnCourse11.setTag(11);
        btnCourse11.setOnClickListener(this);
        btnCourse12 = (Button) findViewById(R.id.btnCourse12);
        btnCourse12.setTag(12);
        btnCourse12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        GlobalStruct.playSound(this, R.raw.click);
        Intent myIntent = new Intent(CourseActivity.this, LearningActivity.class);
        myIntent.putExtra("courseIndex", (int)v.getTag()); //Optional parameters
        CourseActivity.this.startActivity(myIntent);
    }
}
