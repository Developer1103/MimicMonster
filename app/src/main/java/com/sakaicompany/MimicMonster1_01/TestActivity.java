package com.sakaicompany.MimicMonster1_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout layoutMian, layoutGetItem;
    ImageView imgQ;
    TextView txtQ, txtA1, txtA2, txtA3, txtResult;
    Button btnA1, btnA2, btnA3, btnItem, btnR1, btnR2, btnR3, btnR4, btnR5;
    int testIndex;
    ArrayList<GlobalStruct.testStruct> data;
    GlobalStruct.testStruct info = new GlobalStruct.testStruct();
    int qIndex = 0;
    int intCollect = 0;
    int collectCount = 0;
    int[] collectValue = {0,0,0,0,0};
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // 広告を読み込む
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Intent intent = getIntent();
        testIndex = intent.getIntExtra("testIndex", 1);

        // set controll
        layoutMian = (ConstraintLayout) findViewById(R.id.layoutMain);
        layoutGetItem = (ConstraintLayout) findViewById(R.id.layoutGetItem);
        layoutGetItem.setOnClickListener(this);
        imgQ = (ImageView) findViewById(R.id.imgQ);
        txtQ = (TextView) findViewById(R.id.txtQ);
        txtA1 = (TextView) findViewById(R.id.txtA1);
        txtA2 = (TextView) findViewById(R.id.txtA2);
        txtA3 = (TextView) findViewById(R.id.txtA3);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnA1 = (Button) findViewById(R.id.btnA1);
        btnA1.setTag(1);
        btnA1.setOnClickListener(this);
        btnA2 = (Button) findViewById(R.id.btnA2);
        btnA2.setTag(2);
        btnA2.setOnClickListener(this);
        btnA3 = (Button) findViewById(R.id.btnA3);
        btnA3.setTag(3);
        btnA3.setOnClickListener(this);
        btnItem = (Button) findViewById(R.id.btnItem);
        btnItem.setOnClickListener(this);
        btnR1 = (Button) findViewById(R.id.btnR1);
        btnR1.setOnClickListener(this);
        btnR2 = (Button) findViewById(R.id.btnR2);
        btnR2.setOnClickListener(this);
        btnR3 = (Button) findViewById(R.id.btnR3);
        btnR3.setOnClickListener(this);
        btnR4 = (Button) findViewById(R.id.btnR4);
        btnR4.setOnClickListener(this);
        btnR5 = (Button) findViewById(R.id.btnR5);
        btnR5.setOnClickListener(this);

        data = new ArrayList<GlobalStruct.testStruct>();

        switch (testIndex) {
            case 1:
                data.add(GlobalData.q1_1());
                data.add(GlobalData.q1_2());
                data.add(GlobalData.q1_3());
                data.add(GlobalData.q1_4());
                data.add(GlobalData.q1_5());

                break;

            case 2:
                data.add(GlobalData.q2_1());
                data.add(GlobalData.q2_2());
                data.add(GlobalData.q2_3());
                data.add(GlobalData.q2_4());
                data.add(GlobalData.q2_5());
                break;
            case 3:
                data.add(GlobalData.q3_1());
                data.add(GlobalData.q3_2());
                data.add(GlobalData.q3_3());
                data.add(GlobalData.q3_4());
                data.add(GlobalData.q3_5());
                break;
            case 4:
                data.add(GlobalData.q4_1());
                data.add(GlobalData.q4_2());
                data.add(GlobalData.q4_3());
                data.add(GlobalData.q4_4());
                data.add(GlobalData.q4_5());
                break;
            case 5:
                data.add(GlobalData.q5_1());
                data.add(GlobalData.q5_2());
                data.add(GlobalData.q5_3());
                data.add(GlobalData.q5_4());
                data.add(GlobalData.q5_5());
                break;
            case 6:
                data.add(GlobalData.q6_1());
                data.add(GlobalData.q6_2());
                data.add(GlobalData.q6_3());
                data.add(GlobalData.q6_4());
                data.add(GlobalData.q6_5());
                break;
            case 7:
                data.add(GlobalData.q1_1());
                data.add(GlobalData.q1_3());
                data.add(GlobalData.q2_2());
                data.add(GlobalData.q2_3());
                data.add(GlobalData.q2_5());
                break;
            case 8:
                data.add(GlobalData.q3_4());
                data.add(GlobalData.q3_5());
                data.add(GlobalData.q4_1());
                data.add(GlobalData.q4_4());
                data.add(GlobalData.q4_5());
                break;
            case 9:
                data.add(GlobalData.q5_1());
                data.add(GlobalData.q5_3());
                data.add(GlobalData.q6_1());
                data.add(GlobalData.q6_4());
                data.add(GlobalData.q6_5());
                break;
            case 10:
                data.add(GlobalData.q1_2());
                data.add(GlobalData.q1_4());
                data.add(GlobalData.q2_1());
                data.add(GlobalData.q2_4());
                data.add(GlobalData.q3_3());
                break;
            case 11:
                data.add(GlobalData.q4_3());
                data.add(GlobalData.q5_2());
                data.add(GlobalData.q5_4());
                data.add(GlobalData.q5_5());
                data.add(GlobalData.q6_2());
                break;
            case 12:
                data.add(GlobalData.q1_5());
                data.add(GlobalData.q2_5());
                data.add(GlobalData.q3_2());
                data.add(GlobalData.q4_2());
                data.add(GlobalData.q5_3());
                break;
            default:
                break;
        }
    }

    private void setData(int index) {
        info = data.get(index);

        imgQ.setImageResource(GlobalStruct.getResId(info.imgQ, R.drawable.class));

        String strQ = "";
        switch (index){
            case 0:
                strQ = "1." + info.strQ;

                if (testIndex == 7) {
                    strQ = "1." + "なんのしごとですか。";
                }
                break;
            case 1:
                strQ = "2." + info.strQ;
                break;
            case 2:
                strQ = "3." + info.strQ;
                break;
            case 3:
                strQ = "4." + info.strQ;
                break;
            case 4:
                strQ = "5." + info.strQ;
                break;
        }
        txtQ.setText(strQ);
        txtA1.setText(info.strA1);
        txtA2.setText(info.strA2);
        txtA3.setText(info.strA3);
        txtResult.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnR1:
                GlobalStruct.playSound(this, R.raw.click);
                qIndex = 0;
                setData(0);
                txtResult.setVisibility(View.GONE);
                break;
            case R.id.btnR2:
                GlobalStruct.playSound(this, R.raw.click);
                qIndex = 1;
                setData(1);
                txtResult.setVisibility(View.GONE);
                break;
            case R.id.btnR3:
                GlobalStruct.playSound(this, R.raw.click);
                qIndex = 2;
                setData(2);
                txtResult.setVisibility(View.GONE);
                break;
            case R.id.btnR4:
                GlobalStruct.playSound(this, R.raw.click);
                qIndex = 3;
                setData(3);
                txtResult.setVisibility(View.GONE);
                break;
            case R.id.btnR5:
                GlobalStruct.playSound(this, R.raw.click);
                qIndex = 4;
                setData(4);
                txtResult.setVisibility(View.GONE);
                break;
            case R.id.btnA1:
                GlobalStruct.playSound(this, R.raw.click);
                if(info.collect == (int)btnA1.getTag()){
                    txtResult.setText(getResources().getText(R.string.resultyes));
                    collectValue[qIndex] = 1;
                    int sumCollect = 0;
                    for (int i=0; i<collectValue.length; i++){
                        sumCollect += collectValue[i];
                    }
                    if (sumCollect == 5) {
                        int index = testIndex - 1;

                        ArrayList<String> learningData = GlobalStruct.getStringArrayPref(this, "LearningResult");
                        ArrayList<String> testData = GlobalStruct.getStringArrayPref(this, "TestResult");

                        if (learningData.get(index).equals("1")) {
                            GlobalStruct.playSound(this, R.raw.item);
                            layoutGetItem.setVisibility(View.VISIBLE);

                            Boolean boolDataFlag = true;
                            if (testIndex > 1) {
                                for (int i = 0; i < index; i++) {
                                    if (learningData.get(i).equals("0") || testData.get(i).equals("0")) {
                                        boolDataFlag = false;
                                        break;
                                    }
                                }
                            }

                            if (boolDataFlag) {
                                ArrayList<String> testResult = new ArrayList<>();
                                testResult = GlobalStruct.getStringArrayPref(this, "TestResult");

                                testResult.set(index, "1");
                                GlobalStruct.setStringArrayPref(this, "TestResult", testResult);
                            }
                        }
                    }
                }else{
                    txtResult.setText(getResources().getText(R.string.resultno));
                }
                txtResult.setVisibility(View.VISIBLE);
                break;
            case R.id.btnA2:
                GlobalStruct.playSound(this, R.raw.click);
                if(info.collect == (int)btnA2.getTag()){
                    txtResult.setText(getResources().getText(R.string.resultyes));
                    collectValue[qIndex] = 1;
                    int sumCollect = 0;
                    for (int i=0; i<collectValue.length; i++){
                        sumCollect += collectValue[i];
                    }
                    if (sumCollect == 5) {
                        int index = testIndex - 1;

                        ArrayList<String> learningData = GlobalStruct.getStringArrayPref(this, "LearningResult");
                        ArrayList<String> testData = GlobalStruct.getStringArrayPref(this, "TestResult");

                        if (learningData.get(index).equals("1")) {
                            GlobalStruct.playSound(this, R.raw.item);
                            layoutGetItem.setVisibility(View.VISIBLE);

                            Boolean boolDataFlag = true;
                            if (testIndex > 1) {
                                for (int i = 0; i < index; i++) {
                                    if (learningData.get(i).equals("0") || testData.get(i).equals("0")) {
                                        boolDataFlag = false;
                                        break;
                                    }
                                }
                            }

                            if (boolDataFlag) {
                                ArrayList<String> testResult = new ArrayList<>();
                                testResult = GlobalStruct.getStringArrayPref(this, "TestResult");

                                testResult.set(index, "1");
                                GlobalStruct.setStringArrayPref(this, "TestResult", testResult);
                            }
                        }
                    }
                }else{
                    txtResult.setText(getResources().getText(R.string.resultno));
                }
                txtResult.setVisibility(View.VISIBLE);
                break;
            case R.id.btnA3:
                GlobalStruct.playSound(this, R.raw.click);
                if(info.collect == (int)btnA3.getTag()){
                    txtResult.setText(getResources().getText(R.string.resultyes));
                    collectValue[qIndex] = 1;
                    int sumCollect = 0;
                    for (int i=0; i<collectValue.length; i++){
                        sumCollect += collectValue[i];
                    }
                    if (sumCollect == 5) {
                        int index = testIndex - 1;

                        ArrayList<String> learningData = GlobalStruct.getStringArrayPref(this, "LearningResult");
                        ArrayList<String> testData = GlobalStruct.getStringArrayPref(this, "TestResult");

                        if (learningData.get(index).equals("1")) {
                            GlobalStruct.playSound(this, R.raw.item);
                            layoutGetItem.setVisibility(View.VISIBLE);

                            Boolean boolDataFlag = true;
                            if (testIndex > 1) {
                                for (int i = 0; i < index; i++) {
                                    if (learningData.get(i).equals("0") || testData.get(i).equals("0")) {
                                        boolDataFlag = false;
                                        break;
                                    }
                                }
                            }

                            if (boolDataFlag) {
                                ArrayList<String> testResult = new ArrayList<>();
                                testResult = GlobalStruct.getStringArrayPref(this, "TestResult");

                                testResult.set(index, "1");
                                GlobalStruct.setStringArrayPref(this, "TestResult", testResult);
                            }
                        }
                    }
                }else{
                    txtResult.setText(getResources().getText(R.string.resultno));
                }
                txtResult.setVisibility(View.VISIBLE);
                break;
            case R.id.layoutGetItem:
                layoutGetItem.setVisibility(View.GONE);
                break;
            case R.id.btnItem:
                GlobalStruct.playSound(this, R.raw.click);
                Intent myIntent = new Intent(TestActivity.this, ItemActivity.class);
                TestActivity.this.startActivity(myIntent);
                break;
            default:
                break;
        }
    }
}
