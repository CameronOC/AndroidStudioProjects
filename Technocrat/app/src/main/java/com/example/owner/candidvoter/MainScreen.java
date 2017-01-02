package com.example.owner.candidvoter;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.owner.candidvoter.ReplaceFont.*;

public class MainScreen extends ActionBarActivity {

    // Log messages for Starting, Resuming, Pausing, Restarting, Stopping, and Destroying
    // Used for debugging
    private static final String TAG = "LogMessges";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        Log.i(TAG, "onCreate");
        //Font
        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"EBGaramond08-Regular.ttf");
        TextView voteFont = (TextView) findViewById(R.id.votingButton);
        TextView partyFont = (TextView) findViewById(R.id.partyInformationButton);
        TextView aboutFont = (TextView) findViewById(R.id.AboutUs_botton);
        voteFont.setTypeface(myTypeface);
        partyFont.setTypeface(myTypeface);
        aboutFont.setTypeface(myTypeface);

        // Button variables
        Button voteButton = (Button)findViewById(R.id.votingButton);
        Button partyButton = (Button)findViewById(R.id.partyInformationButton);
        Button aboutUsButton = (Button)findViewById(R.id.AboutUs_botton);

        // Button clicks
        voteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainScreen.this, Vote.class);
                startActivity(myIntent);
            }
        });
        partyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainScreen.this, PartyInformation.class);
                startActivity(myIntent);
            }
        });
        aboutUsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainScreen.this, AboutUs.class);
                startActivity(myIntent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    // Standard Android functions
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
