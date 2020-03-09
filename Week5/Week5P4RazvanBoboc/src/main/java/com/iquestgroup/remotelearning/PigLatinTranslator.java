package com.iquestgroup.remotelearning;

import java.util.StringTokenizer;
import static java.lang.Character.isUpperCase;

public class PigLatinTranslator {

    private StringTokenizer stringTokenizer;

    public void printLatinWord(String pigLatinWord) {
        System.out.print(pigLatinWord + " ");
    }

    public void translateString(String stringToBeTranslated) {
        if (stringToBeTranslated == "") {
            System.out.println("");
        }
        if (stringToBeTranslated == null) {
            throw new IllegalArgumentException();
        }
        stringTokenizer = new StringTokenizer(stringToBeTranslated);
        int counter = 0;
        while(stringTokenizer.hasMoreTokens()) {
            String tokenFromTokenizer = stringTokenizer.nextToken();
            char firstLetter = tokenFromTokenizer.charAt(0);
            counter++;
            if(isUpperCase(firstLetter) & counter == 1){
                String translatedLatinWord = tokenFromTokenizer.substring(1) + tokenFromTokenizer.charAt(0) + "ay";
                translatedLatinWord = translatedLatinWord.toLowerCase();
                translatedLatinWord = translatedLatinWord.substring(0, 1).toUpperCase() + translatedLatinWord.substring(1);
                printLatinWord(translatedLatinWord);
            }else {

                String translatedLatinWord = tokenFromTokenizer.substring(1) + tokenFromTokenizer.charAt(0) + "ay";
                translatedLatinWord = translatedLatinWord.toLowerCase();

                printLatinWord(translatedLatinWord);

                if (!stringTokenizer.hasMoreTokens()) {
                    System.out.println("");
                }
            }
        }
    }
}
