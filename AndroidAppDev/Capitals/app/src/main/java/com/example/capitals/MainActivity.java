package com.example.capitals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> grocery = new ArrayList<>();

        grocery.add("JAPAN");
        grocery.add("ITALY");
        grocery.add("FRANCE");
        grocery.add("GERMANY");
        grocery.add("INDIA");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter((arrayAdapter));
        ArrayList<String> grocery2 = new ArrayList<>();

        grocery2.add("TOKYO");
        grocery2.add("ROME");
        grocery2.add("PARIS");
        grocery2.add("BERLIN");
        grocery2.add("DELHI");

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter((arrayAdapter2));
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = "Item" + position + "" + view.toString();
                display= findViewById(R.id.output);
                display.setText(grocery2.get(position));

            }
        });
    }
}