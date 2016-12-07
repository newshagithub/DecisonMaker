package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Factor1 extends AppCompatActivity {

    // ** class-level variables
    String dtopic = "";
    String option1 = "";
    String option2 = "";
    String option3 = "";
    String option4 = "";
    String option5 = "";
    String factor1 = "";
    String factor2 = "";
    String factor3 = "";
    String factor4 = "";
    String factor5 = "";
    int weight1num = 0;
    int weight2num = 0;
    int weight3num = 0;
    int weight4num = 0;
    int weight5num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor1);


            factor1 = getIntent().getStringExtra("TVfactor1");
            TextView tv = (TextView) findViewById(R.id.TVfactor1);
            tv.setText(factor1);

            option1 = getIntent().getStringExtra("TVoption1");
            TextView tv1 = (TextView) findViewById(R.id.TVoption1);
            tv1.setText(option1);

            option2 = getIntent().getStringExtra("TVoption2");
            TextView tv2 = (TextView) findViewById(R.id.TVoption2);
            tv2.setText(option2);

            option3 = getIntent().getStringExtra("TVoption3");
            TextView tv3 = (TextView) findViewById(R.id.TVoption3);
            tv3.setText(option3);

            option4 = getIntent().getStringExtra("TVoption4");
            TextView tv4 = (TextView) findViewById(R.id.TVoption4);
            tv4.setText(option4);

            option5 = getIntent().getStringExtra("TVoption5");
            TextView tv5 = (TextView) findViewById(R.id.TVoption5);
            tv5.setText(option5);

            // ** topic
            dtopic = getIntent().getStringExtra("TVdtopic");

            // ** rest of factors
            factor2 = getIntent().getStringExtra("TVfactor2");
            factor3 = getIntent().getStringExtra("TVfactor3");
            factor4 = getIntent().getStringExtra("TVfactor4");
            factor5 = getIntent().getStringExtra("TVfactor5");

            // ** weights
            weight1num = getIntent().getIntExtra("TVweight1", 0);
            weight2num = getIntent().getIntExtra("TVweight2", 0);
            weight3num = getIntent().getIntExtra("TVweight3", 0);
            weight4num = getIntent().getIntExtra("TVweight4", 0);
            weight5num = getIntent().getIntExtra("TVweight5", 0);

        }

    public void onRateF1Click(View v) {
        // ** if next button is clicked
        if (v.getId() == R.id.btnFactor1) {

            EditText rateF1O1 = (EditText) findViewById(R.id.rateF1O1);
            EditText rateF1O2 = (EditText) findViewById(R.id.rateF1O2);
            EditText rateF1O3 = (EditText) findViewById(R.id.rateF1O3);
            EditText rateF1O4 = (EditText) findViewById(R.id.rateF1O4);
            EditText rateF1O5 = (EditText) findViewById(R.id.rateF1O5);

            String rateF1O1str = rateF1O1.getText().toString();
            String rateF1O2str = rateF1O2.getText().toString();
            String rateF1O3str = rateF1O3.getText().toString();
            String rateF1O4str = rateF1O4.getText().toString();
            String rateF1O5str = rateF1O5.getText().toString();

            // convert them into integer
            int rateF1O1num = Integer.parseInt(rateF1O1str);
            int rateF1O2num = Integer.parseInt(rateF1O2str);
            int rateF1O3num = Integer.parseInt(rateF1O3str);
            int rateF1O4num = Integer.parseInt(rateF1O4str);
            int rateF1O5num = Integer.parseInt(rateF1O5str);

                //insert the details in db
                //Decision d = new Decision();
                // d.setOption(option1str);

                //helper.addDecision(d);

            //passing data to factor2
            Intent intent = new Intent(Factor1.this, Factor2.class);
            // ** topic
            intent.putExtra("TVdtopic", dtopic);
            // ** options
            intent.putExtra("TVoption1", option1);
            intent.putExtra("TVoption2", option2);
            intent.putExtra("TVoption3", option3);
            intent.putExtra("TVoption4", option4);
            intent.putExtra("TVoption5", option5);
            // ** factors
            intent.putExtra("TVfactor1", factor1);
            intent.putExtra("TVfactor2", factor2);
            intent.putExtra("TVfactor3", factor3);
            intent.putExtra("TVfactor4", factor4);
            intent.putExtra("TVfactor5", factor5);
            // ** weights
            intent.putExtra("weight1", weight1num);
            intent.putExtra("weight2", weight2num);
            intent.putExtra("weight3", weight3num);
            intent.putExtra("weight4", weight4num);
            intent.putExtra("weight5", weight5num);
            // ** rateF1
            intent.putExtra("rateF1O1", rateF1O1num);
            intent.putExtra("rateF1O2", rateF1O2num);
            intent.putExtra("rateF1O3", rateF1O3num);
            intent.putExtra("rateF1O4", rateF1O4num);
            intent.putExtra("rateF1O5", rateF1O5num);

            startActivity(intent);

            }

        }
}
