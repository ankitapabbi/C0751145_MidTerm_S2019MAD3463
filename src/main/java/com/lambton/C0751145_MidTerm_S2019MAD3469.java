package com.lambton;

import java.util.Scanner;

public class C0751145_MidTerm_S2019MAD3469 {

    public static void main(String[] args) {

        LambtonStringTools lst = new LambtonStringTools();

        //----------------Reverse The String--------------
        System.out.println("Enter a string to be reversed:");
        Scanner scanner = new Scanner(System.in);
        String reverseString = scanner.next();

        System.out.println( "Reversed String is : "+lst.reverseTheString(reverseString));

        //----------------8421---------------------------
        System.out.println("Enter a binary value: ");
        String binary_value = scanner.next();
        System.out.println("Binary To Decimal Value : "+lst.binaryToDecimal(binary_value));

        //----------------Name Initials------------------------
        System.out.println("Enter Full name: ");
        String full_name = scanner.next();








    }
}
