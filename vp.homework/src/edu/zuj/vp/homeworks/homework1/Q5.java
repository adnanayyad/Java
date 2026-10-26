package edu.zuj.vp.homeworks.homework1;

import java.util.Scanner;
public class Q5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int amountOfRepetition;
        int oddNumbers;

        System.out.print("Enter a Number: ");
        amountOfRepetition = scanner.nextInt();

        for(int i = 1; i <= amountOfRepetition; i++)
        {
            if(i%2 == 1)
            {
                oddNumbers = i;
                System.out.printf("%d ",oddNumbers);
            }
        }
    }



}
