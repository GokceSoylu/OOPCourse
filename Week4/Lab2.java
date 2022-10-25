package Week4;
import java.util.*;
public class Lab2 
{
    private String name;
    private int salary;
    private static int counter=0;

    Lab2(String name, int salary)
    {
        this.salary=salary;
        this.name=name;
        counter++;
    }
    public void get_info()
    {
        System.out.println("name = "+name+"  salary = "+salary);
    }
    public void set_name(String name)
    {
        this.name=name;
    }
    public void set_salary()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("plesase enter "+this.name+"s new salary ");
        int salary=in.nextInt();
        if(salary>0)
            this.salary=salary;
        else
            throw new IllegalArgumentException("saalry amount must be greather then zero");//maşnde de yakalayacağız :))

    }
    public void get_counter()
    {
        System.out.println("total worker = "+counter);
    }
}
