package com.ercode.film;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by riyadi rb on 1/21/17.
 * email : riyadi.rb@gmail.com
 * web   : ercode.id
 */


public class BaseActivity extends AppCompatActivity {
    protected Context c;
    protected AlphaAnimation btnAnimasi = new AlphaAnimation(1F, 0.7F);
    protected OkHttpClient client;
    protected ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        c = this;

        dialog = new ProgressDialog(c);

        client = new OkHttpClient.Builder()
                .connectTimeout(300, TimeUnit.SECONDS)
                .writeTimeout(300, TimeUnit.SECONDS)
                .readTimeout(300, TimeUnit.SECONDS)
                .build();



    }

    public void showLoading() {

        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        dialog.setInverseBackgroundForced(false);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setMessage("Loading...");

        dialog.show();
    }



    public void hideLoading() {
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
