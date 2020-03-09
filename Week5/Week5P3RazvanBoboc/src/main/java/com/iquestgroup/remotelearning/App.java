package com.iquestgroup.remotelearning;

public class App {

    public static void main(String[] args) {
        String[] article = new String[]{"the", "a", "one", "some", "any"};
        String[] noun = new String[]{"boy", "girl", "dog", "town", "car"};
        String[] verb = new String[]{"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = new String[]{"to", "from", "over", "under", "on"};

        RandomSentenceGenerator randomSentenceGenerator = new RandomSentenceGenerator(article, noun, verb, preposition);

        StoryGenerator storyGenerator = new StoryGenerator(randomSentenceGenerator);
        storyGenerator.generateStory();
    }
}
