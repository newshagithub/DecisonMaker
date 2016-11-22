package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Options extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        String dtopic = getIntent().getStringExtra("TVdtopic");
        TextView tv = (TextView)findViewById(R.id.TVdtopic);
        tv.setText(dtopic);
    }

    public void onAddOptsClick(View v) {
        // ** if add button is clicked
        if (v.getId() == R.id.btnOptions) {

            EditText option1 = (EditText) findViewById(R.id.etOption1);
            EditText option2 = (EditText) findViewById(R.id.etOption2);
            EditText option3 = (EditText) findViewById(R.id.etOption3);
            EditText option4 = (EditText) findViewById(R.id.etOption4);
            EditText option5 = (EditText) findViewById(R.id.etOption5);

            String option1str = option1.getText().toString();
            String option2str = option2.getText().toString();
            String option3str = option3.getText().toString();
            String option4str = option4.getText().toString();
            String option5str = option5.getText().toString();

            // check if at least 2 options are entered
            if (option1str != null && option2str != null) {

                //insert the details in db
                //Decision d = new Decision();
               // d.setOption(option1str);

                //helper.addDecision(d);

                Intent i = new Intent(Options.this, Factors.class);
                startActivity(i);

            } else {

                //popup error msg
                Toast pass = Toast.makeText(Options.this, "Please enter at least 2 options. :)", Toast.LENGTH_SHORT);
                pass.show();
            }


        }
    }
}
