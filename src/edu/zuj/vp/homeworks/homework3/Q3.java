package edu.zuj.vp.homeworks.homework3;

import java.util.Scanner;

public class Q3 {
    static void main() {
        //Triangle Application
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
