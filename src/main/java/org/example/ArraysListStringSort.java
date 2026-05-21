package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArraysListStringSort {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("Vidya");
        s.add("Sagar");
        s.add("Manu");
        s.add("Charan");
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }
        Collections.sort(s);
        System.out.println(s);
        ArrayList<String> k=new ArrayList<>(s);
        k.add("Ganga");
        k.add("Ganga");
        System.out.println(k);
        HashSet<String> m=new HashSet<>(k);
        System.out.println(m);
    }
}
