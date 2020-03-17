package com.iquestgroup.remotelearning;

import java.net.URISyntaxException;

public class CustomFactory {
    private MyClass myClassObject;
    private String externalPackage = "";

    public CustomFactory(MyClass parameter, String externalPackage) {
        myClassObject = parameter;
        this.externalPackage = externalPackage;
    }

    public CustomFactory(MyClass parameter) {
        myClassObject = parameter;

    }

    public Class<?> getInitialOrReloadedClass(String option)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, URISyntaxException {

        switch (option) {
            case "MyClass":
                Class<?> reloadedMyClass = getClassFromLoader(option);
                return reloadedMyClass;
            default:
                ClassLoader parentClassLoader = CustomClassLoader.class.getClassLoader();
                Class<?> loadedClassByParent = parentClassLoader.loadClass(myClassObject.getClass().getName());
                return loadedClassByParent;
        }
    }

    private Class<?> getClassFromLoader(String fileName)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String urlForExternalProject = "file:"
                + this.getClass().getClassLoader().getResource(fileName + ".class").getPath();

        ClassLoader parentClassLoader = CustomClassLoader.class.getClassLoader();
        CustomClassLoader customClassLoader;
        Class<?> loadedClassFromExternal;

        switch (fileName) {
            case "MyClass":
                customClassLoader = new CustomClassLoader(parentClassLoader, urlForExternalProject);
                loadedClassFromExternal = customClassLoader.loadClass(externalPackage + "." + fileName);
                return loadedClassFromExternal;
            default:
                Class<?> loadedClassByParent = parentClassLoader.loadClass(myClassObject.getClass().getName());
                return loadedClassByParent;

        }

    }
}

