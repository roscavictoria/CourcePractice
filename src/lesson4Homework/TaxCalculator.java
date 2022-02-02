package lesson4Homework;

public class TaxCalculator {
    public static void main(String[] args){
        double price = 178.5697;
        double tax = 275.698;
        int quantity = 45968;
        double total = price*quantity*tax;

        System.out.println("Total cost with tax is:");
        System.out.println(total);


    }
}
