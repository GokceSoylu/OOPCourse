package Week8;

public class lecture 
{
    public static void main(String[] Soylu)
    {
        Dog d=new Dog("pink");
        Cat c=new Cat("blue",5);
        British b=new British("white", 9);
    }    
}
class Animal
{
    String color;

    Animal(String color)
    {
        this.color=color;
    }
    void eat()
    {

    }
}

class Cat extends Animal
{
    int age;
    Cat(String color, int age)
    {
        // this.color=color; cod tekrarı olduğu için boyle yapmak hoş değil
        super(color);
        this.age=age;
    }
    void meow()
    {

    }
  
}
class Dog extends Animal
{
    String breed;
    Dog(String color)
    {
        super(color);
    }
    public void bark()
    {

    }
}
class British extends Cat
{
    British(String color, int age)
    {
        super(color, age);
    }
}