package com.carsoundssimulator.realcarenginesounds;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.onesignal.OneSignal;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, linearLayout14, linearLayout15, linearLayout16, linearLayout17, linearLayout18, linearLayout19, linearLayout20, linearLayout21;
    LinearLayout lShare, lMore, lRate;
    AppCompatImageButton ibSetting;
    private MaxInterstitialAd interstitialAd;
    MaxAdView maxBanner;
    int addCounter = 0;
    private int retryAttempt;
    // For One Signal APP_ID (Notification)
    private static final String ONESIGNAL_APP_ID = "347eacab-4b9b-46b5-918a-dcd871b32e4d";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.activity_main);

        //   call method for one signal app notification
        oneSignal();
        createInterstitialAd();
        ibSetting = findViewById(R.id.ib_setting);
        linearLayout1 = findViewById(R.id.linear1);
        linearLayout2 = findViewById(R.id.linear2);
        linearLayout3 = findViewById(R.id.linear3);
        linearLayout4 = findViewById(R.id.linear4);
        linearLayout5 = findViewById(R.id.linear5);
        linearLayout6 = findViewById(R.id.linear6);
        linearLayout7 = findViewById(R.id.linear7);
        linearLayout8 = findViewById(R.id.linear8);
        linearLayout9 = findViewById(R.id.linear9);
        linearLayout10 = findViewById(R.id.linear10);
        linearLayout11 = findViewById(R.id.linear11);
        linearLayout12 = findViewById(R.id.linear12);
        linearLayout13 = findViewById(R.id.linear13);
        linearLayout14 = findViewById(R.id.linear14);
        linearLayout15 = findViewById(R.id.linear15);
        linearLayout16 = findViewById(R.id.linear16);
        linearLayout17 = findViewById(R.id.linear17);
        linearLayout18 = findViewById(R.id.linear18);
        linearLayout19 = findViewById(R.id.linear19);
        linearLayout20 = findViewById(R.id.linear20);
        linearLayout21 = findViewById(R.id.linear21);


        adjustLayout();

        // -----> Banner AppLovin
        maxBanner = findViewById(R.id.maxBannerAd);
        maxBanner.setVisibility(View.VISIBLE);
        maxBanner.loadAd();
        AppLovinSdk.getInstance(this).setMediationProvider("max");
        AppLovinSdk.initializeSdk(this, new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration) {
                // AppLovin SDK is initialized, start loading ads
                AppLovinSdk.getInstance(MainActivity.this).showMediationDebugger();
            }
        });
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 1);
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 2);
                startActivity(intent);

            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 3);
                startActivity(intent);

            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 4);
                startActivity(intent);

            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 5);
                startActivity(intent);
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 6);
                startActivity(intent);
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 7);
                startActivity(intent);
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 8);
                startActivity(intent);

            }
        });
        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 9);
                startActivity(intent);

            }
        });
        linearLayout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 10);
                startActivity(intent);
            }
        });
        linearLayout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 11);
                startActivity(intent);

            }
        });
        linearLayout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 12);
                startActivity(intent);

            }
        });
        linearLayout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 13);
                startActivity(intent);

            }
        });
        linearLayout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 14);
                startActivity(intent);

            }
        });
        linearLayout15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 15);
                startActivity(intent);

            }
        });
        linearLayout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 16);
                startActivity(intent);

            }
        });
        linearLayout17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 17);
                startActivity(intent);

            }
        });
        linearLayout18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 18);
                startActivity(intent);

            }
        });
        linearLayout19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 19);
                startActivity(intent);

            }
        });
        linearLayout20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 20);
                startActivity(intent);

            }
        });
        linearLayout21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addCounter == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                Intent intent = new Intent(MainActivity.this, DriveActivity.class);
                intent.putExtra("num", 21);
                startActivity(intent);

            }
        });

        ibSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog();
            }
        });
    }

    // custom dialog for setting
    void customDialog() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.custom_dialog_setting);
        lShare = dialog.findViewById(R.id.linear_share);
        lMore = dialog.findViewById(R.id.linear_setting);
        lRate = dialog.findViewById(R.id.linear_rate);

        lShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "https://play.google.com/store/apps/details?id=" + getPackageName();
                String sub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
                myIntent.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });

        lRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
                }
            }
        });
        lMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:" + "Codingkey")));
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Codingkey")));

                }
            }
        });
        dialog.show();
    }

    void createInterstitialAd() {
        interstitialAd = new MaxInterstitialAd("e65168ca79401400", this);
        interstitialAd.setListener(new MaxAdListener() {
            // MAX Ad Listener
            @Override
            public void onAdLoaded(final MaxAd maxAd) {
                // Interstitial ad is ready to be shown. interstitialAd.isReady() will now return 'true'
                // Reset retry attempt
                retryAttempt = 0;
            }

            @Override
            public void onAdLoadFailed(final String adUnitId, final MaxError error) {
                // Interstitial ad failed to load
                // AppLovin recommends that you retry with exponentially higher delays up to a maximum delay (in this case 64 seconds)
                retryAttempt++;
                long delayMillis = TimeUnit.SECONDS.toMillis((long) Math.pow(2, Math.min(6, retryAttempt)));
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        interstitialAd.loadAd();
                    }
                }, delayMillis);
            }

            @Override
            public void onAdDisplayFailed(final MaxAd maxAd, final MaxError error) {
                // Interstitial ad failed to display. AppLovin recommends that you load the next ad.
                interstitialAd.loadAd();
            }

            @Override
            public void onAdDisplayed(final MaxAd maxAd) {
            }

            @Override
            public void onAdClicked(final MaxAd maxAd) {
            }

            @Override
            public void onAdHidden(final MaxAd maxAd) {
                // Interstitial ad is hidden. Pre-load the next ad
                interstitialAd.loadAd();
            }
        });
        // Load the first ad
        interstitialAd.loadAd();
    }

    private void alertDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                .setCancelable(false)
                .setTitle("EXIT")
                .setIcon(R.drawable.baseline_exit_to_app_24)
                .setMessage("Are You want to Exit it")

                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                })
                .create();
        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        alertDialog();
    }

    // -----> One Signal App Notification
    public void oneSignal() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }

    private void adjustLayout() {
        int screenSize = getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK;

        if (screenSize == Configuration.SCREENLAYOUT_SIZE_SMALL) {
            LinearLayout parentLayout = findViewById(R.id.linear_parent);
            int childCount = parentLayout.getChildCount();

            for (int i = 0; i < childCount; i++) {
                View childView = parentLayout.getChildAt(i);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childView.getLayoutParams();
                layoutParams.setMargins(0, 10, 0, 10); // Example: Add margins to each child LinearLayout
                childView.setLayoutParams(layoutParams);
            }
        }
    }
}