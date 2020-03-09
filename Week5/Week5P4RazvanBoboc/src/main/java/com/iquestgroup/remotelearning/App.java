package com.iquestgroup.remotelearning;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
       boolean runnable = true;
       Scanner scanner = new Scanner(System.in);
       PigLatinTranslator pigLatinTranslator = new PigLatinTranslator();

       while(runnable){
           System.out.println("Enter a phrase: ");
           String stringToBeTranslated = scanner.nextLine();
           pigLatinTranslator.translateString(stringToBeTranslated);
       }
    }
}
