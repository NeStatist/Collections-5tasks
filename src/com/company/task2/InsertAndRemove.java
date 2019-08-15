package com.company.task2;

import com.company.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertAndRemove extends Main {

    {
        List<Integer> b = new LinkedList<Integer>();
        List<Integer> c = new LinkedList<Integer>();
        List<Integer> e = new LinkedList<Integer>();

        for (int i = 0; i < 1001; i++) {
            b.add(i);
        }
        long startFirstRemove = System.nanoTime();
        b.add(1000, 10);
        System.out.println(System.nanoTime() - startFirstRemove + " : LinkedListInsert 1000");
        startFirstRemove = System.nanoTime();
        b.remove(1000);
        System.out.println(System.nanoTime() - startFirstRemove + " : LinkedListRemove 1000");


        for (int i = 0; i < 3001; i++) {
            c.add(i);
        }
        long startSecondRemove = System.nanoTime();
        c.add(3000, 10);
        System.out.println(System.nanoTime() - startSecondRemove + " : LinkedListInsert 3000");
        startSecondRemove = System.nanoTime();
        c.remove(3000);
        System.out.println(System.nanoTime() - startSecondRemove + " : LinkedListRemove 3000");


        for (int i = 0; i < 5001; i++) {
            e.add(i);
        }
        long startThirdRemove = System.nanoTime();
        e.add(5000, 10);
        System.out.println(System.nanoTime() - startThirdRemove + " : LinkedListInsert 5000");
        startThirdRemove = System.nanoTime();
        e.remove(5000);
        System.out.println(System.nanoTime() - startThirdRemove + " : LinkedListRemove 5000");
        System.out.println("-------------------------------");

        List<Integer> d = new ArrayList<Integer>();
        List<Integer> f = new ArrayList<Integer>();
        List<Integer> g = new ArrayList<Integer>();


        for (int i = 0; i < 1001; i++) {
            d.add(i);
        }
        startFirstRemove = System.nanoTime();
        d.add(1000, 10);
        System.out.println(System.nanoTime() - startFirstRemove + " : ArrayListInsert 1000");
        startFirstRemove = System.nanoTime();
        d.remove(1000);
        System.out.println(System.nanoTime() - startFirstRemove + " : ArrayListRemove 1000");

        for (int i = 0; i < 3001; i++) {
            f.add(i);
        }
        startSecondRemove = System.nanoTime();

        f.add(3000, 10);
        System.out.println(System.nanoTime() - startSecondRemove + " : ArrayListInsert 3000");
        startSecondRemove = System.nanoTime();
        f.remove(3000);
        System.out.println(System.nanoTime() - startSecondRemove + " : ArrayListRemove 3000");


        for (int i = 0; i < 5001; i++) {
            g.add(i);
        }
        startThirdRemove = System.nanoTime();
        g.add(5000, 10);
        System.out.println(System.nanoTime() - startThirdRemove + " : ArrayListInsert5000");
        startThirdRemove = System.nanoTime();
        g.remove(5000);
        System.out.println(System.nanoTime() - startThirdRemove + " : ArrayListRemove 5000");

    }
}
