package chap2;

import edu.princeton.cs.introcs.StdRandom;

import java.util.Random;

public class Quick3Way extends Example {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int lt = lo;
        int i = lo + 1;
        int gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt--);
            else i++;
        }
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
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
