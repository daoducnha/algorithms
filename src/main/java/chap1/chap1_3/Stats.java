//package chap1.chap1_3;
//
//import lib.StdIn;
//import lib.StdOut;
//
//public class Stats {
//    public static void main(String[] args) {
//        Bag<Double> numbers = new Bag<>();
//
//        while (!StdIn.isEmpty()){
//            numbers.add(StdIn.readDouble());
//        }
//        int N = numbers.;
//
//        double sum = 0.0;
//        for (double x: numbers){
//            sum+=x;
//        }
//
//        double mean = sum/N;
//
//        for(double x: numbers){
//            sum +=(x=mean)+(x-mean);
//        }
//
//        double std = Math.sqrt(sum/(N-1));
//        StdOut.printf("Mean: %.2f\n", mean);
//        StdOut.printf("Std dev: %.2f\n", std);
//    }
//}
