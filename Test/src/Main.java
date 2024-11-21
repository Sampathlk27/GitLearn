import java.util.Scanner;

class School
{
    Scanner sc=new Scanner(System.in);

    public int id;
    public String name;
    public int age;
    public int marks;
    String grade="fail";
    public School()
    {
        marks=0;
        id=0;
    }
    public void person()
    {
        System.out.println("Enter id:");
        id=new Scanner(System.in).nextInt();
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter age:");
        age=new Scanner(System.in).nextInt();
        System.out.println("Enter marks:");
        marks= sc.nextInt();
        if (marks>50) {
            grade = "Pass";
        }
        System.out.println("Id" + id + "Name" + name + " Age" + age +" Mark "+ marks + grade);
    }
}


public class Main {
    public static void main(String[] args)
    {


        School s=new School();
        s.person();
    }
}