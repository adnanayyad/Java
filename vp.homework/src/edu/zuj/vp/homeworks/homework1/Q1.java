package edu.zuj.vp.homeworks.homework1;

import java.util.Scanner;
public class Q1 {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Find The Max Application");

        System.out.print("Your choice as Number 1: ");
        num1 = scanner.nextInt();

        System.out.print("Your choice as Number 2: ");
        num2 = scanner.nextInt();

        if(num1>num2)
            System.out.printf("%d is bigger than %d",num1,num2);
        else if(num2>num1)
            System.out.printf("%d is bigger than %d",num2,num1);
        else
            System.out.printf("%d is equal to %d",num1,num2);

    }
}
