package com.example.jayanta_feelsbook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

//protected ArrayList<Emotion> emotionList = new ArrayList<Emotion>();
public class Emotion implements Serializable{
    protected String comment;
    protected String emotion;
    protected Date date;
    public Emotion(String emotion, String comment, Date date)throws CommentTooLongException{
        this.emotion = emotion;
        this.comment = comment;
        this.date = date;
    }
    public Emotion(String emotion){
        this.emotion = emotion;
        this.date = new Date();
        //this.comment = comment;
    }
    public String getEmotion(){
        return this.emotion;
    }


    public String getComment(){
        return comment;
    }

    public void setComment(String comment) throws CommentTooLongException {
        if(comment == null) {
            this.comment = "No comment added";
        }
        else if (comment.length() <= 100) {
            this.comment = comment;
            //Emotion EmoComment = new Emotion(comment);
            //int lastIndex = (emotionList.size());
            //emotionList.add(lastIndex, EmoComment);
            //this.comment = comment;
        }
        else {
            throw new CommentTooLongException();
        }



    }

    Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
        //notifyAllObservers();
    }
    @Override
    public String toString() {
        return date + " | " + getEmotion() + " | " + comment;
    }
/*
    private volatile ArrayList<MyObserver> observers = new ArrayList<MyObserver>();

    public void addObserver(MyObserver observer) {
        observers.add(observer);
    }
    private void notifyAllObservers() {
        for (MyObserver observer : observers) {
            observer.myNotify(this);
        }
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
