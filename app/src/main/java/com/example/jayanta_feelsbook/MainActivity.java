package com.example.jayanta_feelsbook;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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




    private ArrayList<Emotion> emotions = new ArrayList<Emotion>();;
    private ArrayAdapter<Emotion> adapter;

    private EditText bodyText;

    public EditText getBodyText() {
        return bodyText;
    }

    //public ListView getEmotionList() {
       // return EmotionList;
    //}

    //private ListView EmotionList;

    //public ArrayList<Emotion> getEmotions() {
     //   return emotions;
    //}
    String comment;
    EmotionList emotionList = new EmotionList();
    Emotion emotion = new Emotion("emotion");
    Emotion love = new Emotion("love");
    Emotion fear = new Emotion("fear");
    Emotion anger = new Emotion("anger");
    Emotion surprise = new Emotion("surprise");
    Emotion sadness = new Emotion("sadness");
    Emotion joy = new Emotion("joy");
    public ArrayList<Emotion> emotionList123 = emotionList.getEmotions();

    int count;

    public void optionalComment(View view){
        String text = bodyText.getText().toString();

        emotion.setComment(text);

        Toast.makeText(this,"Comment Added!",Toast.LENGTH_SHORT).show();
    }

    public void loveText(View view){
        emotionList.addEmotion(love);

        count = emotionList.getCount(love, emotionList123);
        TextView countView = (TextView) findViewById(R.id.loveCount);
        countView.setText(Integer.toString(count));
        Toast.makeText(this,"Emotion Added!",Toast.LENGTH_SHORT).show();


    }

    public void fearText(View view){
        emotionList.addEmotion(fear);

        count = emotionList.getCount(fear, emotionList123);
        TextView countView = (TextView) findViewById(R.id.fearCount);
        countView.setText(Integer.toString(count));
        Toast.makeText(this,"Emotion Added!",Toast.LENGTH_SHORT).show();

    }

    public void angerText(View view){
        emotionList.addEmotion(anger);

        count = emotionList.getCount(anger, emotionList123);
        TextView countView = (TextView) findViewById(R.id.angerCount);
        countView.setText(Integer.toString(count));
        Toast.makeText(this,"Emotion Added!",Toast.LENGTH_SHORT).show();

    }

    public void surpriseText(View view){
        emotionList.addEmotion(surprise);

        count = emotionList.getCount(surprise, emotionList123);
        TextView countView = (TextView) findViewById(R.id.surpriseCount);
        countView.setText(Integer.toString(count));
        Toast.makeText(this,"Emotion Added!",Toast.LENGTH_SHORT).show();

    }

    public void joyText(View view){
        emotionList.addEmotion(joy);

        count = emotionList.getCount(joy, emotionList123);
        TextView countView = (TextView) findViewById(R.id.joyCount);
        countView.setText(Integer.toString(count));
        Toast.makeText(this,"Emotion Added!",Toast.LENGTH_SHORT).show();

    }

    public void sadnessText(View view){
        emotionList.addEmotion(sadness);

        count = emotionList.getCount(sadness, emotionList123);
        TextView countView = (TextView) findViewById(R.id.sadnessCount);
        countView.setText(Integer.toString(count));
        Toast.makeText(this,"Emotion Added!",Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        loveButton = (Button) findViewById(R.id.love);
        fearButton = (Button) findViewById(R.id.fear);
        sadnessButton = (Button) findViewById(R.id.sadness);
        joyButton = (Button) findViewById(R.id.joy);
        surpriseButton = (Button) findViewById(R.id.surprise);
        angerButton = (Button) findViewById(R.id.anger);
        EmotionList = (ListView) findViewById(R.id.EmotionList); //view
        */

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bodyText = (EditText) findViewById(R.id.optionalComment);



    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        //loadFromFile();
    }


    public void viewHistory(View view) {
        Intent i = new Intent(this, History_activity.class);
        i.putExtra("emotions", emotionList123);

        startActivity(i);

    }
/*

    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            Gson gson = new Gson();
            // Taken from https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/Gson.html 2015-09-22
            Type listType = new TypeToken<ArrayList<Emotion>>() {}.getType();
            emotions = gson.fromJson(in, listType);
        } catch (FileNotFoundException e) {
            emotions = new ArrayList<Emotion>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveInFile() {
        try {
            FileOutputStream fos = openFileOutput(FILENAME,
                    0);
            OutputStreamWriter writer = new OutputStreamWriter(fos);
            Gson gson = new Gson();
            gson.toJson(emotions, writer);
            writer.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

}
