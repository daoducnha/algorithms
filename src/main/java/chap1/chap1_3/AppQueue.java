package chap1.chap1_3;

public class AppQueue {
    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue();
        String stringInput = "to be or not to - be - - that - - - is";
        String[] inputs = stringInput.split(" ");
        for (String s : inputs) {
            if (!s.equals("-")) {
                stringQueue.enqueue(s);
            } else if (!stringQueue.isEmpty()) {
                System.out.println(stringQueue.dequeue());
            }
        }
    }
}
