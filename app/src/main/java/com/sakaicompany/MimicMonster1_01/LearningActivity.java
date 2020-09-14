package com.sakaicompany.MimicMonster1_01;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.gsm.GsmCellLocation;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class LearningActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout layoutMain, layoutYouwin;
    ImageView imgGif;
    TextView txtQ1, txtQ2, txtYes, txtNo;
    Button btnYes, btnNo, btnGoToTest;
    ImageButton btnSound;
    ProgressBar progressYes, progressNo;
    List<String> qArray = new ArrayList<>();
    List<String> aArray = new ArrayList<>();
    List<String> sArray = new ArrayList<>();

    int allCount = 0;
    int yesCount = 0;
    int noCount = 0;

    int minProgress = 0;
    int maxProgress = 10;
    int maxCount = 10;

    int courseIndex = 1;

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        // 広告を読み込む
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Intent intent = getIntent();
        courseIndex = intent.getIntExtra("courseIndex", 1);

        // set control
        layoutMain = (ConstraintLayout) findViewById(R.id.layoutMain);
        layoutYouwin = (ConstraintLayout) findViewById(R.id.layoutYouwin);
        layoutYouwin.setOnClickListener(this);
        imgGif = (ImageView) findViewById(R.id.imgGif);
        txtQ1 = (TextView) findViewById(R.id.txtQ1);
        txtQ2 = (TextView) findViewById(R.id.txtQ2);
        txtYes = (TextView) findViewById(R.id.txtYes);
        txtNo = (TextView) findViewById(R.id.txtNo);
        btnYes = (Button) findViewById(R.id.btnYes);
        btnNo = (Button) findViewById(R.id.btnNo);
        btnSound = (ImageButton) findViewById(R.id.btnSound);
        btnGoToTest = (Button) findViewById(R.id.btnGoToTest);
        progressYes = (ProgressBar) findViewById(R.id.progressYes);
        progressNo = (ProgressBar) findViewById(R.id.progressNo);

        txtQ2.setOnClickListener(this);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);
        btnSound.setOnClickListener(this);
        btnGoToTest.setOnClickListener(this);

        // set gif animation
        String gifName = GlobalConstants.GIF_COMMON_NAME + String.valueOf(courseIndex);
        Glide.with(this).load(GlobalStruct.getResId(gifName, R.raw.class)).fitCenter().into(imgGif);

        // set progress bar
        progressNo.setMax(maxProgress);
        progressNo.setProgress(0);
        progressNo.setProgressTintList(ColorStateList.valueOf(Color.RED));
        progressNo.setProgressBackgroundTintList(ColorStateList.valueOf(getColor(R.color.colorTrans)));

        progressYes.setMax(maxProgress);
        progressYes.setProgress(0);
        progressYes.setProgressTintList(ColorStateList.valueOf(Color.RED));
        progressYes.setProgressBackgroundTintList(ColorStateList.valueOf(getColor(R.color.colorTrans)));

        // Set Question & Answer
        switch (courseIndex){
            case 1:
                qArray = Arrays.asList(GlobalData.VIET_1);
                aArray = Arrays.asList(GlobalData.JAPA_1);
                sArray = Arrays.asList(GlobalData.SOUND_1);
                break;
            case 2:
                qArray = Arrays.asList(GlobalData.VIET_2);
                aArray = Arrays.asList(GlobalData.JAPA_2);
                sArray = Arrays.asList(GlobalData.SOUND_2);
                break;
            case 3:
                qArray = Arrays.asList(GlobalData.VIET_3);
                aArray = Arrays.asList(GlobalData.JAPA_3);
                sArray = Arrays.asList(GlobalData.SOUND_3);
                break;
            case 4:
                qArray = Arrays.asList(GlobalData.VIET_4);
                aArray = Arrays.asList(GlobalData.JAPA_4);
                sArray = Arrays.asList(GlobalData.SOUND_4);
                break;
            case 5:
                qArray = Arrays.asList(GlobalData.VIET_5);
                aArray = Arrays.asList(GlobalData.JAPA_5);
                sArray = Arrays.asList(GlobalData.SOUND_5);
                break;
            case 6:
                qArray = Arrays.asList(GlobalData.VIET_6);
                aArray = Arrays.asList(GlobalData.JAPA_6);
                sArray = Arrays.asList(GlobalData.SOUND_6);
                break;
            case 7:
                qArray = Arrays.asList(GlobalStruct.concat(GlobalData.VIET_1, GlobalData.VIET_2));
                aArray = Arrays.asList(GlobalStruct.concat(GlobalData.JAPA_1, GlobalData.JAPA_2));
                sArray = Arrays.asList(GlobalStruct.concat(GlobalData.SOUND_1, GlobalData.SOUND_2));
                break;
            case 8:
                qArray = Arrays.asList(GlobalStruct.concat(GlobalData.VIET_3, GlobalData.VIET_4));
                aArray = Arrays.asList(GlobalStruct.concat(GlobalData.JAPA_3, GlobalData.JAPA_4));
                sArray = Arrays.asList(GlobalStruct.concat(GlobalData.SOUND_3, GlobalData.SOUND_4));
                break;
            case 9:
                qArray = Arrays.asList(GlobalStruct.concat(GlobalData.VIET_5, GlobalData.VIET_6));
                aArray = Arrays.asList(GlobalStruct.concat(GlobalData.JAPA_5, GlobalData.JAPA_6));
                sArray = Arrays.asList(GlobalStruct.concat(GlobalData.SOUND_5, GlobalData.SOUND_6));
                break;
            case 10:
                qArray = Arrays.asList(GlobalStruct.concatThree(GlobalData.VIET_1, GlobalData.VIET_2, GlobalData.VIET_3));
                aArray = Arrays.asList(GlobalStruct.concatThree(GlobalData.JAPA_1, GlobalData.JAPA_2, GlobalData.JAPA_3));
                sArray = Arrays.asList(GlobalStruct.concatThree(GlobalData.SOUND_1, GlobalData.SOUND_2, GlobalData.SOUND_3));
                break;
            case 11:
                qArray = Arrays.asList(GlobalStruct.concatThree(GlobalData.VIET_4, GlobalData.VIET_5, GlobalData.VIET_6));
                aArray = Arrays.asList(GlobalStruct.concatThree(GlobalData.JAPA_4, GlobalData.JAPA_5, GlobalData.JAPA_6));
                sArray = Arrays.asList(GlobalStruct.concatThree(GlobalData.SOUND_4, GlobalData.SOUND_5, GlobalData.SOUND_6));
                break;
            case 12:
                String[] qTmp1 =  GlobalStruct.concatThree(GlobalData.VIET_1, GlobalData.VIET_2, GlobalData.VIET_3);
                String[] qTmp2 =  GlobalStruct.concatThree(GlobalData.VIET_4, GlobalData.VIET_5, GlobalData.VIET_6);
                qArray = Arrays.asList(GlobalStruct.concat(qTmp1, qTmp2));

                String[] aTmp1 = GlobalStruct.concatThree(GlobalData.JAPA_1, GlobalData.JAPA_2, GlobalData.JAPA_3);
                String[] aTmp2 = GlobalStruct.concatThree(GlobalData.JAPA_4, GlobalData.JAPA_5, GlobalData.JAPA_6);
                aArray = Arrays.asList(GlobalStruct.concat(aTmp1, aTmp2));

                String[] sTmp1 = GlobalStruct.concatThree(GlobalData.SOUND_1, GlobalData.SOUND_2, GlobalData.SOUND_3);
                String[] sTmp2 = GlobalStruct.concatThree(GlobalData.SOUND_4, GlobalData.SOUND_5, GlobalData.SOUND_6);
                sArray = Arrays.asList(GlobalStruct.concat(sTmp1, sTmp2));

                layoutMain.setBackgroundResource(R.drawable.backviewboss);
                break;
            default:
                break;
        }

        init();
    }

    private void init() {
        allCount = 0;
        yesCount = 0;
        noCount = 0;

        maxCount = qArray.size();
        maxProgress = maxCount;

        txtQ1.setText(qArray.get(0));
        txtQ2.setText("");
        txtYes.setText(String.valueOf(yesCount));
        txtNo.setText(String.valueOf(noCount));
        progressYes.setProgress(minProgress);
        progressYes.setMax(maxProgress);
        progressNo.setProgress(minProgress);
        progressNo.setMax(maxProgress);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnYes:
                GlobalStruct.playSound(LearningActivity.this, R.raw.good);
                yesCount++;
                allCount++;

                if (allCount == maxCount) {
                    progressYes.setProgress(yesCount);
                    txtYes.setText(String.valueOf(yesCount));

                    if (yesCount == maxCount) {
                        layoutYouwin.setVisibility(View.VISIBLE);
                        GlobalStruct.playSound(LearningActivity.this, R.raw.win);

                        ArrayList<String> learningData = new ArrayList<>();
                        ArrayList<String> testData = new ArrayList<>();

                        learningData = GlobalStruct.getStringArrayPref(this, "LearningResult");
                        testData = GlobalStruct.getStringArrayPref(this, "TestResult");

                        Boolean boolDataFlag = true;

                        if (courseIndex > 1) {
                            for (int i = 0; i < courseIndex-1; i++) {
                                if (learningData.get(i).equals("0") || testData.get(i).equals("0")) {
                                    boolDataFlag = false;
                                    break;
                                }
                            }
                        }

                        if (boolDataFlag) {
                            ArrayList<String> learningResult = new ArrayList<>();
                            learningResult = GlobalStruct.getStringArrayPref(this, "LearningResult");
                            int index = courseIndex - 1;
                            learningResult.set(index, "1");
                            GlobalStruct.setStringArrayPref(this, "LearningResult", learningResult);
                        }
                    } else {
                        alert(LearningActivity.this, "Challenge again" , "Restart");
                    }
                }else if (allCount < maxCount){
                    progressYes.setProgress(yesCount);
                    txtYes.setText(String.valueOf(yesCount));
                    txtQ1.setText(qArray.get(allCount));
                    txtQ2.setText("");
                }
                break;
            case R.id.btnNo:
                GlobalStruct.playSound(LearningActivity.this, R.raw.bad);
                noCount++;
                allCount++;

                if (allCount == maxCount) {
                    progressNo.setProgress(noCount);
                    txtNo.setText(String.valueOf(noCount));

                    alert(LearningActivity.this, "Challenge again" , "Restart");
                }else if (allCount < maxCount){
                    progressNo.setProgress(noCount);
                    txtNo.setText(String.valueOf(noCount));
                    txtQ1.setText(qArray.get(allCount));
                    txtQ2.setText("");
                }
                break;
            case R.id.txtQ2:
                txtQ2.setText(aArray.get(allCount));
                break;
            case R.id.btnSound:
                GlobalStruct.playSound(LearningActivity.this, GlobalStruct.getResId(sArray.get(allCount), R.raw.class));
                break;
            case R.id.btnGoToTest:
                GlobalStruct.playSound(this, R.raw.click);
                Intent myIntent = new Intent(LearningActivity.this, TestActivity.class);
                myIntent.putExtra("testIndex", courseIndex); //Optional parameters
                LearningActivity.this.startActivity(myIntent);
                break;
            case R.id.layoutYouwin:
                layoutYouwin.setVisibility(View.GONE);
                init();
            default:
                break;
        }
    }

    private void alert(Context context, String title, String message) {
        SweetAlertDialog alert = new SweetAlertDialog(this);
        alert.setCancelable(false);
        alert.setTitleText(title);
        alert.setContentText(message);
        alert.setConfirmText("OK");
        alert.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sDialog) {
                init();
                sDialog.dismissWithAnimation();
            }
        });
        alert.show();
    }
}
