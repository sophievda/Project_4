package com.example.ruben.project4;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;


public class Pernis extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pernis);
        Context context = this;
        ContextCompat.getColor(context, R.color.blue);
        ContextCompat.getColor(context, R.color.red);
        BarChart barChart = (BarChart) findViewById(R.id.chart);

        ArrayList<BarEntry> trommels = new ArrayList<>();
        trommels.add(new BarEntry(2f, 0));
        trommels.add(new BarEntry(2f, 1));
        trommels.add(new BarEntry(2f, 2));
        trommels.add(new BarEntry(2f, 3));
        trommels.add(new BarEntry(2f, 4));
        trommels.add(new BarEntry(2f, 5));
        trommels.add(new BarEntry(2f, 6));
        trommels.add(new BarEntry(2f, 7));
        trommels.add(new BarEntry(2f, 8));
        trommels.add(new BarEntry(2f, 9));
        trommels.add(new BarEntry(2f, 10));
        trommels.add(new BarEntry(2f, 11));

        ArrayList<BarEntry> diefstallen = new ArrayList<>();
        diefstallen.add(new BarEntry(1f, 0));
        diefstallen.add(new BarEntry(2f, 1));
        diefstallen.add(new BarEntry(3f, 2));
        diefstallen.add(new BarEntry(3f, 3));
        diefstallen.add(new BarEntry(1f, 4));
        diefstallen.add(new BarEntry(5f, 5));
        diefstallen.add(new BarEntry(0f, 6));
        diefstallen.add(new BarEntry(0f, 7));
        diefstallen.add(new BarEntry(3f, 8));
        diefstallen.add(new BarEntry(1f, 9));
        diefstallen.add(new BarEntry(2f, 10));
        diefstallen.add(new BarEntry(3f, 11));

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Januari");
        labels.add("februari");
        labels.add("Maart");
        labels.add("April");
        labels.add("Mei");
        labels.add("Juni");
        labels.add("Juli");
        labels.add("Augustus");
        labels.add("September");
        labels.add("Oktober");
        labels.add("November");
        labels.add("December");


        BarDataSet barDataSet1 = new BarDataSet(trommels, "fietstrommels");
        barDataSet1.setColors(new int[]{R.color.red}, context);
        BarDataSet barDataSet2 = new BarDataSet(diefstallen, "fietsdiefstallen");
        barDataSet2.setColors(new int[]{R.color.blue}, context);

        ArrayList<IBarDataSet> datasets = new ArrayList<>();
        datasets.add(barDataSet1);
        datasets.add(barDataSet2);


        BarData data = new BarData(labels, datasets);
        barChart.setData(data);
        barChart.setDescription(" ");
        barChart.setDescriptionPosition(800f, 10f);
    }

}
