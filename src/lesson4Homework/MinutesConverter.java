package lesson4Homework;




public class MinutesConverter {
    public static void  main(String[] args){

        long minutes = 206895314;
        double days;
        double years;

        days = (double)(minutes/60)/24;
        years = days/365;

        System.out.println("Number of days is:" + days);
        System.out.println("Number of years is:" + years);












    }
}
