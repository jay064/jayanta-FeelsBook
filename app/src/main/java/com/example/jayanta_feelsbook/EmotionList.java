package com.example.jayanta_feelsbook;

import java.util.ArrayList;
import java.util.Collection;


public class EmotionList {

    protected ArrayList<Emotion> emotionList = new ArrayList<Emotion>();

    public EmotionList(){
        //emotionList = new ArrayList<Emotion>();
    }
    public  ArrayList<Emotion> getEmotions(){
        return emotionList;
    }

    public void addEmotion(Emotion testemotion){
        emotionList.add(testemotion);
    }

    public int getCount(Emotion emotion, ArrayList<Emotion> emotionList){
        //Emotion newEmotion = new Emotion(emotion);
        int counter = 0;
        for (int i = 0; i < emotionList.size(); i ++) {
            if (emotionList.get(i).equals(emotion)) {
                counter++;
            }
        }
        return counter;

    }
}
