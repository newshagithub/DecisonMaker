package com.example.newsha.decisonmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

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
    int rateF5O1num = 0;
    int rateF5O2num = 0;
    int rateF5O3num = 0;
    int rateF5O4num = 0;
    int rateF5O5num = 0;
    int[] factors;
    int[] f1Rate;
    int[] f2Rate;
    int[] f3Rate;
    int[] f4Rate;
    int[] f5Rate;

    // private static int PerformCalculation(int[] factors, int[] f1Rate, int[] f2Rate, int[] f3Rate, int[] f4Rate, int[] f5Rate) {
    //   int output = 0; // set output to default value

    //  int[] o1 = new int[factors.length];
    //  int[] o2 = new int[factors.length];
    //  int[] o3 = new int[factors.length];
    //  int[] o4 = new int[factors.length];
    //  int[] o5 = new int[factors.length];

    //  int[] oSums = new int[5];

    // f1Rate calculation
    //  if (f1Rate.length >= 1) {
    //      for (int i = 0; i < factors.length; i++) {
    //          o1[i] = factors[i] * f1Rate[0];
    //          oSums[0] += o1[i];
    //      }
    //  }

    // f2Rate calculation
    //   if (f2Rate.length >= 2) {
    //       for (int i = 0; i < factors.length; i++) {
    //          o2[i] = factors[i] * f2Rate[1];
    //          oSums[1] += o2[i];
    //       }
    //   }

    // f3Rate calculation
    //   if (f3Rate.length >= 3) {
    //      for (int i = 0; i < factors.length; i++) {
    //          o3[i] = factors[i] * f3Rate[2];
    //          oSums[2] += o3[i];
    //      }
    //  }

    // f4Rate calculation
    //  if (f4Rate.length >= 4) {
    //      for (int i = 0; i < factors.length; i++) {
    //          o4[i] = factors[i] * f4Rate[3];
    //          oSums[3] += o4[i];
    //       }
    //   }

    // f5Rate calculation
    //  if (f5Rate.length >= 5) {
    //      for (int i = 0; i < factors.length; i++) {
    //          o5[i] = factors[i] * f5Rate[4];
    //          oSums[4] += o5[i];
    //      }
    //  }

    // finding max
    //  for (int o : oSums) {
    //      if (o > output) {
    //          output = o;
    //      }
    //  }

    //   return output;
    //} // end method

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // ** topic
        dtopic = getIntent().getStringExtra("TVdtopic");

        // ** options
        option1 = getIntent().getStringExtra("TVoption1");
        option2 = getIntent().getStringExtra("TVoption2");
        option3 = getIntent().getStringExtra("TVoption3");
        option4 = getIntent().getStringExtra("TVoption4");
        option5 = getIntent().getStringExtra("TVoption5");

        // ** factors
        factor1 = getIntent().getStringExtra("TVfactor1");
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

        // ** rateF5
        rateF5O1num = getIntent().getIntExtra("rateF5O1", 0);
        rateF5O2num = getIntent().getIntExtra("rateF5O2", 0);
        rateF5O3num = getIntent().getIntExtra("rateF5O3", 0);
        rateF5O4num = getIntent().getIntExtra("rateF5O4", 0);
        rateF5O5num = getIntent().getIntExtra("rateF5O5", 0);

        int[] factors = {weight1num, weight2num, weight3num, weight4num, weight5num};
        int[] f1Rate = {rateF1O1num, rateF1O2num, rateF1O3num, rateF1O4num, rateF1O5num};
        int[] f2Rate = {rateF2O1num, rateF2O2num, rateF2O3num, rateF2O4num, rateF2O5num};
        int[] f3Rate = {rateF3O1num, rateF3O2num, rateF3O3num, rateF3O4num, rateF3O5num};
        int[] f4Rate = {rateF4O1num, rateF4O2num, rateF4O3num, rateF4O4num, rateF4O5num};
        int[] f5Rate = {rateF5O1num, rateF5O2num, rateF5O3num, rateF5O4num, rateF5O5num};


        //int max = PerformCalculation(factors, f1Rate, f2Rate, f3Rate, f4Rate, f5Rate);


        int sumOption1 = (weight1num * rateF1O1num) + (weight2num * rateF2O1num) + (weight3num * rateF3O1num) + (weight4num * rateF4O1num) + (weight5num * rateF5O1num);
        int sumOption2 = (weight1num * rateF1O2num) + (weight2num * rateF2O2num) + (weight3num * rateF3O2num) + (weight4num * rateF4O2num) + (weight5num * rateF5O2num);
        int sumOption3 = (weight1num * rateF1O3num) + (weight2num * rateF2O3num) + (weight3num * rateF3O3num) + (weight4num * rateF4O3num) + (weight5num * rateF5O3num);
        int sumOption4 = (weight1num * rateF1O4num) + (weight2num * rateF2O4num) + (weight3num * rateF3O4num) + (weight4num * rateF4O4num) + (weight5num * rateF5O4num);
        int sumOption5 = (weight1num * rateF1O5num) + (weight2num * rateF2O5num) + (weight3num * rateF3O5num) + (weight4num * rateF4O5num) + (weight5num * rateF5O5num);

        int[] sumArray = {sumOption1, sumOption2, sumOption3, sumOption4, sumOption5};
        String[] optionArray = {option1, option2, option3, option4, option5};

        int max = Integer.MIN_VALUE;
        String selected = null;
        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] > max) {
                max = sumArray[i];
            }
            selected = optionArray[i];
        }
        
        TextView tv = (TextView) findViewById(R.id.TVselected);
        tv.setText(selected);

    }

}
