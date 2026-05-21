package org.example;

import java.util.ArrayList;

public class MergeArray {
    public static void main(String[] args) {
        ArrayList<Integer> one=new ArrayList<>();
        one.add(1);
        one.add(2);
        one.add(3);
        ArrayList<Integer> two=new ArrayList<>();
        two.add(4);
        two.add(5);
        two.add(6);
        one.addAll(two);
        System.out.println(one);
    }
}
