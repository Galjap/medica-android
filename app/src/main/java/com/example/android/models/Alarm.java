package com.example.android.models;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;

public class Alarm extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer mediaplayer = MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mediaplayer.start();
    }
}
