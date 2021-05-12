package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mainList;
    private ArrayList<Auto> dane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dane = new ArrayList<>();
        mainList = findViewById(R.id.mainList);
        dane.add(new Auto("skoda", "superb", 2015, 55000 ));
        dane.add(new Auto("audi", "a4", 2016, 45000 ));
        dane.add(new Auto("opel", "insignia", 2010, 15000 ));
        dane.add(new Auto("volkswagen", "passat", 2009, 75000 ));
        dane.add(new Auto("mazda", "6", 2003, 25000 ));
        dane.add(new Auto("volvo", "s80", 2020, 1000 ));

        CarAdapter adapter = new CarAdapter(this, dane);
        mainList.setAdapter(adapter);

    }
}