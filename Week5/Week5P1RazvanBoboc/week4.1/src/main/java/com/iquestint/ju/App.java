package com.iquestint.ju;

import com.iquestint.ju.list.StringList;

public class App {
    public static void main(String[] args){
        StringList stringList = new StringList(2);
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        stringList.showOperationsHistory();

        StringList customList = new StringList(2);

        customList.add("5");
        customList.add("1");

        System.out.println(stringList.contains("1"));
        System.out.println(stringList.containsAll(customList));
        System.out.println(stringList.size());


    }
}
