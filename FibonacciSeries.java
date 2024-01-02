import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series: ");
        int numTerms = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.println("\nThe Fibonacci Series is:");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm);

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
