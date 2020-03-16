package com.iquestgroup.remotelearning;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {
        LocalDate presentDate = LocalDate.now();

        Date date = new Date(presentDate);

        System.out.println(date);
    }
}
