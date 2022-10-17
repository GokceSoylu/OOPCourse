package Week3;
import java.util.*;
public class Account 
{
    private int balance;
    private String name;
    private int counter;
    private int pasword;
    
    public Account(String name, int balance, int pasword)
    {
        this.name=name;
        this.balance=balance;
        this.pasword=pasword;
        counter=0;
    }
    public void get_info()
    {
        System.out.println(name+" "+balance);
    }
    public void add(int amount)
    {
        balance+=amount;
    }
    public void withdraw(int amount)
    {
        boolean flag=true;
        Scanner in=new Scanner(System.in);
        if(counter<3)
        {
            flag=false;
            int counter2=0;
            while(counter2<3)
            {
                System.out.printf("%npasword:  ");
                int pasword_=in.nextInt();
                if(pasword_==pasword)
                {
                    balance-=amount;
                    flag=true;
                    break;
                }    
                else
                    counter2++;
            }
        }
        else
        {
            System.out.println("you have already withdraw a a lot of time");
        }
        counter++;
        //in.close();
        if(flag==false)
        {
            System.out.println("you enterde wrog paswodr lot of time. Pleaese try agin later");
        }
        
    }
    public int get_counter()
    {
        return counter;
    }
}
