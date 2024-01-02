import java.util.Scanner;
import java.lang.Math;
public class Quadeq {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The general equation of a Quadratic expession is:ax2+bx+c");
        System.out.println("Enter the value of a in the above equation:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b in the above equation:");
        double b = sc.nextDouble();
        System.out.println("Enter the value of the constant c in the above equation");
        double c = sc.nextDouble();
        sc.close();
        double d = b*b-4*a*c;
        if (d>0)
        {
            double r1 = (-b + Math.pow(d, 0.5))/(2*a);
			double r2 = (-b - Math.pow(d, 0.5))/(2*a);
			System.out.println("Roots are real roots in this case and they are" + r1 + " and " + r2);
        }
        else if(d==0)
        {
            System.out.println("Roots are real and equal.The roots are"+b/(2*a));
        }
        else
        {
            System.out.println("The roots are imaginary");
            
        }

    }

}

