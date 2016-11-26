package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Factor2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor2);
    }

    public void onRateF2Click(View v) {
        // ** if next button is clicked
        if (v.getId() == R.id.btnFactor2) {

            EditText rateF2O1 = (EditText) findViewById(R.id.rateF2O1);
            EditText rateF2O2 = (EditText) findViewById(R.id.rateF2O2);
            EditText rateF2O3 = (EditText) findViewById(R.id.rateF2O3);
            EditText rateF2O4 = (EditText) findViewById(R.id.rateF2O4);
            EditText rateF2O5 = (EditText) findViewById(R.id.rateF2O5);

            String rateF2O1str = rateF2O1.getText().toString();
            String rateF2O2str = rateF2O2.getText().toString();
            String rateF2O3str = rateF2O3.getText().toString();
            String rateF2O4str = rateF2O4.getText().toString();
            String rateF2O5str = rateF2O5.getText().toString();

            // convert them into integer
            int rateF2O1num = Integer.parseInt(rateF2O1str);
            int rateF2O2num = Integer.parseInt(rateF2O2str);
            int rateF2O3num = Integer.parseInt(rateF2O3str);
            int rateF2O4num = Integer.parseInt(rateF2O4str);
            int rateF2O5num = Integer.parseInt(rateF2O5str);

            //insert the details in db
            //Decision d = new Decision();
            // d.setOption(option1str);

            //helper.addDecision(d);

            //passing options to factors

            Intent i = new Intent(Factor2.this, Factor3.class);
            startActivity(i);

        }
    }
}
