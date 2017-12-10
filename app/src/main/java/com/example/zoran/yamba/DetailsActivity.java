package com.example.zoran.yamba;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;

/**
 * Created by Zoran on 10.12.2017.
 */

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Check if this activity was created before
        if (savedInstanceState == null) { //
            // Create a fragment
            Fragment fragment = new DetailsFragment();
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment,
                            fragment.getClass().getSimpleName()).commit();
        }
    }

}
