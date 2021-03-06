package com.martin.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by csmartin on 17/4/2.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
