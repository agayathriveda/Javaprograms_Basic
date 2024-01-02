import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int inputNumber = sc.nextInt();
        int factorialResult = 1;

        if (inputNumber == 0) {
            System.out.print("Factorial of " + inputNumber + " is " + factorialResult);
        } else if (inputNumber > 0) {
            for (int i = 1; i <= inputNumber; i++) {
                factorialResult = factorialResult * i;
            }
            System.out.print("\nFactorial of the given number is " + factorialResult);
        } else {
            System.out.print("\nEntered a wrong number");
        }
    }
}

