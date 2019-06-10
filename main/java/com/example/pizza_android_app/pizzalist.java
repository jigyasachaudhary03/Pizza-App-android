package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pizzalist extends AppCompatActivity {
ListView list;
String data[]={"Marghreeita","Onion","Paneer Makhani","Corn","Capsicum","veggiie dDElight","Mushroom","Chicken","Barbeque chicken","Pizza Burger"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzalist);
        list=(ListView)findViewById(R.id.listview);

        ArrayAdapter adapter=new ArrayAdapter(pizzalist.this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

    }
}
