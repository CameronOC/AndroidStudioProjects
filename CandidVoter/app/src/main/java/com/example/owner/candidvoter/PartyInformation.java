package com.example.owner.candidvoter;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.owner.candidvoter.ReplaceFont.replaceDefaultFont;


public class PartyInformation extends ActionBarActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party_information);
        // font formatting
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "EBGaramond08-Regular.ttf");
        TextView demoFont = (TextView) findViewById(R.id.DCandidates);
        TextView rebFont = (TextView) findViewById(R.id.RCandidates);
        TextView rPartyFont = (TextView) findViewById(R.id.republicans);
        TextView dPartyFont = (TextView) findViewById(R.id.democrats);
        dPartyFont.setTypeface(myTypeface);
        rPartyFont.setTypeface(myTypeface);
        demoFont.setTypeface(myTypeface);
        rebFont.setTypeface(myTypeface);

        //Buttons
        Button democrat = (Button) findViewById(R.id.democrats);
        Button republican = (Button) findViewById(R.id.republicans);
        Button republicanParty = (Button) findViewById(R.id.RCandidates);
        Button democraticParty = (Button) findViewById(R.id.DCandidates);
        // Button clicks
        democrat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(PartyInformation.this, DemocraticParty.class);
                startActivity(myIntent);
            }
        });
        republican.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(PartyInformation.this, RepublicanParty.class);
                startActivity(myIntent);
            }
        });
        democraticParty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(PartyInformation.this, Democrats.class);
                startActivity(myIntent);
            }
        });
        republicanParty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(PartyInformation.this, Republicans.class);
                startActivity(myIntent);
            }
        });
        setTitle("PartyInformation");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_party_information, menu);
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
