package org.example;

public class PrimeNumber {
    public static void main(String[] args) {
        String s="123Sagar@!";
        int num=0;
        int charact=0;
        int special=0;

        for(int i=0;i<=s.length()-1;i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num++;
            } else if (Character.isAlphabetic(c)) {
                charact++;
            }else
                special++;
        }
        System.out.println(num);
        System.out.println(charact);
        System.out.println(special);
    }
}
