package org.example;

import java.util.ArrayList;

public class EvenNumberArray {
    public static void main(String[] args) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        int[] a={1,4,5,67,76,43,56,22,43,54,65,67,88};
        for(int num : a){
            if(num%2==0){
               even.add(num);
            }else
                odd.add(num);
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
