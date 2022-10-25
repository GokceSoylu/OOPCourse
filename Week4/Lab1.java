package Week4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab1 
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in);
        int a=101;
        System.out.println("please enter string ");
        try
        {//bence bu kisim onemli eğer hata yakalanirsa try bloguna devam edilmez hata yakalnadiği anda birakilip cath'e gecilir
            a=in.nextInt();
            System.out.println("try blogunun ici, hata yok");
            System.out.println("a = "+a);
        }
        catch(InputMismatchException exception)
        {//görüldüğü üzere eğer hata yakalanmazsa catch bloğun ahiç giirlmez. olurda hata yakalanirsada catch bloğunun tamami çaliştirişir :))
            System.out.println(exception.getMessage());
            System.out.println("catch blogu. hata yakalndi");
            System.out.println("a = "+a);
        }
        finally
        {
            System.out.println("kücük eniste, kamber ne dersen fianlly her türlü gelir :))");
        }
        System.out.println("Done!");
        System.out.println("a = "+a);
    }//try-catch'in asil faydalarindan biri ise bu hata dan sonraki kismi çaliştimak koda devam edebilmek
}//? çıktılara da dikkat edelim. eğer hata varsa atama yapılmadı ve initialize değer yazdırıldı. Ancak hat yoksa klavyeden girilen değer 
//? yazdırıldı hiç bir sıkıntı yaşanmadı
