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


public class Kralingen extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kralingen);
        Context context = this;
        ContextCompat.getColor(context, R.color.blue);
        ContextCompat.getColor(context, R.color.red);
        BarChart barChart = (BarChart) findViewById(R.id.chart);

        ArrayList<BarEntry> trommels = new ArrayList<>();
        trommels.add(new BarEntry(53f, 0));
        trommels.add(new BarEntry(53f, 1));
        trommels.add(new BarEntry(53f, 2));
        trommels.add(new BarEntry(53f, 3));
        trommels.add(new BarEntry(53f, 4));
        trommels.add(new BarEntry(53f, 5));
        trommels.add(new BarEntry(53f, 6));
        trommels.add(new BarEntry(53f, 7));
        trommels.add(new BarEntry(53f, 8));
        trommels.add(new BarEntry(53f, 9));
        trommels.add(new BarEntry(53f, 10));
        trommels.add(new BarEntry(53f, 11));

        ArrayList<BarEntry> diefstallen = new ArrayList<>();
        diefstallen.add(new BarEntry(17f, 0));
        diefstallen.add(new BarEntry(26f, 1));
        diefstallen.add(new BarEntry(32f, 2));
        diefstallen.add(new BarEntry(41f, 3));
        diefstallen.add(new BarEntry(31f, 4));
        diefstallen.add(new BarEntry(30f, 5));
        diefstallen.add(new BarEntry(42f, 6));
        diefstallen.add(new BarEntry(46f, 7));
        diefstallen.add(new BarEntry(45f, 8));
        diefstallen.add(new BarEntry(36f, 9));
        diefstallen.add(new BarEntry(37f, 10));
        diefstallen.add(new BarEntry(21f, 11));

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
