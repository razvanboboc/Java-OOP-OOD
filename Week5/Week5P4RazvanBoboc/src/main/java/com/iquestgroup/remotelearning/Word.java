package com.iquestgroup.remotelearning;

public class Word {
    String word;

    public Word(String word){
        this.word = word;
    }

    public String getWord(){
        return word;
    }

    public String getLatinWord(){
        word = word.substring(1) + word.charAt(0) + "ay";
        word = word.toLowerCase();
        return word;
    }

    public void setWord(String newWord){
        word = newWord;
    }
}
