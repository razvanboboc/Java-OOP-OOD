package com.iquestgroup.remotelearning;

public class StoryGenerator {
    RandomSentenceGenerator randomSentenceGenerator;

    public StoryGenerator(RandomSentenceGenerator randomSentenceGenerator){
        this.randomSentenceGenerator =randomSentenceGenerator;
    }

    public void generateStory() {
        for(int i = 0; i < 20; i++){
            System.out.println(randomSentenceGenerator.generateRandomSentece());
        }
    }
}
