package com.sakaicompany.MimicMonster1_01;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import org.json.JSONArray;
import org.json.JSONException;

import java.lang.reflect.Field;
import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class GlobalStruct {
    private static MediaPlayer mPlayer;

    public final static class testStruct {
        public String imgQ = "";
        public String strQ = "";
        public String strA1 = "";
        public String strA2 = "";
        public String strA3 = "";
        public int collect = 0;
    }

    public static int getResId(String resName, Class<?> c) {

        try {
            Field idField = c.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String[] concat(String[] A, String[] B) {
        int aLen = A.length;
        int bLen = B.length;
        String[] C= new String[aLen+bLen];
        System.arraycopy(A, 0, C, 0, aLen);
        System.arraycopy(B, 0, C, aLen, bLen);
        return C;
    }

    public static String[] concatThree(String[] A, String[] B, String[] C) {
        int aLen = A.length;
        int bLen = B.length;
        int cLen = C.length;
        String[] D= new String[aLen+bLen+cLen];
        System.arraycopy(A, 0, D, 0, aLen);
        System.arraycopy(B, 0, D, aLen, bLen);
        System.arraycopy(C, 0, D, aLen+bLen, cLen);
        return D;
    }

    public static void playSound(Context context, int resource) {
        if (mPlayer != null) {
            // 繰り返し再生する場合
            mPlayer.stop();
            mPlayer.reset();
            // リソースの解放
            mPlayer.release();
        }

        mPlayer = MediaPlayer.create(context, resource);

        AudioManager audioManager = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
        int maxV = audioManager.getStreamMaxVolume(audioManager.STREAM_MUSIC);
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, Math.round(maxV * 0.8f), 0);

        // 再生する
        mPlayer.start();

        // 終了を検知するリスナー
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Log.d("debug","end of audio");
                // 再生終了
                mPlayer.stop();
                // リセット
                mPlayer.reset();
                // リソースの解放
                mPlayer.release();

                mPlayer = null;
            }
        });
    }

    public static void setStringArrayPref(Context context, String key, ArrayList<String> values) {
        SharedPreferences prefs = context.getSharedPreferences(GlobalConstants.PREF_NAME, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        JSONArray a = new JSONArray();
        for (int i = 0; i < values.size(); i++) {
            a.put(values.get(i));
        }
        if (!values.isEmpty()) {
            editor.putString(key, a.toString());
        } else {
            editor.putString(key, null);
        }
        editor.apply();
    }

    public static ArrayList<String> getStringArrayPref(Context context, String key) {
        SharedPreferences prefs = context.getSharedPreferences(GlobalConstants.PREF_NAME, context.MODE_PRIVATE);
        String json = prefs.getString(key, null);
        ArrayList<String> urls = new ArrayList<String>();
        if (json != null) {
            try {
                JSONArray a = new JSONArray(json);
                for (int i = 0; i < a.length(); i++) {
                    String url = a.optString(i);
                    urls.add(url);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return urls;
    }
}


