package com.example.dineshkumarjain.sunshine.Sync;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by Dinesh kumar jain on 14-03-2018.
 */

public class SunshineSyncIntentService extends IntentService {
    //   Create a constructor that calls super and passes the name of this class
    public SunshineSyncIntentService() {
        super("SunshineSyncIntentService");
    }

    //   Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
    @Override
    protected void onHandleIntent(Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}
