package Week2;

public class CreatingObje_test 
{
    public static void main(String[] Soylu)
    {
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

    }
}
