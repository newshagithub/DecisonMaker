package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Factor5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor5);
    }
    public void onRateF5Click(View v) {
        // ** if next button is clicked
        if (v.getId() == R.id.btnFactor5) {

            EditText rateF5O1 = (EditText) findViewById(R.id.rateF5O1);
            EditText rateF5O2 = (EditText) findViewById(R.id.rateF5O2);
            EditText rateF5O3 = (EditText) findViewById(R.id.rateF5O3);
            EditText rateF5O4 = (EditText) findViewById(R.id.rateF5O4);
            EditText rateF5O5 = (EditText) findViewById(R.id.rateF5O5);

            String rateF5O1str = rateF5O1.getText().toString();
            String rateF5O2str = rateF5O2.getText().toString();
            String rateF5O3str = rateF5O3.getText().toString();
            String rateF5O4str = rateF5O4.getText().toString();
            String rateF5O5str = rateF5O5.getText().toString();

            // convert them into integer
            int rateF5O1num = Integer.parseInt(rateF5O1str);
            int rateF5O2num = Integer.parseInt(rateF5O2str);
            int rateF5O3num = Integer.parseInt(rateF5O3str);
            int rateF5O4num = Integer.parseInt(rateF5O4str);
            int rateF5O5num = Integer.parseInt(rateF5O5str);

            //insert the details in db
            //Decision d = new Decision();
            // d.setOption(option1str);

            //helper.addDecision(d);

            //passing options to factors

            Intent i = new Intent(Factor5.this, Result.class);
            startActivity(i);

        }
    }
}
