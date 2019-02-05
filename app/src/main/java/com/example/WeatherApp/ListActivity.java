package com.example.WeatherApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView List;
    String[] listitems={"Android","iPhone","Windows","Blackberry","Linux"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        List= findViewById(R.id.List);
        ListAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listitems);
        List.setAdapter(adapter);
        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent Intent2 = new Intent(ListActivity.this, DeviceDetailActivity.class);
                startActivity(Intent2);
            }
        });




    }
}
