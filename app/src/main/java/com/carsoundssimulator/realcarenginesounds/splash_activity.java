package com.carsoundssimulator.realcarenginesounds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;



public class splash_activity extends AppCompatActivity {
    private ImageView carTop;
    private ImageView carLeft;
    private ImageView carRight;
    private ImageView carBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        carTop = findViewById(R.id.carTop);
        carLeft = findViewById(R.id.carLeft);
        carRight = findViewById(R.id.carRight);
        carBottom = findViewById(R.id.carBottom);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2500);
        AnimationSet animationSet = new AnimationSet(true);
        // Animation for carTop - move from top to center
        Animation animationTop = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, -1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f
        );
        animationTop.setDuration(2000); // Set the duration of the animation in milliseconds
        animationSet.addAnimation(animationTop);

        // Animation for carLeft - move from left to center
        Animation animationLeft = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, -1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0
        );
        animationLeft.setDuration(2000); // Set the duration of the animation in milliseconds
        animationSet.addAnimation(animationLeft);

        // Animation for carRight - move from right to center
        Animation animationRight = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f
        );
        animationRight.setDuration(2000); // Set the duration of the animation in milliseconds
        animationSet.addAnimation(animationRight);

        // Animation for carBottom - move from bottom to center
        Animation animationBottom = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f
        );
        animationBottom.setDuration(2000); // Set the duration of the animation in milliseconds
        animationSet.addAnimation(animationBottom);

        // Start the animation for all cars simultaneously
        carTop.startAnimation(animationSet);
        carLeft.startAnimation(animationSet);
        carRight.startAnimation(animationSet);
        carBottom.startAnimation(animationSet);
    }
}








