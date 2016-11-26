package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Factor4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor4);
    }

    public void onRateF4Click(View v) {
        // ** if next button is clicked
        if (v.getId() == R.id.btnFactor4) {

            EditText rateF4O1 = (EditText) findViewById(R.id.rateF4O1);
            EditText rateF4O2 = (EditText) findViewById(R.id.rateF4O2);
            EditText rateF4O3 = (EditText) findViewById(R.id.rateF4O3);
            EditText rateF4O4 = (EditText) findViewById(R.id.rateF4O4);
            EditText rateF4O5 = (EditText) findViewById(R.id.rateF4O5);

            String rateF4O1str = rateF4O1.getText().toString();
            String rateF4O2str = rateF4O2.getText().toString();
            String rateF4O3str = rateF4O3.getText().toString();
            String rateF4O4str = rateF4O4.getText().toString();
            String rateF4O5str = rateF4O5.getText().toString();

            // convert them into integer
            int rateF4O1num = Integer.parseInt(rateF4O1str);
            int rateF4O2num = Integer.parseInt(rateF4O2str);
            int rateF4O3num = Integer.parseInt(rateF4O3str);
            int rateF4O4num = Integer.parseInt(rateF4O4str);
            int rateF4O5num = Integer.parseInt(rateF4O5str);

            //insert the details in db
            //Decision d = new Decision();
            // d.setOption(option1str);

            //helper.addDecision(d);

            //passing options to factors

            Intent i = new Intent(Factor4.this, Factor5.class);
            startActivity(i);

        }
    }
}
