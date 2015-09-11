package com.example.owner.candidvoter;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class Democrats extends ActionBarActivity implements AdapterView.OnItemClickListener {
    GridView gridView;
    public boolean democrat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_democrats);
        setTitle("Democrats");
        gridView = (GridView)findViewById(R.id.activity_democrat_gridView);
        gridView.setAdapter(new DemocraticGrid(this));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onResume(){
        super.onResume();
        democrat = true;
    }

    @Override
    public void onPause(){
        super.onPause();
        democrat = false;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId()== R.id.activity_democrat_gridView)
            switch (position) {
                case 0: {
                    startActivity(new Intent(this, BernieSanders.class));
                    break;
                }
                case 1:{
                    startActivity(new Intent(this, HilaryClinton.class));
                    break;
                }
                default:{
                    break;
                }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_democrats, menu);
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
