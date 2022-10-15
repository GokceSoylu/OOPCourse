package Week2;

public class CreatingObje 
{
    int socialSecurity_num, working_hours, wages;  
    String name;    

    public void display_info()
    {
        System.out.println(name+" "+socialSecurity_num);
    }
    public void display_salalry()
    {
        System.out.println(wages*working_hours);
    }
}
