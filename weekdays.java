import java.util.Scanner;
public class weekdays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of your choice");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.print("MONDAY");
                break;
            case 2:
                System.out.print("TUESDAY");
                break;
            case 3:
                System.out.print("WEDNESDAY");
                break; 
            case 4:
                System.out.print("THURSDAY");
                break;
            case 5:
                System.out.print("FRIDAY");
                break;
            case 6:
                System.out.print("SATURDAY");
                break;
            case 7:
                System.out.print("SUNDAY");
                break;
            default:
                System.out.print("INVALID DAY");
            }
        sc.close();
    }
}




//OUTPUT
//Enter a number of your choice:1
//MONDAY
//Enter a number of your choice:2
//TUESDAY
//Enter a number of your choice:3
//WEDNESDAY
//Enter a number of your choice:4
//THURSDAY
//Enter a number of your choice:5
//FRIDAY
//Enter a number of your choice:6
//SATURDAY
//Enter a number of your choice:7
//SUNDAY
//
//
