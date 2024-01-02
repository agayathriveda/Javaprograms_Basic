import java.util.Scanner;

public class alphabet
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("\nPlease enter a characher: ");
       char ch = sc.next().charAt(0);
       if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
	{
	     System.out.print("\nEntered character is an Alphabet.");
	}
       else
       {
             System.out.print("\nEntered character is not an Alphabet.");
       }
    }
}
