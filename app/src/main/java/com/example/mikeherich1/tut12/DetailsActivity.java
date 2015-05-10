package com.example.mikeherich1.tut12;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

/**
 * Created by mikeherich1 on 09.05.15.
 */
public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){

            finish();
            return;

        }

        if(savedInstanceState == null){

            DetailsFragment details = new DetailsFragment();

            details.setArguments(getIntent().getExtras());

            getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();

        }

    }
}
