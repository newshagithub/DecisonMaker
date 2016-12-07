package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Factor5 extends AppCompatActivity {

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
    int rateF1O1num = 0;
    int rateF1O2num = 0;
    int rateF1O3num = 0;
    int rateF1O4num = 0;
    int rateF1O5num = 0;
    int rateF2O1num = 0;
    int rateF2O2num = 0;
    int rateF2O3num = 0;
    int rateF2O4num = 0;
    int rateF2O5num = 0;
    int rateF3O1num = 0;
    int rateF3O2num = 0;
    int rateF3O3num = 0;
    int rateF3O4num = 0;
    int rateF3O5num = 0;
    int rateF4O1num = 0;
    int rateF4O2num = 0;
    int rateF4O3num = 0;
    int rateF4O4num = 0;
    int rateF4O5num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor5);

        factor5 = getIntent().getStringExtra("TVfactor5");
        TextView tv = (TextView) findViewById(R.id.TVfactor5);
        tv.setText(factor5);

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
        factor2 = getIntent().getStringExtra("TVfactor1");
        factor3 = getIntent().getStringExtra("TVfactor2");
        factor4 = getIntent().getStringExtra("TVfactor3");
        factor5 = getIntent().getStringExtra("TVfactor4");

        // ** weights
        weight1num = getIntent().getIntExtra("TVweight1", 0);
        weight2num = getIntent().getIntExtra("TVweight2", 0);
        weight3num = getIntent().getIntExtra("TVweight3", 0);
        weight4num = getIntent().getIntExtra("TVweight4", 0);
        weight5num = getIntent().getIntExtra("TVweight5", 0);

        // ** rateF1
        rateF1O1num = getIntent().getIntExtra("rateF1O1", 0);
        rateF1O2num = getIntent().getIntExtra("rateF1O2", 0);
        rateF1O3num = getIntent().getIntExtra("rateF1O3", 0);
        rateF1O4num = getIntent().getIntExtra("rateF1O4", 0);
        rateF1O5num = getIntent().getIntExtra("rateF1O5", 0);

        // ** rateF2
        rateF2O1num = getIntent().getIntExtra("rateF2O1", 0);
        rateF2O2num = getIntent().getIntExtra("rateF2O2", 0);
        rateF2O3num = getIntent().getIntExtra("rateF2O3", 0);
        rateF2O4num = getIntent().getIntExtra("rateF2O4", 0);
        rateF2O5num = getIntent().getIntExtra("rateF2O5", 0);

        // ** rateF3
        rateF3O1num = getIntent().getIntExtra("rateF3O1", 0);
        rateF3O2num = getIntent().getIntExtra("rateF3O2", 0);
        rateF3O3num = getIntent().getIntExtra("rateF3O3", 0);
        rateF3O4num = getIntent().getIntExtra("rateF3O4", 0);
        rateF3O5num = getIntent().getIntExtra("rateF3O5", 0);

        // ** rateF4
        rateF4O1num = getIntent().getIntExtra("rateF4O1", 0);
        rateF4O2num = getIntent().getIntExtra("rateF4O2", 0);
        rateF4O3num = getIntent().getIntExtra("rateF4O3", 0);
        rateF4O4num = getIntent().getIntExtra("rateF4O4", 0);
        rateF4O5num = getIntent().getIntExtra("rateF4O5", 0);

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
            //Decision d1 = new Decision();
            // d1.setTopic(dtopic);
            // d1.setOption(option1);
            // d1.setFactor(factor1);
            // d1.setWeight(weight1num);
            // d1.setF1rate(rateF1O1num);
            // d1.setF2rate(rateF2O1num);
            // d1.setF3rate(rateF3O1num);
            // d1.setF4rate(rateF4O1num);
            // d1.setF5rate(rateF5O1num);
            // d1.setResult(result1);

            //helper.addDecision(d1);

            //Decision d2 = new Decision();
            // d2.setTopic(dtopic);
            // d2.setOption(option2);
            // d2.setFactor(factor2);
            // d2.setWeight(weight2num);
            // d2.setF1rate(rateF1O2num);
            // d2.setF2rate(rateF2O2num);
            // d2.setF3rate(rateF3O2num);
            // d2.setF4rate(rateF4O2num);
            // d2.setF5rate(rateF5O2num);
            // d2.setResult(result2);

            //helper.addDecision(d3);

            //Decision d3 = new Decision();
            // d3.setTopic(dtopic);
            // d3.setOption(option3);
            // d3.setFactor(factor3);
            // d3.setWeight(weight3num);
            // d3.setF1rate(rateF1O3num);
            // d3.setF2rate(rateF2O3num);
            // d3.setF3rate(rateF3O3num);
            // d3.setF4rate(rateF4O3num);
            // d3.setF5rate(rateF5O3num);
            // d3.setResult(result3);

            //helper.addDecision(d3);

            //Decision d4 = new Decision();
            // d4.setTopic(dtopic);
            // d4.setOption(option4);
            // d4.setFactor(factor4);
            // d4.setWeight(weight4num);
            // d4.setF1rate(rateF1O4num);
            // d4.setF2rate(rateF2O4num);
            // d4.setF3rate(rateF3O4num);
            // d4.setF4rate(rateF4O4num);
            // d4.setF5rate(rateF5O4num);
            // d4.setResult(result4);

            //helper.addDecision(d4);

            //Decision d5 = new Decision();
            // d5.setTopic(dtopic);
            // d5.setOption(option5);
            // d5.setFactor(factor5);
            // d5.setWeight(weight5num);
            // d5.setF1rate(rateF1O5num);
            // d5.setF2rate(rateF2O5num);
            // d5.setF3rate(rateF3O5num);
            // d5.setF4rate(rateF4O5num);
            // d5.setF5rate(rateF5O5num);
            // d5.setResult(result5);

            //helper.addDecision(d5);



            //passing options to results
            Intent intent = new Intent(Factor5.this, Result.class);
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
            // ** rateF2
            intent.putExtra("rateF2O1", rateF2O1num);
            intent.putExtra("rateF2O2", rateF2O2num);
            intent.putExtra("rateF2O3", rateF2O3num);
            intent.putExtra("rateF2O4", rateF2O4num);
            intent.putExtra("rateF2O5", rateF2O5num);
            // ** rateF3
            intent.putExtra("rateF3O1", rateF3O1num);
            intent.putExtra("rateF3O2", rateF3O2num);
            intent.putExtra("rateF3O3", rateF3O3num);
            intent.putExtra("rateF3O4", rateF3O4num);
            intent.putExtra("rateF3O5", rateF3O5num);
            // ** rateF4
            intent.putExtra("rateF4O1", rateF4O1num);
            intent.putExtra("rateF4O2", rateF4O2num);
            intent.putExtra("rateF4O3", rateF4O3num);
            intent.putExtra("rateF4O4", rateF4O4num);
            intent.putExtra("rateF4O5", rateF4O5num);
            // ** rateF5
            intent.putExtra("rateF5O1", rateF5O1num);
            intent.putExtra("rateF5O2", rateF5O2num);
            intent.putExtra("rateF5O3", rateF5O3num);
            intent.putExtra("rateF5O4", rateF5O4num);
            intent.putExtra("rateF5O5", rateF5O5num);



            startActivity(intent);

        }
    }
}
