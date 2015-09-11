package com.example.owner.candidvoter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Owner on 7/28/2015.
 */
    public class DemocraticGrid extends BaseAdapter {
    private Context mContext;

    public DemocraticGrid(Context c) {
        mContext = c;
    }

    public int getCount() {
            return dThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
            imageView.setImageResource(dThumbIds[position]);
            return imageView;
    }

    // references to our images
    private Integer[] dThumbIds = {
            R.drawable.berniesanders,
            R.drawable.hilaryclinton
    };

}

