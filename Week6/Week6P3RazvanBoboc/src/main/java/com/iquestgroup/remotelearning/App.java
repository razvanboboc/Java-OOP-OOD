package com.iquestgroup.remotelearning;

import java.net.URISyntaxException;

public class App {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, URISyntaxException {

        MyClass objectMyClass = new MyClass();
        System.out.println(objectMyClass.getString());

        String wantedClass = "MyClass";
        String externalPackage = "com.iquestgroup.remotelearning";

        CustomFactory factory = new CustomFactory(objectMyClass, externalPackage);
        Class<?> classFromFactory = (Class<?>) factory.getInitialOrReloadedClass(wantedClass);

        MyClass test = (MyClass) classFromFactory.newInstance();
        System.out.println(test.getString());

    }
}
