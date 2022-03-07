package Homework.Lesson10;

import Homework.Lesson10.Exercise1.Months;

import java.sql.Wrapper;

public class MainWeekday {
    public static void main(String[] args) {
        Months[] monthsOfTheYear = Months.values();
        System.out.println(Weekday.MONDAY.isWeekDay());
        System.out.println(Weekday.MONDAY.isHoliDay());
        System.out.println(Weekday.SUNDAY.isWeekDay());
        System.out.println(Weekday.SUNDAY.isHoliDay());


    }
}
