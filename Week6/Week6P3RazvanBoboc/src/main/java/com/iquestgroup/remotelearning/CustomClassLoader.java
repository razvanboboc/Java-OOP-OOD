package com.iquestgroup.remotelearning;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CustomClassLoader extends ClassLoader {

    private String urlString;

    public CustomClassLoader(ClassLoader parent, String url) {
        super(parent);
        this.urlString = url;

    }

    public Class<?> loadClass(String name) throws ClassNotFoundException {

        Class<?> toBeReturned;
        byte[] classResult = getByteArrayFromURL(urlString).toByteArray();

        switch (name) {
            case "com.iquestgroup.remotelearning.MyClass":

                toBeReturned = defineClass(name, classResult, 0, classResult.length);
                return toBeReturned;
        }

        return super.loadClass(name);

    }

    private ByteArrayOutputStream getByteArrayFromURL(String urlString) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            URL url = new URL(urlString);
            URLConnection urlConnection = url.openConnection();
            InputStream input = urlConnection.getInputStream();
            int data = input.read();

            while (data != -1) {
                buffer.write(data);
                data = input.read();
            }

            input.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

}