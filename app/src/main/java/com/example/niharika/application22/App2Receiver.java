package com.example.niharika.application22;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class App2Receiver extends BroadcastReceiver {

    @Override
    //on receiving the broadcast it toasts a message and takes you to the gallery
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Application22 in action! ",Toast.LENGTH_LONG).show() ;
        Intent intent1= new Intent(context, MainActivity.class);
        context.startActivity(intent1);

    }
}
