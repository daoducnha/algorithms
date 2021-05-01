package chap1.chap1_3.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex1_3_4 {
    private static Map<String, String> openCloseMap = new HashMap<>();

    static {
        openCloseMap.put("}", "{");
        openCloseMap.put(")", "(");
        openCloseMap.put("]", "[");
    }

    public static void main(String[] args) {

        System.out.println(isGoodExpression("[()]{}{[()()]()}"));
        System.out.println(isGoodExpression("[(])"));


    }

    private static boolean isGoodExpression(String expression) {

        String[] parentheses = expression.split("");

        java.util.Stack<String> stack = new java.util.Stack<>();

        for (String s : parentheses) {
            if (s.equals("[") || s.equals("(") || s.equals("{")) {
                stack.push(s);
            } else if (s.equals("]") || s.equals(")") || s.equals("}")) {
                if (!openCloseMap.get(s).equals(stack.pop())) {
                    return false;
                }
            }
        }
        return true;
    }
}
