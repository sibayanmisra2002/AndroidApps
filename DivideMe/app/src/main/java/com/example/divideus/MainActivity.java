package com.example.divideus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView result;
    Button div,clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        result=findViewById(R.id.result);
        div=findViewById(R.id.div);
        clr=findViewById(R.id.clr);

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(e1.getText().toString().length()==0){
                   e1.setText("0");
               }
                if(e2.getText().toString().length()==0){
                    e2.setText("0");
                }
                Float v1=Float.valueOf(e1.getText().toString());
                Float v2=Float.valueOf(e2.getText().toString());
                Float div=v1/v2;
                result.setText(String.valueOf(div));
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                result.setText("");
            }
        });
    }
}