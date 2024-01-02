import java.util.Scanner;
import java.lang.Math;

public class Greatestof3
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number N1:");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number N2");
		int n2 = sc.nextInt();
		System.out.println("Enter the third number N3");
		int n3 = sc.nextInt();
        if (n1 > n2){
			if (n1 > n3)
				{
					System.out.println("Greatest among " + n1 + ", "  + n2 + " and " + n3 + " is " + n1);
				}
			else
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3  + " is " + n3);
				}
		}
		else
		{
			if (n2 > n3)
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3 + " is " + n2);
				}
			else
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3 + " is " + n3);
				}
		}
	}
}
        
    
