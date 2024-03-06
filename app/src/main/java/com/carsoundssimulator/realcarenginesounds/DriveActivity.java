package com.carsoundssimulator.realcarenginesounds;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.applovin.mediation.ads.MaxAdView;


public class DriveActivity extends AppCompatActivity {
    ImageView carImage, carBack, carOwnHorn, carBreak, carEngine, carRace;
    TextView tvCarName;
    private MediaPlayer mediaPlayer, engineSound, hornSound, accelerateSound, breakSound;
    boolean isPlaying = false;
    boolean engineStartImage = false;
    boolean isEngineStart = false;
    MaxAdView maxBanner;

    @SuppressLint({"MissingInflatedId", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        setContentView(R.layout.activity_drive);

        carImage = findViewById(R.id.CarImage);
        carBack = findViewById(R.id.iv_back);

        carOwnHorn = findViewById(R.id.iv_car_horn);
        carBreak = findViewById(R.id.iv_break);
        carEngine = findViewById(R.id.iv_engine);
        carRace = findViewById(R.id.iv_race);
        tvCarName = findViewById(R.id.tvCarName);

        // -----> for Banner AppLovin Ads
        maxBanner = findViewById(R.id.maxBannerAd);
        maxBanner.setVisibility(View.VISIBLE);
        maxBanner.loadAd();

        // Define the animations
        Animation moveAnimation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 1.0f, Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0);
        moveAnimation.setDuration(1000); // Set the duration of the animation in milliseconds

        Animation stopAnimation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0);
        stopAnimation.setDuration(0); // Set the duration to 0 to hold the final position

        // Create an AnimationSet and add the animations
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(moveAnimation);
        animationSet.addAnimation(stopAnimation);

        // Start the animation
        carImage.startAnimation(animationSet);

        breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak);

        int number = getIntent().getIntExtra("num", 1);
        if (number == 1) {
            carImage.setImageResource(R.drawable.carenginesound_1);
            tvCarName.setText("BENTLEY BENTAYGA W12");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak1);

            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_1);
            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_1);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_1);
        } else if (number == 2) {
            carImage.setImageResource(R.drawable.carenginesound_2);
            tvCarName.setText("BENTLEY BENTAYGA W12");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak2);

            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_2);
            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_2);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_2);
        } else if (number == 3) {
            carImage.setImageResource(R.drawable.carenginesound_3);
            tvCarName.setText("DODGE CHARGER HELLCAT");
            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_3);
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak3);


            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_3);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_3);
        } else if (number == 4) {
            carImage.setImageResource(R.drawable.carenginesound_4);
            tvCarName.setText("HENNESSEY VENOM GT");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak4);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_4);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_4);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_4);
        } else if (number == 5) {
            carImage.setImageResource(R.drawable.carenginesound_5);
            tvCarName.setText("HONDA INTEGRA TYPE R");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak5);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_5);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_5);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_5);
        } else if (number == 6) {
            carImage.setImageResource(R.drawable.carenginesound_6);
            tvCarName.setText("HONDA $2000");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_6);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_6);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_6);
        } else if (number == 7) {
            carImage.setImageResource(R.drawable.carenginesound_7);
            tvCarName.setText("KOENIGSEGG REGRA");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak1);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_7);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_7);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_7);
        } else if (number == 8) {
            carImage.setImageResource(R.drawable.carenginesound_8);
            tvCarName.setText("MCLAREN SENNA");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak2);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_8);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_8);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_8);
        } else if (number == 9) {
            carImage.setImageResource(R.drawable.carenginesound_9);
            tvCarName.setText("MERCEDES AMG $63");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak3);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_9);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_9);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_9);
        } else if (number == 10) {
            carImage.setImageResource(R.drawable.carenginesound_10);
            tvCarName.setText("MERCEDES MAYBACH V12");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak4);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_10);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_10);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_10);
        } else if (number == 11) {
            carImage.setImageResource(R.drawable.carenginesound_11);
            tvCarName.setText("PAGANI HUAYRA");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak5);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_11);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_11);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_11);
        } else if (number == 12) {
            carImage.setImageResource(R.drawable.carenginesound_12);
            tvCarName.setText("PORSCHE 911 GT RS");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_12);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_12);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_12);
        } else if (number == 13) {
            carImage.setImageResource(R.drawable.carenginesound_13);
            tvCarName.setText("RANGE ROVER SPORT SVR");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak1);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_13);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_13);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_13);
        } else if (number == 14) {
            carImage.setImageResource(R.drawable.carenginesound_14);
            tvCarName.setText("RENAULT CLIO V6");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak2);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_14);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_14);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_14);
        } else if (number == 15) {
            carImage.setImageResource(R.drawable.carenginesound_15);
            tvCarName.setText("ROLLS ROYCE DAWN");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak3);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_15);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_15);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_15);
        } else if (number == 16) {
            carImage.setImageResource(R.drawable.carenginesound_16);
            tvCarName.setText("SKYLINE R34");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak4);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_16);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_16);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_16);
        } else if (number == 17) {
            carImage.setImageResource(R.drawable.carenginesound_17);
            tvCarName.setText("TOYOTA SUPRA 2JZ");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak5);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_17);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_17);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_17);
        } else if (number == 18) {
            carImage.setImageResource(R.drawable.carenginesound_18);
            tvCarName.setText("VW GOLF MK4 R32");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_18);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_18);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_18);
        } else if (number == 19) {
            carImage.setImageResource(R.drawable.carenginesound_19);
            tvCarName.setText("VW GOLF MK7");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak2);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_19);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_19);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_19);
        } else if (number == 20) {
            carImage.setImageResource(R.drawable.carenginesound_20);
            tvCarName.setText("VW GOLF R");
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak3);

            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_20);
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_20);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_20);
        } else if (number == 21) {
            carImage.setImageResource(R.drawable.carenginesound_16);
            tvCarName.setText("SKYLINE");
            accelerateSound = MediaPlayer.create(DriveActivity.this, R.raw.caracceleratorengine_16);
            breakSound = MediaPlayer.create(DriveActivity.this, R.raw.carbreak5);
            hornSound = MediaPlayer.create(DriveActivity.this, R.raw.supercarhorn_18);
            engineSound = MediaPlayer.create(DriveActivity.this, R.raw.carstartbuttonsound_3);
        }


        carEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isEngineStart = !isEngineStart;
                if (isEngineStart) {
                    playEngineSound();
                    carEngine.setImageResource(R.drawable.img_power_on2);
                } else {
                    engineSound.pause();
                    engineSound.seekTo(0);
                    carEngine.setImageResource(R.drawable.img_power_off);
                }
            }
        });
        carOwnHorn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    playHornSound();
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP || motionEvent.getAction() == MotionEvent.ACTION_CANCEL) {
                    hornSound.pause();
                    hornSound.seekTo(0);
                }
                return true;
            }
        });
        hornSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                hornSound.start();
            }
        });

        carBreak.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (isEngineStart) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        playBreakSound();
                    } else if (motionEvent.getAction() == MotionEvent.ACTION_UP || motionEvent.getAction() == MotionEvent.ACTION_CANCEL) {
                        breakSound.pause();
                        breakSound.seekTo(0);
                    }
                } else {
                    Toast.makeText(DriveActivity.this, "Start the Engine First", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        carRace.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (isEngineStart) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        playAccelerateSound();
                    } else if (motionEvent.getAction() == MotionEvent.ACTION_UP || motionEvent.getAction() == MotionEvent.ACTION_CANCEL) {
                        accelerateSound.pause();
                        accelerateSound.seekTo(0);
                    }
                } else {
                    Toast.makeText(DriveActivity.this, "Start the Engine First", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        carBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    // Methods to Control Sounds
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (engineSound != null) {
            engineSound.release();
            engineSound = null;
        }
        if (hornSound != null) {
            hornSound.release();
            hornSound = null;
        }
        if (accelerateSound != null) {
            accelerateSound.release();
            accelerateSound = null;
        }
        if (breakSound != null) {
            breakSound.release();
            breakSound = null;
        }
    }

    void playEngineSound() {
        if (engineSound != null) {
            if (engineSound.isPlaying()) {
                engineSound.seekTo(0);
            } else {
                engineSound.start();
            }
        }
    }

    void playHornSound() {
        if (hornSound != null) {
            if (hornSound.isPlaying()) {
                hornSound.seekTo(0);
            } else {
                hornSound.start();
            }
        }
    }

    void playAccelerateSound() {
        if (accelerateSound != null) {
            if (accelerateSound.isPlaying()) {
                accelerateSound.seekTo(0);
            } else {
                accelerateSound.start();
            }
        }
    }

    void playBreakSound() {
        if (breakSound != null) {
            if (breakSound.isPlaying()) {
                breakSound.seekTo(0);
            } else {
                breakSound.start();
            }
        }
    }

}
