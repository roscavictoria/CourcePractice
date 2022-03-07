package Homework.Lesson9.area.rectangle;



public class Main {
    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setDim();
        double rectangleArea = rectangle.getDim();
        System.out.printf("The rectangle's area is: %.2f", rectangleArea);
    }


}
