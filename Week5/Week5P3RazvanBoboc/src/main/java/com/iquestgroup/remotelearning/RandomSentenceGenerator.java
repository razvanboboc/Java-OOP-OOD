package com.iquestgroup.remotelearning;

import java.util.Random;
import java.util.StringJoiner;

public class RandomSentenceGenerator {
    private final String[] article;
    private final String[] noun;
    private final String[] verb;
    private final String[] preposition;
    private Random random;
    public RandomSentenceGenerator(String[] article, String[] noun, String[] verb, String[] preposition) {
        this.article = article;
        this.noun = noun;
        this.verb = verb;
        this.preposition = preposition;
        random = new Random();
    }

    public String generateRandomSentece() {
        StringJoiner randomSentence = new StringJoiner(" ");
        String firstWord = article[random.nextInt(5)];
        String firstWordCapitalized = firstWord.substring(0,1).toUpperCase() + firstWord.substring(1);
        randomSentence.add(firstWordCapitalized);
        randomSentence.add(noun[random.nextInt(5)]);
        randomSentence.add(verb[random.nextInt(5)]);
        randomSentence.add(preposition[random.nextInt(5)]);
        randomSentence.add(article[random.nextInt(5)]);
        randomSentence.add(noun[random.nextInt(5)]);
        return randomSentence.toString() + ".";
    }
}
