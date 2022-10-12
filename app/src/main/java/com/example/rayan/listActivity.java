package com.example.rayan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Banana");
        arrayList.add("apple");

        //initialize the adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        //connect adapter to array
        listView.setAdapter(arrayAdapter);


        //handle items clicks
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(listActivity.this, "clicked item"+ i+ arrayList.get(i).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}