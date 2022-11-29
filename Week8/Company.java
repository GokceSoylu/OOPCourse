package Week8;

class Main
{
    public static void main(String[] Soylu)
    {
        Company c=new Company();
        Google g=new Google();
        Microsoft m=new Microsoft();

        c.adress();
        g.adress();
        m.adress();

        System.out.println();
        
        Company arr[]=new Company[]{c,g,m};
        for(Company cc:arr)
            cc.adress();
    }
}
public class Company 
{
    public void adress()
    {
        System.out.println("defoult adress");
    }
}
class Google extends Company
{
    public void adress()
    {
        System.out.println("google adres");
    }
}
class Microsoft extends Company
{
    public void adress()
    {
        System.out.println("microsoft adress");
    }
}
