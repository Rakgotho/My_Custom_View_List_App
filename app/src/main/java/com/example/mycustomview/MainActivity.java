package com.example.mycustomview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    final int[] countryFlags = {R.drawable.sa, R.drawable.asian, R.drawable.austa, R.drawable.antigua, R.drawable.brazil,
            R.drawable.bahrain, R.drawable.cuba, R.drawable.romania, R.drawable.bangladesh};
    final String[] countryNames = {"South Africa", "Asian", "Australia", "Antigua", "Brazil", "Bahrain", "Cuba",
            "Romania","Bangladesh"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(MainActivity.this, countryNames, countryFlags );
        listView.setAdapter(adapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, "You clicked the flag of "+ countryNames[position], Toast.LENGTH_SHORT).show();



            }
        });
    }


}