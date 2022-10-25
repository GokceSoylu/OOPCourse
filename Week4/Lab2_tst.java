package Week4;

public class Lab2_tst
{
    public static void main(String[] Soylu)
    {
        Lab2 worker1=new Lab2("hasan sabbah",120);
        Lab2 worker2=new Lab2("tomris",24000);
        Lab2 worker3=new Lab2("cengiz",23000);
        worker3.get_counter();
        worker1.get_info();
        try
        {
            worker1.set_salary();
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        worker1.get_info();
        worker2.get_counter();
    }
}