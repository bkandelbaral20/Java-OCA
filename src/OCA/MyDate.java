package OCA;

import java.util.Date;

public class MyDate {
    int day;
    int months;
    int year;

//    constructors
    public MyDate(int day, int months, int year) {
        this.day = day;
        this.months = months;
        this.year = year;
    }

    //    no-arg constructor
    public MyDate() {}

    public String toString(int day, int months, int year){
        return "11/04/2020";
    }

    public static void main(String[] args) {
        MyDate date = new MyDate();
        System.out.println(date.toString());

    }


}
