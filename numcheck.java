import java.util.Scanner;

public class numcheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of yor choice:");
        int a = sc.nextInt();
        if (a>0)
        {
            System.out.println("The given number is positive");
        }
        else if(a==0)
        {
            System.out.println("The given number is either positive or negative");
        }
        else
        {
            System.out.println("The given number is negative");
        }
    }
}