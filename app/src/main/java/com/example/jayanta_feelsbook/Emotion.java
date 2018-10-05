package com.example.jayanta_feelsbook;

import java.io.Serializable;
import java.util.ArrayList;
//protected ArrayList<Emotion> emotionList = new ArrayList<Emotion>();
public class Emotion implements Serializable{
    protected String emotion;
    public Emotion(String emotion){
        this.emotion = emotion;
    }
    public String getEmotion(){
        return this.emotion;
    }

    public String toString(){
        return getEmotion();
    }
    //protected int count;
    /*
    protected ArrayList<Emotion> emotionList = new ArrayList<Emotion>();

    public void setEmotion(Emotion emotion){
        //Emotion newEmotion = new Emotion(emotion);
        emotionList.add(emotion);
    }
   /*
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
*/

}
