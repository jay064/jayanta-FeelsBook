package com.example.jayanta_feelsbook;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static android.provider.Telephony.Mms.Part.FILENAME;

public class History_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_activity);
        ListView listView = (ListView) findViewById(R.id.EmotionList);
        Intent intent = getIntent();
        final ArrayList<Emotion> my_array_list = (ArrayList<Emotion>) intent.getExtras().getSerializable("emotions");

        final ArrayAdapter adapter = new ArrayAdapter<Emotion>(this, android.R.layout.simple_list_item_1, my_array_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                AlertDialog.Builder adb = new AlertDialog.Builder(History_activity.this);
                adb.setTitle("Delete?");
                adb.setMessage("Are you sure you want to delete this item?");
                final int positionToRemove = position;
                adb.setNegativeButton("Cancel", null);
                adb.setPositiveButton("Ok", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        my_array_list.remove(positionToRemove);
                        adapter.notifyDataSetChanged();


                    }
                });
                adb.show();
            }


        });

    }

}
