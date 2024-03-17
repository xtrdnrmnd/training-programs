import java.util.ArrayList;

class FibonacciSequence {
    public ArrayList<Integer> calculateFibonacciSequence(int input) {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(0);
        for (int i = 0; i < input-1; i++) {
            if (i <= 1) fibonacciSequence.add(1);
            else fibonacciSequence.add(fibonacciSequence.get(i-1)+fibonacciSequence.get(i));
        }
        return fibonacciSequence;
    }
}
