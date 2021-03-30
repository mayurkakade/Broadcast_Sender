package com.example.broadcastsender;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.send_broadcast)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("com.example.orderedbroadcastreceiver.EXAMPLE_ACTION");
                intent.setPackage("com.example.orderedbroadcastreceiver");

                Bundle bundle = new Bundle();
                bundle.putString("stringExtra", "BundleStart");

                sendOrderedBroadcast(intent, null, new ExampleBroadcastReceiverTwo(), null, 0," Starting Data ", bundle);

            }
        });

    }
}