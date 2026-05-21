package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortList {

    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<>();
        s.add(12);
        s.add(34);
        s.add(87);
        s.add(76);
        s.add(54);
        Collections.sort(s);
        System.out.println(s);
    }
}
