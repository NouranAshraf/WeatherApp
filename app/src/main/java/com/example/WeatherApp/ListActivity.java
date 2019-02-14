package com.example.WeatherApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {
    ListView List;
    String[] listitems={"Android","iPhone","Windows","Blackberry","Linux"};
    int[] images={R.drawable.android,R.drawable.iphone,R.drawable.windows,R.drawable.blackberry,R.drawable.linux};
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
                Intent Intent1 = new Intent(ListActivity.this, DeviceDetailActivity.class);
                startActivity(Intent1);

            }
        });
        CustomAdapter customAdapter= new CustomAdapter();
        List.setAdapter(customAdapter);

    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view =getLayoutInflater().inflate(R.layout.custom_layout,null);
            ImageView ImageView3= view.findViewById(R.id.imageView3);
            TextView TextView5= view.findViewById(R.id.TextView5);
            ImageView3.setImageResource(images[position]);
            TextView5.setText(listitems[position]);
            return view;
        }
    }
}
