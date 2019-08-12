package com.example.shauryasingh.firstclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        TextView textView1=(TextView) findViewById(R.id.textView1);
        //textView1.setText(getString(R.string.success));
        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeAct=new Intent(sendActivity.this,MainActivity.class);
                startActivity(homeAct);

            }
        });
    }
}
