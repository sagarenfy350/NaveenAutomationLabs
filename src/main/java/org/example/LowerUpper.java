package org.example;

public class LowerUpper {
    public static void main(String[] args) {
        String s="VidyaSagarH";
        String lowerCase=s.toLowerCase();
        String modifiedString="";

        for(int i=0;i<=lowerCase.length()-1;i++){
            char c=lowerCase.charAt(i);
            if(i%2==0){
                modifiedString+=Character.toUpperCase(c);
            }else
                modifiedString+=Character.toLowerCase(c);
        }
        System.out.println(modifiedString);
    }
}
