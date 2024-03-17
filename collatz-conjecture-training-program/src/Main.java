import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("The Collatz conjecture is one of the most famous unsolved problems in mathematics. " +
                    "The conjecture asks whether repeating two simple arithmetic operations will eventually\n transform " +
                    "every positive integer into 1. It concerns sequences of integers in which each term is obtained " +
                    "from the previous term as follows: if the previous term is even,\n the next term is one half of the previous " +
                    "term. If the previous term is odd, the next term is 3 times the previous term plus 1. " +
                    "The conjecture is that these sequences\n always reach 1, no matter which positive integer is chosen " +
                    "to start the sequence.(Taken from Wiki)\nWrite 1 if you want to continue and 2 if you want to quit");
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Please, input the number:");
                    try {
                        int number = in.nextInt();
                        System.out.println("The number of steps needed is " + collatz(number).size() + " and the sequence is as follows: " + collatz(number) + "\n");
                    } catch (Exception e) {
                        System.out.println("You have inserted the wrong input!");
                    }
                    break;
                case 2:
                    x = 0;
                    System.out.println("Thanks for being with us! Bye:)");
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        } while ( x != 0);
    }

    public static LinkedList<Integer> collatz(int number) {
        LinkedList<Integer> collatzSteps = new LinkedList<>();
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
                collatzSteps.add(number);
            }
            else {
                number = number * 3 + 1;
                collatzSteps.add(number);
            }
        }
        return collatzSteps;
    }
}


