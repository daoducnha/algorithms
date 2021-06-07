package chap1.chap1_3;

import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<Character> ops = new Stack();
        Stack<Double> vals = new Stack();

        String expression = "(1+((2+3)*(4*5)))";

        for (char c : expression.toCharArray()) {
            if (c == '(') {
            } else if (c == '+') {
                ops.push(c);
            } else if (c == '-') {
                ops.push(c);
            } else if (c == '*') {
                ops.push(c);
            } else if (c == '/') {
                ops.push(c);
            } else if (c == ')') {
                char op = ops.pop();
                Double v = vals.pop();
                if (op == '+') {
                    v = vals.pop() + v;
                } else if (op == '-') {
                    v = vals.pop() - v;
                } else if (op == '*') {
                    v = vals.pop() * v;
                } else if (op == '/') {
                    v = vals.pop() / v;
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(Character.toString(c)));
            }
        }
        System.out.println(vals);


//        while (!StdIn.isEmpty()) {
//            String s = StdIn.readString();
//            if (s.equals("(")) ;
//            else if (s.equals("+")) ops.push(s);
//            else if (s.equals("-")) ops.push(s);
//            else if (s.equals("*")) ops.push(s);
//            else if (s.equals("/")) ops.push(s);
//            else if (s.equals(")")) {
//                String op = ops.pop();
//                double v = vals.pop();
//                if (op.equals("+")) v = vals.pop() + v;
//                else if (op.equals("-")) v = vals.pop() - v;
//                else if (op.equals("*")) v = vals.pop() * v;
//                else if (op.equals("/")) v = vals.pop() / v;
//                vals.push(v);
//            } else vals.push(Double.parseDouble(s));
//        }
//        StdOut.println(vals.pop());
    }
}
