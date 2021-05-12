package com.example.myapplication6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class CarAdapter extends ArrayAdapter<Auto> {
    private Context context;
    private ArrayList<Auto> dane;

    public CarAdapter(Context context, ArrayList<Auto> dane){
        super(context, R.layout.list_element, dane);

        this.context = context;
        this.dane = dane;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_element, parent, false);

        //rowView - pojedynczy element listy;

        TextView nazwa = rowView.findViewById(R.id.nazwa);
        TextView rocznik = rowView.findViewById(R.id.rocznik);
        Button przycisk = rowView.findViewById(R.id.przycisk);

        przycisk.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v) {
                Toast t = Toast.makeText(context, dane.get(position).getNazwa() + " " + dane.get(position).getModel(), Toast.LENGTH_SHORT);
            }
        });

        nazwa.setText(dane.get(position).getNazwa());
        rocznik.setText(String.valueOf(dane.get(position).getRocznik()));

        return rowView;
    }
}

