package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Factor4 extends AppCompatActivity {

    // ** class-level variables
    String dtopic;
    String option1;
    String option2;
    String option3;
    String option4;
    String option5;
    String factor1;
    String factor2;
    String factor3;
    String factor4;
    String factor5;
    int weight1num;
    int weight2num;
    int weight3num;
    int weight4num;
    int weight5num;
    int rateF1O1num;
    int rateF1O2num;
    int rateF1O3num;
    int rateF1O4num;
    int rateF1O5num;
    int rateF2O1num;
    int rateF2O2num;
    int rateF2O3num;
    int rateF2O4num;
    int rateF2O5num;
    int rateF3O1num;
    int rateF3O2num;
    int rateF3O3num;
    int rateF3O4num;
    int rateF3O5num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor4);

        factor4 = getIntent().getStringExtra("TVfactor4");
        TextView tv = (TextView) findViewById(R.id.TVfactor4);
        tv.setText(factor4);

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
        factor1 = getIntent().getStringExtra("TVfactor1");
        factor2 = getIntent().getStringExtra("TVfactor2");
        factor3 = getIntent().getStringExtra("TVfactor3");
        factor5 = getIntent().getStringExtra("TVfactor5");

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

    }

    public void onRateF4Click(View v) {
        // ** if next button is clicked
        if (v.getId() == R.id.btnFactor4) {

            EditText rateF4O1 = (EditText) findViewById(R.id.rateF4O1);
            rateF4O1.setFilters(new InputFilter[]{new InputFilterMinMax("1", "5")});
            EditText rateF4O2 = (EditText) findViewById(R.id.rateF4O2);
            rateF4O2.setFilters(new InputFilter[]{new InputFilterMinMax("1", "5")});
            EditText rateF4O3 = (EditText) findViewById(R.id.rateF4O3);
            rateF4O3.setFilters(new InputFilter[]{new InputFilterMinMax("1", "5")});
            EditText rateF4O4 = (EditText) findViewById(R.id.rateF4O4);
            rateF4O4.setFilters(new InputFilter[]{new InputFilterMinMax("1", "5")});
            EditText rateF4O5 = (EditText) findViewById(R.id.rateF4O5);
            rateF4O5.setFilters(new InputFilter[]{new InputFilterMinMax("1", "5")});

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

            //passing options to factor 5
            Intent intent = new Intent(Factor4.this, Factor5.class);
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
            intent.putExtra("TVweight1", weight1num);
            intent.putExtra("TVweight2", weight2num);
            intent.putExtra("TVweight3", weight3num);
            intent.putExtra("TVweight4", weight4num);
            intent.putExtra("TVweight5", weight5num);
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

            startActivity(intent);

        }
    }
}
