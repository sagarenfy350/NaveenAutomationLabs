package org.example;

public class Anagram {
    public static void main(String[] args) {
        String s="madaim";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("String palindrome");
        }else
            System.out.println("Not a palindrome");
    }
}
