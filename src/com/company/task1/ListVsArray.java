package com.company.task1;

import com.company.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListVsArray extends Main {

    {
        List<Integer> b = new LinkedList<Integer>();
        List<Integer> c = new LinkedList<Integer>();
        List<Integer> e = new LinkedList<Integer>();

        for (int i = 0; i < 1000; i++) {
            b.add(i);
        }
        long startFirst = System.nanoTime();
        int tempFirst = b.indexOf(500);
        System.out.println("-------------------------------");
        System.out.println(System.nanoTime() - startFirst + " : LinkedList 1000");

        for (int i = 0; i < 3000; i++) {
            c.add(i);
        }
        long startSecond = System.nanoTime();
        int tempSecond = c.indexOf(1500);
        System.out.println(System.nanoTime() - startSecond + " : LinkedList 3000");

        for (int i = 0; i < 5000; i++) {
            e.add(i);
        }
        long startThird = System.nanoTime();
        int tempThird = e.indexOf(2500);
        System.out.println(System.nanoTime() - startThird + " : LinkedList 5000");
        System.out.println("-------------------------------");

        List<Integer> d = new ArrayList<Integer>();
        List<Integer> f = new ArrayList<Integer>();
        List<Integer> g = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            d.add(i);
        }
        startFirst = System.nanoTime();
        int tempFirstArray = d.indexOf(500);
        System.out.println(System.nanoTime() - startFirst + " : ArrayList 1000");


        for (int i = 0; i < 3000; i++) {
            f.add(i);
        }
        startSecond = System.nanoTime();
        int tempSecondArray = f.indexOf(1500);
        System.out.println(System.nanoTime() - startSecond + " : ArrayList 3000");

        for (int i = 0; i < 5000; i++) {
            g.add(i);
        }
        startThird = System.nanoTime();
        int tempThirdArray = g.indexOf(2500);
        System.out.println(System.nanoTime() - startThird + " : ArrayList 5000");
        System.out.println("-------------------------------");

    }
}

