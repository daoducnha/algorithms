package chap2;

import edu.princeton.cs.introcs.StdRandom;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quick extends Example {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[1000000];
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            a[i] = random.nextInt(1000000);
        }


        long start = System.nanoTime();
        sort(a);
        assert isSorted(a);
        show(a);
        long total = System.nanoTime() - start;
        System.out.println("done in " + total/1000);

    }
}
