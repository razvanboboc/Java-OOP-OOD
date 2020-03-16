package com.iquestgroup.remotelearning;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public Object getProxyInstance(Object object, Class<?>[] interfaces) {
        for (Class<?> iface : interfaces) {
            if (iface.isAssignableFrom(object.getClass())) {
                return Proxy.newProxyInstance(object.getClass().getClassLoader(), interfaces, new DynamicProxyHandler(object));
            } else {
                throw new InvalidInterfaceException();
            }
        }

        return null;


    }
}
