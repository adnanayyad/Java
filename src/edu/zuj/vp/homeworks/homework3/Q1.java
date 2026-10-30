package edu.zuj.vp.homeworks.homework3;

import java.util.Scanner;

public class Q1 {
    static void main() {
        //Horizontal Line Application
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
