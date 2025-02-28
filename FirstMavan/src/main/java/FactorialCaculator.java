
import java.util.Scanner;

public class FactorialCaculator {

    public static long calculateFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void printFactorial(int num) {
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        printFactorial(number);
    }
}
