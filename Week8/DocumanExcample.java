package Week8;

public class DocumanExcample 
{
    public static void main(String[] Soylu)
    {
        Date d=new Date(18,8,2000);
        Email e=new Email();
        Email e2=new Email();
        e.AddAuthor("soylu1");
        e2.AddAuthor("soylu2");
        Document arr[]=new Document[]{e,e2};
        for(Document itr:arr)
            itr.printAuthors();
    }    
}
class Document
{
    private String[] authors;
    Date date;
    static int number=0;
    Document()
    {
        this(5);
    }
    Document(int numberOfAuthors)
    {
        String authors[]=new String[numberOfAuthors];
        this.authors=authors;
    }
    void setDAte(Date date)
    {
        this.date=date;
    }
    String[] getAuthors()
    {
        return authors;
    }
    void printAuthors()
    {
        for(String d:authors)
            System.out.println(d);
    }
    void AddAuthor( String name)
    {
        authors[number++]=name;
    }
    Date getDate()
    {
        return date;
    }
}
class Date
{
    int day;
    int month;
    int year;
    Date(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
}
class Book extends Document
{
    private String title;

    String getTitle()
    {
        return title;
    }
}
class Email extends Document
{
    private String subject;
    private String[] to;

    Email()
    {
        super();
        this.to=getAuthors();
    }
    String getSubject()
    {
        return subject;
    }
    String[] getTo()
    {
        return to;
    }
}