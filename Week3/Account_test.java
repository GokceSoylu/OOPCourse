package Week3;
import java.util.*;
public class Account_test 
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in);
        int a;
        Account a1=new Account("necmiye",100000,1234);
        boolean while_=true;
        while(true)
        {
            a=menu();
            switch(a)
            {
                case 1:
                {
                    System.out.println("how much money do you add ");
                    a1.add(in.nextInt());
                    break;
                } 
                case 2:
                {
                    System.out.println("how much money do want to take ");
                    a1.withdraw(in.nextInt());
                    break;
                }
                case 3:
                {
                    System.out.println(3-a1.get_counter());
                    break;
                }
                case 4:
                    a1.get_info();
                    break;
                case 5:
                    while_=false;
                    break;
            }
            if(while_==false)
                break;
        }
        in.close();
    }    
    static int menu()
    {
        Scanner in=new Scanner(System.in);
        System.out.printf("%nadd money 1%nwitdraw money 2%ncheck process right 3%nget info 4%nexit 5");
        return in.nextInt();
    }
}
//değişkenin private olmadığı durumda set get metodlaarı kullanmak komik olur. çünkü private değilse zaten değişkene ulaşabiliyoruz fonk'a gerek olmaz
//peki normlade ulaşmadığımız varaible'a fonksiyon sayesinde ulaştık aslında dolaylı yoldan yine ulaşılabilir yaptık peki neden public yapmaktansa
//boyle dolayladık?  çünkü bu sayede değişken değiştirilmeden metoda uğramasının sağlıyoruz. Metodlarda da control yapabiliyoruz mesala burada 
//şifre soruduk belki girilen miktar negatif pozitif mi diye de kontrol edebilirdik vb. yani bu durm bize değişiklik yapmadan once kontrol
//fırsatı veriyor.