package org.example;

import java.util.ArrayList;

public class SumArray {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(34);
        num.add(89);
        num.add(33);
        num.add(31);
        num.add(30);
        int sum=0;
        for(int numb:num){
            sum=sum+numb;
        }
        System.out.println(sum);
    }
}
