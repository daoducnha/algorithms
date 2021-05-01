package chap1.chap1_3;

public class AppStack {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        String stringInput = "it was - the best - of times - - - it was - the - -";
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
