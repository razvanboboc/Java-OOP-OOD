package com.iquestint.util;

import java.util.StringJoiner;

public class TitlelizeOperator implements Titlelizer {

    String stringToBeTitlelized;
    String[] arrayToBeTitlelized;
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

        stringToBeTitlelized = toTitlelize;
        arrayToBeTitlelized = stringToBeTitlelized.split(" ");

        for (int wordToBeTitlelized = 0; wordToBeTitlelized < arrayToBeTitlelized.length; wordToBeTitlelized++) {

            for (String wordToBeIgnored : wordsToIgnoreList) {
                String currentWordLowerCased = arrayToBeTitlelized[wordToBeTitlelized].toLowerCase();
                if (currentWordLowerCased.equals(wordToBeIgnored)) {
                    arrayToBeTitlelized[wordToBeTitlelized] = currentWordLowerCased;
                    wordToBeTitlelized++;
                }

            }
            arrayToBeTitlelized[wordToBeTitlelized] = arrayToBeTitlelized[wordToBeTitlelized].toLowerCase();
            StringBuilder capitalizedWord = new StringBuilder(arrayToBeTitlelized[wordToBeTitlelized]);
            char characterToBeUppercased = arrayToBeTitlelized[wordToBeTitlelized].charAt(0);
            int firstCharacterAsciiValue = characterToBeUppercased;
            int uppercasedCharacter = firstCharacterAsciiValue - 32;
            characterToBeUppercased = (char) uppercasedCharacter;
            capitalizedWord.setCharAt(0, characterToBeUppercased);

            arrayToBeTitlelized[wordToBeTitlelized] = capitalizedWord.toString();
        }
        StringJoiner joiner = new StringJoiner(" ");
        for (int wordToBeTitlelized = 0; wordToBeTitlelized < arrayToBeTitlelized.length; wordToBeTitlelized++) {
            joiner.add(arrayToBeTitlelized[wordToBeTitlelized]);
        }
        return joiner.toString();
    }

}








