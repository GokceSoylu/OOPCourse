package Week8;
//access ile ilgili mini özet:
// private sadece class sınıfı scobu içerisinden ulaşılabilir!!!
//protected aynı package içerisinde herkes. farklı package de ise sadece alt sınınfı ulaşabilir 
//public herkes ulaşabilir.
public class AcsessExtended 
{
    public static void main(String[] Soylu)
    {
        Parent p=new Parent();
        Child c=new Child();
        System.out.println(c.getAtribute1());
        System.out.println(p.getAtribute1());
    }
}
class Parent
{
    private int atribute1;
    protected int atribute2;
    public int atribute3;
    protected final int atribute5=1;
    static int counter=0;

    Parent()
    {
        counter++;
        atribute1=20;
        System.out.println("parent is working ... "+counter);
    }
    private void method1()
    {
        System.out.println("private method1");
    }
    public void method2()
    {
        System.out.println("public method2");
    }
    protected void setAtribute1(int atribute1)
    {
        this.atribute1=atribute1;
    }   
    int getAtribute1()
    {
        return atribute1;
    }
}
class Child extends Parent
{
    public int atribute4;
    static int counter_c=0;
    public Child()
    {
        atribute4=10;
        //atribute1++; private değişkene ulaşılama<
        atribute2++;
        atribute3++;
        //atribute5++; final varaible daha sonradan değiştirilemez :))

        //super.method1(); private metoda da ulaşılamaz
        method2();
        setAtribute1(atribute4);
        counter_c++;
        System.out.println("child is working... "+counter_c);
    }
}