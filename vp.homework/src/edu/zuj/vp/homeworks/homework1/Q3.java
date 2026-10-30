package edu.zuj.vp.homeworks.homework1;
import java.util.Scanner;

public class Q3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num1;

        //Welcome message
        System.out.println("______________________");
        System.out.println("Print Double If Even Application");
        System.out.println("______________________\n");

        //Asking the user to put a number
        System.out.print("Put a Number To Check: ");
        num1 = scanner.nextInt();

        //checking if number even or odd
        if(num1%2==0)
        {
            num1 *= num1;
            System.out.printf("Double = ", num1);
        }
    }

}
