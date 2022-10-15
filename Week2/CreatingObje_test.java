package Week2;
import java.util.Scanner;
public class CreatingObje_test 
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in);
        CreatingObje worker=new CreatingObje(); 
        worker.name="halime";
        worker.socialSecurity_num=1234;
        worker.wages=100;
        worker.working_hours=40;

        worker.display_info();
        worker.display_salalry();

        CreatingObje worker2=worker;
        worker2.display_info();
        worker2.display_salalry();

        worker.name="osman";
        worker2.display_info();

        worker2.name=in.nextLine();
        worker2.socialSecurity_num=in.nextInt();
        worker2.wages=in.nextInt();
        worker2.working_hours=in.nextInt();
        worker.display_info();
        worker.display_salalry();
        in.close();
    }
}
