package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        double dollar = 1;
        double total;
        double pennies = 0.01;
        double nickels = 0.05;
        double dimes = 0.10;
        double quarters = 0.25;
        double qtyPennies;
        double qtyNickels;
        double qtyDimes;
        double qtyQuarters;


        System.out.println("How many pennies?: ");
        Scanner scanner = new Scanner((System.in));
        qtyPennies = scanner.nextDouble();

        System.out.println("How many nickels?: ");
        qtyNickels = scanner.nextDouble();

        System.out.println("How many dimes: ");
        qtyDimes = scanner.nextDouble();

        System.out.println("How many quarters: ");
        qtyQuarters = scanner.nextDouble();

        scanner.close();

        total = (qtyPennies*pennies + qtyNickels*nickels + qtyDimes*dimes + qtyQuarters*quarters);

        if(total < dollar){
            double amountShort = dollar - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
