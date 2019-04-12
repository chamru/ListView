package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView lstCountries;

    public static final String countries[] = {
            "Nepal",
            "India",
            "China",
            "UK",
            "US",
            "Canada"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstCountries = findViewById(R.id.lstCountries);

        dictionary = new HashMap<>();
        for (int i=0; i<countries.length; i+=2) {
            dictionary.put(countries[i],countries[i+1]);

        }

        ArrayAdapter countryAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                new ArrayList(dictionary.keySet())
        );

        lstCountries.setAdapter(countryAdapter);


    }
}
