package Week5.Lab;

public class Main 
{
    public static void main(String[] Soylu)
    {
        Person p=new Person("Necmiye", "Soylu", 22,"ce");
        Car c=new Car(p,"black","opel insignia");
        c.getOwner().showInfo();
    }    
}
