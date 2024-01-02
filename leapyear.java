import java.util.Scanner;

public class leapyear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(("A Leap yaer occurs once in every 4 or 8 years."));
        System.out.println("Enter the year:");
        int b = sc.nextInt();
        System.out.println("Enter the number of days:");
        int a = sc.nextInt();
        if (a==365)
        {
            System.out.println("The entered year is a leap year");
        }
        else
        {
            System.out.println("The entered year is not a leap year");
        }
    }
}
