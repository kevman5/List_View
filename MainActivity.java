package com.example.listview_proj9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<String> names = new ArrayList<>();
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.lv_nums);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,names);

    }
        public void btn_add_1(View v) {
        EditText ed1;
        ed1 = (EditText)findViewById(R.id.ed_num);
        String num;
        num = ed1.getText().toString();
        names.add(num);

        lv.setAdapter(adapter);

        }
        public void btn_find_avg(View v)
        {
            TextView ed1;
            ed1 = (TextView)findViewById(R.id.tv_avg);
            int sum = 0;

            for (int x=0;x<names.size();x++)
                sum = sum + Integer.parseInt(names.get(x).toString());
            double avg = sum / names.size();
            ed1.setText(String.valueOf(avg));
        }

}