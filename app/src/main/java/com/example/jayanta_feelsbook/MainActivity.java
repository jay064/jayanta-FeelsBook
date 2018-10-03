package com.example.jayanta_feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class MainActivity extends AppCompatActivity {

    private static final String FILENAME = "file.sav";
    private MainActivity activity = this;

    private Button loveButton;
    private Button joyButton;
    private Button angerButton;
    private Button sadnessButton;
    private Button surpriseButton;
    private Button fearButton;


    private ArrayList<Emotion> emotions = new ArrayList<Emotion>();
    private ArrayAdapter<Emotion> adapter;

    public ListView getEmotionList() {
        return EmotionList;
    }

    private ListView EmotionList;

    public ArrayList<Emotion> getEmotions() {
        return emotions;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        loveButton = (Button) findViewById(R.id.love);
        fearButton = (Button) findViewById(R.id.fear);
        sadnessButton = (Button) findViewById(R.id.sadness);
        joyButton = (Button) findViewById(R.id.joy);
        surpriseButton = (Button) findViewById(R.id.surprise);
        angerButton = (Button) findViewById(R.id.anger);
        EmotionList = (ListView) findViewById(R.id.EmotionList); //view

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void viewHistory(View view) {
    Intent intent = new Intent(this, History_activity.class);
    startActivity(intent);

    }
}
