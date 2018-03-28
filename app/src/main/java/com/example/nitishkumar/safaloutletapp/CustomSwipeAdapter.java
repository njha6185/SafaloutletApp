package com.example.nitishkumar.safaloutletapp;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by NITISH KUMAR on 26-03-2018.
 */

public class CustomSwipeAdapter extends PagerAdapter{

    private Integer [] image_resources = {R.drawable.safal_logo1,R.drawable.safal2,R.drawable.safal1, R.drawable.safal5,R.drawable.safal6,R.drawable.safal7,
            R.drawable.safal8,R.drawable.safal9, R.drawable.safal10,R.drawable.safal11,R.drawable.safal12,R.drawable.safal13,R.drawable.safal14,R.drawable.safal15};

    private int [] string_resources = {R.string.safal_intro, R.string.safal_fruits, R.string.safal_onion, R.string.safal_veg, R.string.safal_frozen_corn,
            R.string.safal_aloo_tikki, R.string.safal_besan, R.string.safal_mixed_vegitable, R.string.frozen_green_peas, R.string.safal_hara_kebab,
            R.string.safal_jackfruit, R.string.safal_honey, R.string.safal_tomato, R.string.safal_pulses};

    private String[] heading = {"ABOUT SAFAL", "FRUITS", "SAFAL EASY ONION", "VEGETABLES", "FROGEN CORN", "ALOO TIKKI", "BESAN",
    "FROZEN MIXED VEGETABLE", "FROZEN GREEN PEAS", "HARA BHARA KEBAB", "FROZEN JACKFRUIT", "HONEY", "TOMATO PUREE", "PULSES"};

    private Context ctx;
    LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout,null);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.image_view);
        TextView textView = (TextView)item_view.findViewById(R.id.text_define);
        TextView textView1 = (TextView)item_view.findViewById(R.id.heading_text);
        imageView.setImageResource(image_resources[position]);
        textView.setText(string_resources[position]);
        textView1.setText(heading[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(item_view,0);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}