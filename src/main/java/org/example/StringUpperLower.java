package org.example;

public class StringUpperLower {
    public static void main(String[] args) {
        String s="VidYaSagYU";
        int upper=0;
        int lower=0;

        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                upper++;
            }else
                lower++;
        }
        System.out.println("The capitals are : "+upper);
        System.out.println("The lower are :"+lower);
    }
}
