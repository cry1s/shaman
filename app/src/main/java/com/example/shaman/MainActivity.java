package com.example.shaman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solving(View v) {
        TextView answer = findViewById(R.id.textView4);
        EditText a_text = findViewById(R.id.koefA);
        EditText b_text = findViewById(R.id.koefB);
        EditText c_text = findViewById(R.id.koefC);
        String a_string = a_text.getText().toString();
        String b_string = b_text.getText().toString();
        String c_string = c_text.getText().toString();
        double a = Double.parseDouble(a_string);
        double b = Double.parseDouble(b_string);
        double c = Double.parseDouble(c_string);
        double D = b*b-4*a*c;
        if (D<0) {
            answer.setText("No solves");
        } else if (D==0) {
            answer.setText("x = "+ (-b/(2*a)));
        } else {
            answer.setText("x1 = "+ ((-b+Math.sqrt(D))/(2*a)) +"   x2 = "+((-b-Math.sqrt(D))/(2*a)));
        }
    }
}
