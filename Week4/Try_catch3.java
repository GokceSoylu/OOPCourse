package Week4;
import java.util.Scanner;
public class Try_catch3 
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in);
        int a, b, c=0;
        System.out.println("enter the firs integer please ");
        a=in.nextInt();
        System.out.println("please enter the second integer ");
        b=in.nextInt();
        try
        {
            c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("the second number cannot be zero ");
            System.out.println("please enter it again ");
            b=in.nextInt();
            try
            {
                c=a/b;
            }
            catch(ArithmeticException ee)
            {
                System.out.println("no zero ");
            }
        }
        System.out.println(a/b);
    }
}
