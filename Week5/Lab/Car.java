package Week5.Lab;

public class Car 
{
    private Person owner;
    private String color;
    private String model;
    Car(Person owner, String color, String model)
    {
        this.owner=owner;
        this.color=color;
        this.model=model;
    }    
    public void changeOwner(Person person)
    {
        owner=person;
    }
    public Person getOwner()
    {
        return owner;
    }
}
