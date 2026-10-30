package edu.zuj.vp.homeworks.homework3;

import java.util.Scanner;

public class Q2 {
    static void main() {
        //Rectangle Application
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
