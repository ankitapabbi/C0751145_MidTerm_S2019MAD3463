package com.lambton;

import java.util.Scanner;

public class C0751145_MidTerm_S2019MAD3469 {

    public static void main(String[] args) {

        LambtonStringTools lst = new LambtonStringTools();
        System.out.println("Enter a string to be reversed:");
        Scanner scanner = new Scanner(System.in);
        String reverseString = scanner.next();

       System.out.println( "Reversed String is : "+lst.reverseTheString(reverseString));



    }
}