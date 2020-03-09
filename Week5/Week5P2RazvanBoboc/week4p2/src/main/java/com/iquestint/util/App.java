package com.iquestint.util;

public class App {
    public static void main(String[] args){
        String[] wordsToIgnoreList = new String[]{"the", "a", "to", "in", "of", "is"};
        String initialString = "NoW is tHe time To act!";
        String titlelizedString;

        TitlelizeOperator titlelizeOperator = new TitlelizeOperator(wordsToIgnoreList);

        titlelizedString = titlelizeOperator.titlelize(initialString);
        System.out.println(titlelizedString);
    }
}
