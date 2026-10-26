package edu.zuj.vp.homeworks.homework1;

import java.util.Scanner;
public class Q4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int amountOfRepetition;
        int evenNumbers;

        System.out.print("Enter a Number: ");
        amountOfRepetition = scanner.nextInt();

        for(int i = 1; i <= amountOfRepetition; i++)
        {
            if(i%2 == 0)
            {
                evenNumbers = i;
                System.out.printf("%d ",evenNumbers);
            }
        }
    }



}
