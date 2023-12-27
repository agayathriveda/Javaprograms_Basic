import java.util.Scanner;

public class averagesum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        double n1=sc.nextDouble();
        System.out.println("ENTER THE SECOND NUMBER:");
        double n2=sc.nextDouble();
        System.out.println("ENTER THE THIRD NUMBER");
        double n3=sc.nextDouble();
        System.out.println("ENTER THE FOURTH NUMBER");
        double n4=sc.nextDouble();
        double sum=n1+n2+n3+n4;
        double avg=(n1+n2+n3+n4)/4;
        System.out.println("THE SUM OF FOUR NUMBERS IS"+sum);
        System.out.println("THE AVERAGE OF TWO NUMBERS IS"+avg);
    }
}



//OUTPUT
//ENTER THE FIRST NUMBER
//3.14
//ENTER THE SECOND NUMBER:
//4
//ENTER THE THIRD NUMBER
//5.90
//ENTER THE FOURTH NUMBER
//8
//THE SUM OF FOUR NUMBERS IS21.04
//THE AVERAGE OF TWO NUMBERS IS5.26
