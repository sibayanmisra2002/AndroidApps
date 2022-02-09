package com.example.modulusapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView n1;
    private TextView n2;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button.setOnClickListener(new View.OnClickListener()
        {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                String s1 = n1.getText().toString();
                double a = Double.parseDouble(s1);

                String s2 = n2.getText().toString();
                double b = Double.parseDouble(s2);
                if(b==0)
                {
                    output.setText("Please give correct input");

                }
                else
                {
                    double c = a%b;
                    output.setText("Result : "+c);
                }

            }
        });
    }
}