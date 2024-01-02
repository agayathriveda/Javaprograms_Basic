import java.util.Scanner;

public class firstnnaturalnum
	{
		public static void main(String args[])
		{
			System.out.println("Enter the total numbers: ");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			System.out.println("First n natural numbers are -------------------");
			for (int i = 1; i <= number; i++)
				{
					System.out.println(i);
				}
		}

	}
