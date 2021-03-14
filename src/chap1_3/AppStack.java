package chap1_3;

public class AppStack {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        String stringInput = "to be or not to - be - - that - - - is";
        String[] inputs = stringInput.split(" ");
        for (String s : inputs) {
            if (!s.equals("-")) {
                stringStack.push(s);
            } else if (!stringStack.isEmpty()) {
                System.out.println(stringStack.pop());
            }
        }
    }
}
