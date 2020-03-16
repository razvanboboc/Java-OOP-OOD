package com.iquestgroup.remotelearning;

import java.time.LocalDate;

public class Date {

    private DaysOfTheWeek day;
    private MonthsOfTheYear month;
    private LocalDate currentDate;

    public Date(LocalDate givenDate) {
        currentDate = givenDate;
        initializeDayOfTheWeek();
        initializeMonthOfTheYear();

    }

    private void initializeDayOfTheWeek() {
        for(DaysOfTheWeek dayOfWeek: DaysOfTheWeek.values()) {
            if(currentDate.getDayOfWeek().toString() == dayOfWeek.toString())
                day = dayOfWeek;

        }
    }

    private void initializeMonthOfTheYear() {
        for(MonthsOfTheYear monthOfYear: MonthsOfTheYear.values()) {
            if(currentDate.getMonth().toString() == monthOfYear.toString())
                month = monthOfYear;

        }
    }

    @Override
    public String toString() {

        return "Today is " + day + " of month " + month + ", and the current year is " + currentDate.getYear();
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public MonthsOfTheYear getMonth() {
        return month;
    }
}
