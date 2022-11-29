package Week8;
//inheritance için ornek ozellikle clinder kımında belli oluyor bu ilişki. bu ınek asıl abstruct ile guzel olur :)
public class Shaped 
{
    public static void main(String[] Soylu)
    {
        Clinder c=new Clinder(10,3);
        System.out.println(c);
    }
}
class Shape2D
{
    final double PI=3;
    double width;
    double height;
    double radius;

    public Shape2D(double width, double height)
    {
        this.height=height;
        this.width=width;
    }
    public Shape2D(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return height*width;
    }
    public String toString()
    {
        return width+" "+height;
    }
}
class Square extends Shape2D
{
    Square(double width)
    {
        super(width, width);
    }
}
class Rectangle extends Shape2D
{
    Rectangle(double width, double height)
    {
        super(width,height);
    }
}
class Circle extends Shape2D
{
    Circle(double radius)
    {
        super(radius);
    }
    public double getArea()//hocam dikkat edelim mesala bu metodu override edicez ya ana sınıfta bu public burada defoult yaparsak olmaz aynı olmalı
    {
        return PI*radius*radius;
    }
}
class Shape3D extends Shape2D
{
    double depth;
    public Shape3D(double depth, double width, double height)
    {
        super(width,height);
        this.depth=depth;
    }
    public Shape3D(double depth, double radius)
    {
        super(radius);
        this.depth=depth;
    }
    double getVolume()
    {
        return getArea()*depth;
    }
    public String toString()
    {
        return depth+" "+width+" "+" "+height;
    }
}
class Clinder extends Shape3D
{
    Circle c;
    Clinder(double depth,double radius)
    {
        super(depth,radius);
        Circle c=new Circle(radius);
        this.c=c;
    }
    public double getVolume()
    {
        return c.getArea()*depth;
    }
    public double getArea()
    {
        return c.getArea()+getArea();
    }
    public String toString()
    {
        return "volume = "+getVolume();
    }
}