package com.example.shauryasingh.firstclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button) findViewById(R.id.GoButton);
        final TextView t1=(TextView) findViewById(R.id.textView1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          //      Log.d("ok","success");
                Intent intent= new Intent(MainActivity.this, sendActivity.class);
                startActivity(intent);
            }
        });
    }
}

