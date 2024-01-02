import java.util.Scanner;

public class multiplicationtable
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to display the multiplication table: ");
		int num = sc.nextInt();
		for (int i=1; i<21; i++)
		{
			System.out.print(num + " x " + i + "  = " + num*i + "\n");
		}
	}
}

