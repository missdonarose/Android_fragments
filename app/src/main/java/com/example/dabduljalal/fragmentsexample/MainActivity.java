package com.example.dabduljalal.fragmentsexample;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * This project contains POC for the following:
 * 1. Add a fragment through XML
 * 2. Add a fragment programmatically.
 * 3. Replace a fragment at runtime.
 * 4. Fragment to activity communication.
 * 5. Activity to fragment communication:
 *  5.a. to an existing fragment
 *  5.b. to a newly created fragment.
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
