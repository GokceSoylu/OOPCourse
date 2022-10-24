package Week4;
import java.util.Scanner;
public class Try_catch2 
{
    public static void main(String[] Soylu)
    {
        int a, b, c;
        Scanner in=new Scanner(System.in);
        System.out.println("please enter two value");
        a=in.nextInt();
        b=in.nextInt();
        try
        {
            c=a/b;
        }
        catch(ArithmeticException e)
        {
            c=a;
        }
        System.out.println(c);
    }    
}
