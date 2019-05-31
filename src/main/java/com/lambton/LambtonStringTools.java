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
        if(name == null && name.isEmpty() && wordCount.length<2) {
            return null;
        }else {

        }
        return null;
    }

    public String replaceTheString(String userInput,String existingWord,String replaceBy){
        String a = userInput.replaceAll(existingWord,replaceBy);
        return a;
    }

}
