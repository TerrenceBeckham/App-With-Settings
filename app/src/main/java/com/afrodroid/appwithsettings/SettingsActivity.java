package com.afrodroid.appwithsettings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display Fragment as main content.
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content,
                new SettingsFragment()).commit();
    }
}
