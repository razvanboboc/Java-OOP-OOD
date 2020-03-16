package com.iquestgroup.remotelearning;

@Logged
public interface Animal {

    @Logged
    void eat(String firstParameter, String secondParameter, String thirdParameter );

    void sleep();
}