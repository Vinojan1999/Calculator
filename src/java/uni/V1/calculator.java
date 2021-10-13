package src.V1;

import java.io.*;
import java.util.*;


public class calculator {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter mathematical expression(Add :'+',Sub: '-',Mul:'*'):");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();

        File file = new File("number.txt");
        Scanner scan = new Scanner(file);
        String num1 =scan.next();
        String num2 =scan.next();


        System.out.println("Answer for your mathematical expression:");
        switch (symbol) {
            case "+":
                System.out.print(num1+"+"+num2+" = ");
                System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
                break;
            case "-":
                System.out.print(num1+"-"+num2+" = ");
                System.out.println(Integer.parseInt(num1) - Integer.parseInt(num2));
                break;
            case "*":
                System.out.print(num1+"*"+num2+" = ");
                System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
                break;
            default :
                System.out.println("enter a correct symbol");
        }
        scan.close();
        scanner.close();
    }
}
