package com.example.jayanta_feelsbook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


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

    }
    public String getEmotion(){
        return this.emotion;
    }


    public String getComment(){
        return comment;
    }

    public void setComment(String comment, ArrayList<Emotion> emotionList) throws CommentTooLongException {
        if(comment == null) {
            this.comment = "No comment added";
        }
        else if (comment.length() <= 100) {
            this.comment = comment;
            Emotion EmoComment = new Emotion(comment);
            int lastIndex = (emotionList.size());
            emotionList.add(lastIndex, EmoComment);
            this.comment = comment;
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
    }
    @Override
    public String toString() {
        return date + " | " + getEmotion();
    }


}
