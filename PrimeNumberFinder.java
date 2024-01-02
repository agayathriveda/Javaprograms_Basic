import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Start Number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the End Number: ");
        int end = scanner.nextInt();

        int primeCount = 0;

        for (int currentNum = start; currentNum <= end; currentNum++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor < currentNum; divisor++) {
                if (currentNum % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime number: " + currentNum);
                primeCount++;
            }
        }

        System.out.println("Total number of primes: " + primeCount);
    }
}
