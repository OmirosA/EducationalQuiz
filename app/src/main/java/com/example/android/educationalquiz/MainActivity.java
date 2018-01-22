package com.example.android.educationalquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**Initial point score**/
    int score = 0;

    /** Declaring the variables**/
    private EditText userName;
    private RadioGroup question1;
    private RadioGroup question2;
    private RadioGroup question3;
    private CheckBox question4_a;
    private CheckBox question4_b;
    private CheckBox question4_c;
    private CheckBox question4_d;
    private RadioGroup question5;
    private RadioGroup question6;
    private RadioGroup question7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.insertName);
        question1 = (RadioGroup) findViewById(R.id.q1);
        question2 = (RadioGroup) findViewById(R.id.q2);
        question3 = (RadioGroup) findViewById(R.id.q3);
        question4_a = (CheckBox) findViewById(R.id.q4_a);
        question4_b = (CheckBox) findViewById(R.id.q4_b);
        question4_c = (CheckBox) findViewById(R.id.q4_c);
        question4_d = (CheckBox) findViewById(R.id.q4_d);
        question5 = (RadioGroup) findViewById(R.id.q5);
        question6 = (RadioGroup) findViewById(R.id.q6);
        question7 = (RadioGroup) findViewById(R.id.q7);

    }

    /**Checking the answers**/
    public void submit(View view) {
        /**Name**/
        String name = userName.getText().toString().trim();
        if (name == null || name.isEmpty()) {
            Toast.makeText(this, getString(R.string.nameError), Toast.LENGTH_LONG).show();
            return;
        }

        /** Question 1**/
        int q1_id = question1.getCheckedRadioButtonId();
        if (q1_id == -1) {
            Toast.makeText(this, getString(R.string.chooseAnswer), Toast.LENGTH_LONG).show();
            return;
        }
        // Correct Answer
        RadioButton radioButton1 = (RadioButton) question1.findViewById(q1_id);
        String q1_answer = (String) radioButton1.getText();
        if (q1_answer.equalsIgnoreCase(getString(R.string.q1_b))) {
            score += 1;
        }

        /** Question 2**/
        int q2_id = question2.getCheckedRadioButtonId();
        if (q2_id == -1) {
            Toast.makeText(this, getString(R.string.chooseAnswer), Toast.LENGTH_LONG).show();
            return;
        }
        // Correct Answer
        RadioButton radioButton2 = (RadioButton) question2.findViewById(q2_id);
        String q2_answer = (String) radioButton2.getText();
        if (q2_answer.equalsIgnoreCase(getString(R.string.q2_b))) {
            score += 1;
        }
        /** Question 3**/
        int q3_id = question3.getCheckedRadioButtonId();
        if (q3_id == -1) {
            Toast.makeText(this, getString(R.string.chooseAnswer), Toast.LENGTH_LONG).show();
            return;
        }
        // Correct Answer
        RadioButton radioButton3 = (RadioButton) question3.findViewById(q3_id);
        String q3_answer = (String) radioButton3.getText();
        if (q3_answer.equalsIgnoreCase(getString(R.string.q3_a))) {
            score += 1;
        }
        /**Question 4**/
        if (!question4_a.isChecked() && !question4_b.isChecked() && !question4_c.isChecked() && !question4_d.isChecked()){
            Toast.makeText(this, getString(R.string.chooseAnswer), Toast.LENGTH_LONG).show();
        return;
        }
        // Correct Answer
        if (question4_a.isChecked() && question4_c.isChecked() && question4_d.isChecked()) {
        score += 1;
        }

        /** Question 5**/
        int q5_id = question5.getCheckedRadioButtonId();
        if (q5_id == -1) {
            Toast.makeText(this, getString(R.string.chooseAnswer), Toast.LENGTH_LONG).show();
            return;
        }
        // CorrectAnswer
        RadioButton radioButton5 = (RadioButton) question5.findViewById(q5_id);
        String q5_answer = (String) radioButton5.getText();
        if (q5_answer.equalsIgnoreCase(getString(R.string.q5_b))) {
            score += 1;
        }

        /** Question 6**/
        int q6_id = question6.getCheckedRadioButtonId();
        if (q6_id == -1) {
            Toast. makeText(this, getString(R. string. chooseAnswer), Toast. LENGTH_LONG) . show();
            return;
        }
        // Correct Answer
        RadioButton radioButton6 = (RadioButton) question6. findViewById(q6_id);
        String q6_answer = (String) radioButton6. getText();
        if (q6_answer. equalsIgnoreCase(getString( R. string. q6_d))) {
            score += 1;
        }

        /** Question 7**/
        int q7_id = question7. getCheckedRadioButtonId();
        if (q7_id == -1) {
            Toast. makeText(this, getString(R. string. chooseAnswer), Toast. LENGTH_LONG) . show();
            return;
        }
        // Correct Answer
        RadioButton radioButton7 = (RadioButton) question7. findViewById(q7_id);
        String q7_answer = (String) radioButton7. getText();
        if (q7_answer. equalsIgnoreCase(getString( R. string. q7_c))) {
            score += 1;
        }
        /**Results**/
        if (score == 7) {
            Toast. makeText(this, getString(R. string. perfectScore) + " " + name + ", " + getString(R. string. scoreText) + " " + score + getString(R.string.outOf), Toast.LENGTH_SHORT).show();
        } else if (score > 5 && score < 7) {
            Toast. makeText(this, getString(R. string. greatScore) + " " + name + ", " + getString(R. string. scoreText) + " " + score + getString(R.string.outOf), Toast.LENGTH_SHORT).show();
        } else if (score > 3 && score <= 5) {
            Toast. makeText(this, getString(R. string. goodScore) + " " + name + ", " + getString(R. string. scoreText) + " " + score + getString(R.string.outOf), Toast.LENGTH_SHORT).show();
        } else if (score > 0 && score <= 3) {
            Toast. makeText(this, getString(R. string. badScore) + " " + name + ", " + getString(R. string. scoreText) + " " + score + getString(R.string.outOf), Toast.LENGTH_SHORT).show();
        } else if (score == 0) {
            Toast. makeText(this, getString(R. string. zeroScore), Toast. LENGTH_LONG) . show();
        } else {
            Toast. makeText(this, getString(R. string. scoreReset), Toast. LENGTH_LONG) . show();
        }
    }
    /** Reset the score to 0**/
    public void resetResults(View view) {
        score = 0;
        question1. clearCheck();
        question2. clearCheck();
        question3. clearCheck();
        question4_a. setChecked(false);
        question4_b. setChecked(false);
        question4_c. setChecked(false);
        question4_d. setChecked(false);
        question5. clearCheck();
        question6. clearCheck();
        question7. clearCheck();

    }
}


