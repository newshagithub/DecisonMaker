package com.example.newsha.decisonmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View v) {
        // ** if add button is clicked
        if (v.getId() == R.id.add_decision_btn) {

            EditText topic = (EditText) findViewById(R.id.dTopic);
            String topicstr = topic.getText().toString();

            // check if no value is entered
            if (topicstr == null || topicstr.trim().equals("null") || topicstr.trim()
                    .length() <= 0) {

                //popup error msg
                Toast pass = Toast.makeText(MainActivity.this, "Please enter a topic first. :)", Toast.LENGTH_SHORT);
                pass.show();

            } else {

                //insert the details in db
                Decision d = new Decision();
                d.setTopic(topicstr);

                helper.addDecision(d);

                Intent i = new Intent(MainActivity.this, Options.class);
                i.putExtra("TVdtopic", topicstr);
                startActivity(i);

            }
        }

        // ** if ViewContents button is clicked
        if(v.getId() == R.id.vcontent_btn)
        {

            Intent i = new Intent(MainActivity.this, Result.class);
            startActivity(i);
        }

    }
}