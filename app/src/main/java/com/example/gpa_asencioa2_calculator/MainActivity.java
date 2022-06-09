package com.example.gpa_asencioa2_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText p1,p2,p3,p4,p5;
    TextView a;
    int count=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= findViewById(R.id.b);
        p1= findViewById(R.id.p1);
        p2= findViewById(R.id.p2);
        p3= findViewById(R.id.p3);
        p4= findViewById(R.id.p4);
        p5= findViewById(R.id.p5);
        a= findViewById(R.id.a);
        a.setBackgroundColor(Color.WHITE);
        b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                float t1, t2, t3, t4, t5;
                if (count % 2 == 0) {
                    if (p1.getText().toString().equals("") || p2.getText().toString().equals("") || p3.getText().toString().equals("") || p4.getText().toString().equals("") || p5.getText().toString().equals("")) {
                        a.setText("Enter grades in all fields");
                    }
                    else {
                        t1 = Float.parseFloat(p1.getText().toString());
                        t2 = Float.parseFloat(p2.getText().toString());
                        t3 = Float.parseFloat(p3.getText().toString());
                        t4 = Float.parseFloat(p4.getText().toString());
                        t5 = Float.parseFloat(p5.getText().toString());
                        float average = t1 + t2 + t3 + t4 + t5;
                        average = average / 5;
                        if (average < 60) {
                            a.setText(Float.toString(average));
                            a.setBackgroundColor(Color.RED);
                        } else if (average > 60 && average < 80) {
                            a.setText(Float.toString(average));
                            a.setBackgroundColor(Color.YELLOW);
                        } else if (average >= 80 && average <= 100) {
                            a.setText(Float.toString(average));
                            a.setBackgroundColor(Color.GREEN);
                        }
                        count++;
                        b.setText("Clear");
                    }

                }
                else
                {
                    p1.setText("");
                    p2.setText("");
                    p3.setText("");
                    p4.setText("");
                    p5.setText("");
                    a.setText("");
                    b.setText("Compute GPA");
                    a.setBackgroundColor(Color.WHITE);
                    count++;
                }
            }
        });
    }
}
