package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Factor3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor3);
    }

    public void onRateF3Click(View v) {
        // ** if next button is clicked
        if (v.getId() == R.id.btnFactor3) {

            EditText rateF3O1 = (EditText) findViewById(R.id.rateF3O1);
            EditText rateF3O2 = (EditText) findViewById(R.id.rateF3O2);
            EditText rateF3O3 = (EditText) findViewById(R.id.rateF3O3);
            EditText rateF3O4 = (EditText) findViewById(R.id.rateF3O4);
            EditText rateF3O5 = (EditText) findViewById(R.id.rateF3O5);

            String rateF3O1str = rateF3O1.getText().toString();
            String rateF3O2str = rateF3O2.getText().toString();
            String rateF3O3str = rateF3O3.getText().toString();
            String rateF3O4str = rateF3O4.getText().toString();
            String rateF3O5str = rateF3O5.getText().toString();

            // convert them into integer
            int rateF3O1num = Integer.parseInt(rateF3O1str);
            int rateF3O2num = Integer.parseInt(rateF3O2str);
            int rateF3O3num = Integer.parseInt(rateF3O3str);
            int rateF3O4num = Integer.parseInt(rateF3O4str);
            int rateF3O5num = Integer.parseInt(rateF3O5str);

            //insert the details in db
            //Decision d = new Decision();
            // d.setOption(option1str);

            //helper.addDecision(d);

            //passing options to factors

            Intent i = new Intent(Factor3.this, Factor4.class);
            startActivity(i);

        }
    }
}
