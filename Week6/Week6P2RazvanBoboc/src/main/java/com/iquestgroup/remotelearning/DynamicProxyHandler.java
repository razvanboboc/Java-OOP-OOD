package com.iquestgroup.remotelearning;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class DynamicProxyHandler implements InvocationHandler {

    private Object targetProxied;

    public DynamicProxyHandler(Object targetProxied) {
        this.targetProxied = targetProxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Class<? extends Object> proxyClass = targetProxied.getClass();

        if (proxyClass.isAnnotationPresent(Logged.class)) {
            System.out.println("The class " + proxyClass.getName() + " is annotated");
            Annotation annotation = proxyClass.getAnnotation(Logged.class);
            Logged logged = (Logged) annotation;
            System.out.println("The value of  property 'used' is " + logged.used());
        } else {
            System.out.println("The class " + proxyClass.getName() + " is not annotated");
        }

        if (method.isAnnotationPresent(Logged.class))
        {
            Annotation annotationMethod = method.getAnnotation(Logged.class);
            Logged logged = (Logged) annotationMethod;
            System.out.println("The method " + method.getName()
                    + " is annotated and value of property 'used' is : " + logged.used());
            Parameter[] parameters = method.getParameters();
            if (parameters.length != 0) {
                System.out.println("The annotated method also has the following parameters ");
                for (Parameter parameter : parameters) {
                    System.out.println("Parameter: " + parameter.getName());
                }
            } else {
                System.out.println("The method contains no parameters");
            }

        } else {
            System.out.println("The method " + method.getName() + " is not annotated");
        }

        return method.invoke(targetProxied, args);

    }
}

