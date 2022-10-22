package com.shreejit;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c = c + 1;
            // c++;
        }
        if (c * c > n) {
            System.out.println("Prime");
        }
        
    }
}
