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
    

}
