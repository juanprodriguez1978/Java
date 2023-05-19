package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);


    public static void main (String args[]){

        HomeAreaCalculatorRedo caculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = caculator.getRoom();
        Rectangle bathroom = caculator.getRoom();

        double area = caculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        caculator.scanner.close();


    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();


        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return  rectangle1.caculateArea() + rectangle2.caculateArea();
    }

}
