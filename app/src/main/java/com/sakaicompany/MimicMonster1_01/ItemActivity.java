package com.sakaicompany.MimicMonster1_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, viewitem;
    Button btnCourse;
    ArrayList<String> learningData = new ArrayList<>();
    ArrayList<String> testData = new ArrayList<>();
    ArrayList<ImageView> items = new ArrayList<>();
    private AdView mAdView;
    private boolean allClear = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        // 広告を読み込む
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        item1 = (ImageView) findViewById(R.id.item1);
        item2 = (ImageView) findViewById(R.id.item2);
        item3 = (ImageView) findViewById(R.id.item3);
        item4 = (ImageView) findViewById(R.id.item4);
        item5 = (ImageView) findViewById(R.id.item5);
        item6 = (ImageView) findViewById(R.id.item6);
        item7 = (ImageView) findViewById(R.id.item7);
        item8 = (ImageView) findViewById(R.id.item8);
        item9 = (ImageView) findViewById(R.id.item9);
        item10 = (ImageView) findViewById(R.id.item10);
        item11 = (ImageView) findViewById(R.id.item11);
        item12 = (ImageView) findViewById(R.id.item12);

        viewitem = (ImageView) findViewById(R.id.viewitem);
        viewitem.setVisibility(View.GONE);

        btnCourse = (Button) findViewById(R.id.btnCourse);
        btnCourse.setOnClickListener(this);

        item1.setVisibility(View.GONE);
        item2.setVisibility(View.GONE);
        item3.setVisibility(View.GONE);
        item4.setVisibility(View.GONE);
        item5.setVisibility(View.GONE);
        item6.setVisibility(View.GONE);
        item7.setVisibility(View.GONE);
        item8.setVisibility(View.GONE);
        item9.setVisibility(View.GONE);
        item10.setVisibility(View.GONE);
        item11.setVisibility(View.GONE);
        item12.setVisibility(View.GONE);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);
        items.add(item11);
        items.add(item12);

        learningData = GlobalStruct.getStringArrayPref(this, "LearningResult");
        testData = GlobalStruct.getStringArrayPref(this, "TestResult");

        for (int i=0; i<12; i++){
            if (learningData.get(i).equals("1") && testData.get(i).equals("1")) {
                items.get(i).setVisibility(View.VISIBLE);
            }else{
                allClear = false;
            }
        }

        if (allClear) {
            viewitem.setVisibility(View.VISIBLE);
        }else{
            viewitem.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCourse:
                GlobalStruct.playSound(this, R.raw.click);
                Intent myIntent = new Intent(ItemActivity.this, CourseActivity.class);
                ItemActivity.this.startActivity(myIntent);
                break;
        }
    }
}
