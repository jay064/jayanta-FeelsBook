package com.example.jayanta_feelsbook;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;

import static android.provider.Telephony.Mms.Part.FILENAME;

//EmotionList will allow the user to perform actions on the list of emotions stored. Adding an emotion to the list, getting the count
public class EmotionList {

    protected ArrayList<Emotion> emotionList = new ArrayList<Emotion>();
    protected String comment;

    public EmotionList() {
        //emotionList = new ArrayList<Emotion>();
    }

    public ArrayList<Emotion> getEmotions() {
        return emotionList;
    }

    public void addEmotion(Emotion testemotion) {
        emotionList.add(testemotion);
    }

    public int getCount(Emotion emotion, ArrayList<Emotion> emotionList) {
        //Emotion newEmotion = new Emotion(emotion);
        int counter = 0;
        for (int i = 0; i < emotionList.size(); i++) {
            if (emotionList.get(i).equals(emotion)) {
                counter++;
            }
        }
        return counter;

    }
}



