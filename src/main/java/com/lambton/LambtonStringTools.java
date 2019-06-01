package com.lambton;

public class LambtonStringTools {

    public String reverseTheString (String data){
        char[] str = data.toCharArray();
        int start=0,end=str.length-1;
        char temp;
        while(end>start){
            temp = str[start];
            str[start]=str[end];
            str[end]=temp;
            end--;
            start++;
        }
        return new String(str);
    }

    public int binaryToDecimal (String value){
        int a = Integer.parseInt(value,2);
        return a;
    }

    public String nameInitials(String name){
        String[] wordCount=name.split("\\s+");
        if(name == null || name.isEmpty() || wordCount.length<2) {
            System.out.println("Invalid name");
            return null;
        }else {
            String[] testName = name.split(" ");
            for (int i = 0; i < 2; i++) {
                String s = testName[i];
                System.out.println(s.charAt(i));

            }
            System.out.println(testName[2]);
            return new String(name);
        }

    }

    public String replaceTheString(String userInput,String existingWord,String replaceBy){
        String a = userInput.replaceAll(existingWord,replaceBy);
        return a;
    }

}
