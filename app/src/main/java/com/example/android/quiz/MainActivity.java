package com.example.android.quiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void evaluate(View view) {
        int correct = 0;


        //Radio Button Evaluation Q1

        RadioButton q1yes = (RadioButton) findViewById(R.id.q1_yes_radio_button);
        RadioButton q1no = (RadioButton) findViewById(R.id.q1_no_radio_button);

        if (q1yes.isChecked()) {
            correct += 1;
        }


        //Radio Button Evaluation Q2

        RadioButton q2yes = (RadioButton) findViewById(R.id.q2_yes_radio_button);
        RadioButton q2no = (RadioButton) findViewById(R.id.q2_no_radio_button);

        if (q2yes.isChecked()) {
            correct += 1;
        }

        //Radio Button Evaluation Q3

        RadioButton q3yes = (RadioButton) findViewById(R.id.q3_yes_radio_button);
        RadioButton q3no = (RadioButton) findViewById(R.id.q3_no_radio_button);

        if (q3yes.isChecked()) {
            correct += 1;
        }

        //Radio Button Evaluation Q4

        RadioButton q4yes = (RadioButton) findViewById(R.id.q4_yes_radio_button);
        RadioButton q4no = (RadioButton) findViewById(R.id.q4_no_radio_button);

        if (q4yes.isChecked()) {
            correct += 1;
        }

        //Text Input Evaluation Q5

        EditText q5 = (EditText) findViewById(R.id.q5_textinput);
        String q5t = q5.getText().toString().toUpperCase();

        if (q5t.equals("INTEL")) {
            correct += 1;
        }

        //Text Input Evaluation Q6

        EditText q6 = (EditText) findViewById(R.id.q6_textinput);
        String q6t = q6.getText().toString().toUpperCase();

        if (q6t.equals("GOOGLE")) {
            correct += 1;
        }

        //Text Input Evaluation Q7

        EditText q7 = (EditText) findViewById(R.id.q7_textinput);
        String q7t = q7.getText().toString().toUpperCase();

        if (q7t.equals("UBER")) {
            correct += 1;
        }


        // Checkbox Question Evaluations

        // Checkbox Question Evaluation Q8

        CheckBox q8a = (CheckBox) findViewById(R.id.q8_a);
        CheckBox q8b = (CheckBox) findViewById(R.id.q8_b);
        CheckBox q8c = (CheckBox) findViewById(R.id.q8_c);
        CheckBox q8d = (CheckBox) findViewById(R.id.q8_d);

        if (q8a.isChecked() && !(q8b.isChecked()) && q8c.isChecked() && !(q8d.isChecked())) {
            correct += 1;
        }

        // Checkbox Question Evaluation Q9

        CheckBox q9a = (CheckBox) findViewById(R.id.q9_a);
        CheckBox q9b = (CheckBox) findViewById(R.id.q9_b);
        CheckBox q9c = (CheckBox) findViewById(R.id.q9_c);
        CheckBox q9d = (CheckBox) findViewById(R.id.q9_d);

        if (q9a.isChecked() && q9b.isChecked() && !(q9c.isChecked()) && !(q9d.isChecked())) {
            correct += 1;
        }

        // Checkbox Question Evaluation Q10

        CheckBox q10a = (CheckBox) findViewById(R.id.q10_a);
        CheckBox q10b = (CheckBox) findViewById(R.id.q10_b);
        CheckBox q10c = (CheckBox) findViewById(R.id.q10_c);
        CheckBox q10d = (CheckBox) findViewById(R.id.q10_d);

        if (q10a.isChecked() && q10b.isChecked() && !(q10c.isChecked()) && q10d.isChecked()) {
            correct += 1;
        }


        //Toast

        Context context = getApplicationContext();
        CharSequence text = correct + " Answers Correct Out of 10 ";
        CharSequence text2 = "Congratulations!! 10 Out of 10";
        int duration = Toast.LENGTH_SHORT;

        if(correct==10) {
            Toast toast = Toast.makeText(context, text2, duration);
            toast.show();
        }
        else
        {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

}
