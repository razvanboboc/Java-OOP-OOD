package com.iquestint.util;

public class TitlelizeOperator implements Titlelizer {

    String[] arrayToTitlelize;
    String[] wordsToIgnoreList;

    public TitlelizeOperator(String[] wordsToIgnoreList) {
        this.wordsToIgnoreList = wordsToIgnoreList;
    }

    public String titlelize(String toTitlelize) {
        if(toTitlelize == ""){
            return "";
        }

        if((toTitlelize == null) || (toTitlelize == " ")){
            throw new IllegalArgumentException();
        }

        arrayToTitlelize = toTitlelize.split(" ");

        for (int wordToCapitalize = 0; wordToCapitalize < arrayToTitlelize.length; wordToCapitalize++) {
           arrayToTitlelize[wordToCapitalize] = capitalize(arrayToTitlelize[wordToCapitalize]);
        }

        toTitlelize = String.join(" ", arrayToTitlelize);

        return toTitlelize;
    }

    public boolean isCapitalizable(String wordToBeCapitalized){
        for (String wordToBeIgnored : wordsToIgnoreList){
            if(wordToBeCapitalized == wordToBeIgnored)
                return false;
        }
        return true;
    }

    public String capitalize(String word){
        if(isCapitalizable(word)){
            return word.substring(0,1).toUpperCase() + word.substring(1);
        }
        return word;
    }

}








