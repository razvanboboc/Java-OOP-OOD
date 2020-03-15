package com.iquestgroup.remotelearning;

import java.util.StringTokenizer;

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

        while (stringTokenizer.hasMoreTokens()) {
            Word word = new Word(stringTokenizer.nextToken());
            String translatedLatinWord = word.getLatinWord();
            printLatinWord(translatedLatinWord);

            if (!stringTokenizer.hasMoreTokens()) {
                System.out.println("");
            }
        }
    }
}

