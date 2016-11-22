package com.example.newsha.decisonmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        String dtopic = getIntent().getStringExtra("TVdtopic");
        TextView tv = (TextView)findViewById(R.id.TVdtopic);
        tv.setText(dtopic);
    }
}
