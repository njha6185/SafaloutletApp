package com.example.nitishkumar.safaloutletapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        change_logo_and_name();
    }

    public void change_logo_and_name()
    {
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        Button button = (Button)findViewById(R.id.button_actionbar);
//        button.setText("PRODUCTS");
    }

//    public void product_info_page(View v)
//    {
//        Toast.makeText(HomeActivity.this, "Product Information", Toast.LENGTH_LONG).show();
//        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
//        startActivity(intent);
//        finish();
//    }
}