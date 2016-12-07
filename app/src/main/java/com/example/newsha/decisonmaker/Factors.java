package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Factors extends AppCompatActivity {

    // ** class-level variables
    String dtopic = "";
    String option1 = "";
    String option2 = "";
    String option3 = "";
    String option4 = "";
    String option5 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factors);


            option1 = getIntent().getStringExtra("TVoption1");
            option2 = getIntent().getStringExtra("TVoption2");
            option3 = getIntent().getStringExtra("TVoption3");
            option4 = getIntent().getStringExtra("TVoption4");
            option5 = getIntent().getStringExtra("TVoption5");


    }
    public void onAddClick(View v) {
        // ** if add button is clicked
        if (v.getId() == R.id.btnFactors) {

            EditText factor1 = (EditText) findViewById(R.id.etFactor1);
            EditText factor2 = (EditText) findViewById(R.id.etFactor2);
            EditText factor3 = (EditText) findViewById(R.id.etFactor3);
            EditText factor4 = (EditText) findViewById(R.id.etFactor4);
            EditText factor5 = (EditText) findViewById(R.id.etFactor5);

            String factor1str = factor1.getText().toString();
            String factor2str = factor2.getText().toString();
            String factor3str = factor3.getText().toString();
            String factor4str = factor4.getText().toString();
            String factor5str = factor5.getText().toString();

            // weight for each factor
            EditText wfactor1 = (EditText) findViewById(R.id.ratef1);
            EditText wfactor2 = (EditText) findViewById(R.id.ratef2);
            EditText wfactor3 = (EditText) findViewById(R.id.ratef3);
            EditText wfactor4 = (EditText) findViewById(R.id.ratef4);
            EditText wfactor5 = (EditText) findViewById(R.id.ratef5);

            String ratef1 = wfactor1.getText().toString();
            String ratef2 = wfactor2.getText().toString();
            String ratef3 = wfactor3.getText().toString();
            String ratef4 = wfactor4.getText().toString();
            String ratef5 = wfactor5.getText().toString();

            // convert them into integer
            int wf1num = Integer.parseInt(ratef1);
            int wf2num = Integer.parseInt(ratef2);
            int wf3num = Integer.parseInt(ratef3);
            int wf4num = Integer.parseInt(ratef4);
            int wf5num = Integer.parseInt(ratef5);

            // check if at least 1 factor are entered
            if ((factor1str == null || factor1str.trim().equals("null") || factor1str.trim()
                    .length() <= 0)) {

                //popup error msg
                Toast pass = Toast.makeText(Factors.this, "Please enter at least 1 factor. :)", Toast.LENGTH_SHORT);
                pass.show();

            } else {

                //insert the details in db
                //Decision d = new Decision();
                // d.setFactor(factor1str);

                //helper.addDecision(d);

                // passing on data to factor1
                Intent intent = new Intent(Factors.this, Factor1.class);
                // ** topic
                intent.putExtra("TVdtopic", dtopic);
                // ** options
                intent.putExtra("TVoption1", option1);
                intent.putExtra("TVoption2", option2);
                intent.putExtra("TVoption3", option3);
                intent.putExtra("TVoption4", option4);
                intent.putExtra("TVoption5", option5);
                // factors
                intent.putExtra("TVfactor1", factor1str);
                intent.putExtra("TVfactor2", factor2str);
                intent.putExtra("TVfactor3", factor3str);
                intent.putExtra("TVfactor4", factor4str);
                intent.putExtra("TVfactor5", factor5str);
                // weights
                intent.putExtra("TVweight1", wf1num);
                intent.putExtra("TVweight2", wf2num);
                intent.putExtra("TVweight3", wf3num);
                intent.putExtra("TVweight4", wf4num);
                intent.putExtra("TVweight5", wf5num);

                startActivity(intent);
            }

        }

    }

}