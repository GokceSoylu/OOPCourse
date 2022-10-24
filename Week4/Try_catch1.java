package Week4;
import java.util.Scanner;
public class Try_catch1
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in); 
        int a, b;
        System.out.println("enter an integer ");
        a=in.nextInt();
        System.out.println("enter the second şnt please ");
        b=in.nextInt();
        try
        {
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)//hocam burası e olmak zorunda değil mahmud da yazabilirsin :))
        {
            System.out.println(e.getMessage());
            System.out.println("the second number cannot be zero ");
            //bu kısımın içinde biz getMesssage() fonksiyonunu kullanmasak hiç bize hata olduğunu soylemez direkt catch bloğunun içerisindeki
            //kodu çalıştırır kullanıcı hata aldığını fark etmez bile belki mesela Try_catch2.java dosyasına bakalım
        }
        //! System.out.println(c); buarada c yi yazdırmıyor çünkü akıllı bu try in içinde belki hata var birdaha neden yazdırmaya çalışayım
        //!diypr ki haklı bend ezaten hadı buarda nasıl yazdırcan sayi/0 'o dedim ki banane diyor :))
    } 
}