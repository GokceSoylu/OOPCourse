package Week2;
import java.util.Scanner;
public class Input 
{
    public static void main(String[] Soylu)
    {
        Scanner input=new Scanner(System.in);
        char d=input.nextLine().charAt(0);
        String ee=input.nextLine();//inputs till enter
        int a=input.nextInt();
        float b=input.nextFloat();
        double c=input.nextDouble(); 
        String e=input.next();//inputs till space
        //System.out.println(a + b + c +e+ee);// topladı😂
        System.out.printf("%s %s %c %f %f %d",ee,e,d,c,b,a);
        input.close();
    }    
}
