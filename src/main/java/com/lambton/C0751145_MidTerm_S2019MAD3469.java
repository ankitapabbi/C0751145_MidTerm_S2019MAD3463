package com.lambton;

import java.util.Scanner;

public class C0751145_MidTerm_S2019MAD3469 {

    public static void main(String[] args) {

        LambtonStringTools lst = new LambtonStringTools();

        //----------------Reverse The String--------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be reversed:");

        String reverseString = scanner.nextLine();

        System.out.println( "Reversed String is : "+lst.reverseTheString(reverseString));

        //----------------8421---------------------------
        System.out.println("Enter a binary value: ");
        String binary_value = scanner.nextLine();
        System.out.println("Binary To Decimal Value : "+lst.binaryToDecimal(binary_value));

        //----------------Name Initials------------------------
        System.out.println("Enter Full name: ");
        String full_name = scanner.nextLine();

        lst.nameInitials(full_name);

        //----------Replacing the String-----------------------
        System.out.println("Enter a Sentence :");
        String sentence = scanner.nextLine();
        System.out.println("Enter the word to be replaced : ");
        String existingWord = scanner.nextLine();
        System.out.println("Enter the Word replaced by : ");
        String replaceBy = scanner.nextLine();

        System.out.println("The replaced sentence : "+lst.replaceTheString(sentence,existingWord,replaceBy));

        //-------------Checking occurance of character ---------------------------

        System.out.println("Enter a sentence");
        String abc = scanner.nextLine();
        System.out.println(lst.checkOccurance(abc));







    }
}
