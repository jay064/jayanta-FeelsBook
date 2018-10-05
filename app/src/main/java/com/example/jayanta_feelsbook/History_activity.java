package com.example.jayanta_feelsbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class History_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_activity);
        ListView listView = (ListView)findViewById(R.id.EmotionList);
        //Collection<Emotion> emotions =
        //ArrayList<Emotion> list = new ArrayList<Emotion>();
        //ArrayAdapter<Emotion> emotionAdapter = new ArrayAdapter<Emotion>(this,android.R.layout.simple_list_item_1,list);
    }

}
