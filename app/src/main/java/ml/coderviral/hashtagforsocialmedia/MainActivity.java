package ml.coderviral.hashtagforsocialmedia;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;

    ImageView education,flowers,hacking,love,photography,sports,programming,technology,top;

    @Override
    protected void onRestart() {
        super.onRestart();

        AdRequest adRequest = new AdRequest.Builder().build();

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
// Call displayInterstitial() function
                displayInterstitial();
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdRequest adRequest = new AdRequest.Builder().build();

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
// Call displayInterstitial() function
                displayInterstitial();
            }
        });





        Toast.makeText(this, "Click on the Icon and it Paste hash tags anywhere", Toast.LENGTH_LONG).show();

        education=(ImageView)findViewById(R.id.imgEducation);
        flowers=(ImageView)findViewById(R.id.imgFlowers);
        hacking=(ImageView)findViewById(R.id.imgHacking);
        love=(ImageView)findViewById(R.id.imgLove);
        photography=(ImageView)findViewById(R.id.imgPhotography);
        sports=(ImageView)findViewById(R.id.imgSports);
        programming=(ImageView)findViewById(R.id.imgProgramming);
        technology=(ImageView)findViewById(R.id.imgTechnology);
        top=(ImageView)findViewById(R.id.imgTop);

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edu="#edchat #students #student #school #love #college #education #university #fun #instagood #studentlife #study #art #class #teacher #teachers #follow #like #friends  #instagram #motivation #india #music #learning  #happy #life #bhfyp";

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", edu);
                clipboard.setPrimaryClip(clip);


                Toast.makeText(MainActivity.this, "Education tags Coppied successfully", Toast.LENGTH_SHORT).show();
            }
        });

        flowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flo="#dusk #twilight #skylovers #fashion #picoftheday #travel #flower #followme #life #sea #cloudporn #iphonesia #f #happy #food #naturephotography #wedding #dog #amazing #design #instapic #photographer #style #naturelovers #cute #girl #lifestyle #tbt #instalike #black#flowers #nature #love #beautiful #photooftheday #sky #sun #like #sunset #blue #summer #beauty #instagood #photography #art #beach #tree #green #pretty #clouds #night #follow #red #sunrise #day #weather #photo #light #instagram #bhfyp";
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", flo);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Flowers tags Coppied successfully", Toast.LENGTH_SHORT).show();

            }
        });


        hacking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hack="#hack #tech #technology #hacking #hacker #techie #geek #instagood #computers #techy #laptops #electronics #screen #gadget #gadgets #nerd #instatech #iphone #photooftheday #electronic #hacks #device #coding #programming #linux #python #cybersecurity #hacked #security #bhfyp";
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", hack);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Hacking tags Coppied successfully", Toast.LENGTH_SHORT).show();


            }
        });


        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lov="#love #like #lovely #latenight #unique #bestestfriends  #something #friends #day #missing #smile #girl #happy  #cute #instadaily #fashion #me #smile #style #fun #summer #amazing #bestoftheday #instalike #igers #life #l #swag #friends #nature #sun #selfie #htfls #like #follow #instagood #photooftheday #beautiful #picoftheday #happy #followme";
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", lov);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Love tags Coppied successfully", Toast.LENGTH_SHORT).show();


            }
        });


        photography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String photo="#photo #photos #pic #pics #envywear #picture #pictures #snapshot #art #beautiful #instagood #picoftheday #photooftheday #color #all_shots #exposure #composition #focus #capture #moment #hdr #hdrspotters #hdrstyles_gf #hdri #hdroftheday #hdriphonegraphy #hdr_lovers #awesome_hdr";
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", photo);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Photography tags Coppied successfully", Toast.LENGTH_SHORT).show();


            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String spo="#sports #fitness #game #gym #sport #basketball #nba #fit #football #workout #training #love #nfl #motivation #bodybuilding #follow #fun #like #instagood #fitnessmotivation #music #fashion #health #soccer #mma  #athlete #muscle #boxing #ball";
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", spo);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Sports tags Coppied successfully", Toast.LENGTH_SHORT).show();

            }
        });


        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pro="#programming #programmer #coding #developer #html #css #javascript #webdeveloper #webdevelopment #webdesign #software #code #computer #tech #technology #php #java #coder #python #computerscience #development #like #softwaredeveloper #linux #programmers #codinglife #web #engineer #design #android #php #c";
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", pro);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Programming tags Coppied successfully", Toast.LENGTH_SHORT).show();
            }
        });


        technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tech="#technology #tech #love #art #instagood #iphone #computer #coding #software #programming #geek #business #programmer #android #instagram #electronics #fashion #innovation #techie #science #google  #life #developer #engineering #css #code";
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", tech);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Technology tags Coppied successfully", Toast.LENGTH_SHORT).show();

            }
        });


        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to="#love #followback #happy #smile #beautiful #instagramers #envywear #tweegram #photooftheday #20likes #amazing #smile #follow4follow #like4like #look #instalike #igers #picoftheday #food #instadaily #instafollow #followme #girl #instagood #bestoftheday #instacool #envywearco #follow #colorful #style #swag";
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tags:", to);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Technology tags Coppied successfully", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
