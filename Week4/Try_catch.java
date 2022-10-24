package Week4;
import java.util.*;
public class Try_catch 
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in);
        int a, b, c;
        System.out.println("enter the firs number please ");
        a=in.nextInt();
        System.out.println("please enter the second number");
        b=in.nextInt();
        while(true)
        {
            try
            {
                c=a/b;
                break;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
                System.out.println("please enter the second number again but not zero :)");
                b=in.nextInt();
            }
        }
        System.out.println(c);
    }    
}
