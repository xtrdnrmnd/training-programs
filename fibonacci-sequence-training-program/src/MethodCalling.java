import java.util.Scanner;

public class MethodCalling extends FibonacciSequence{
    public static void main(String[] args) {
        int x = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please insert the number: ");
                int number = input.nextInt();
                FibonacciSequence obj = new FibonacciSequence();
                System.out.println("Fibonacci sequence for the length " + number + ":\n" + obj.calculateFibonacciSequence(number));
                System.out.println("If you want to leave, press X. Else press any other button");
                String resp = input.next();
                if (resp.toUpperCase().contains("X")) x = 1;
            } catch (Exception e) {
                System.out.println("Wrong input. Please provide correct data!");
            }
        } while (x != 1);

    }
}
