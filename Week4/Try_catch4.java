package Week4;
import java.util.Scanner;
public class Try_catch4 
{
    public static void main(String[] Soylu)
    {
        int hour;
        Scanner in=new Scanner(System.in);
        while(true)
        {
            
            hour=in.nextInt();
            try
            {
                if(hour<0 || hour>23)
                throw new Exception("the hour value cannot be less then zero or more then 23 ");
                break;
            }
            catch(Exception e)
            {
                System.out.println("please enter the hour value again ");
                hour=in.nextInt();
            }
            
        }
        System.out.println("saat = "+hour+" :))");
    } 
    
}
//throws adı üsünde fırlat demek. Eğer zaten hata olacak programın hata vereceği bir yer varsa biz try catch kullanırız ama normalde hata
//vermeyeceği ancak bizim kodumuzun mantığına göre hatalı olan bir yer varsa o zaman bu durum oluştuğunda hahtayı biz kendimiz fırlatırız.
//mesela saat örenğinde olduğu gibi. saat değeri int 23 den fazla girilse haat vermez ancak kod mantığına aykırı o zamana biz kendimiz hata fırlatırız