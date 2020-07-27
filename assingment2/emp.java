package assingment1;

import java.util.*;
class Emp
{
    int age;
    String name;
    float salary;
    void input()
    {
            Scanner sc=new Scanner(System.in);

            System.out.println("-----Enter the Data of Emp:\n-----");
           System.out.println("Name:");
            name=sc.nextLine();
           System.out.println("Age:");
            age=sc.nextInt();
           System.out.println("salary:");
           salary=sc.nextFloat();

            sc.close();
    }
    void display()
    {
        System.out.println("\n----The data are:-----");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("salary:"+salary);

    }
    public static void main(String[] args)
    {
        Emp obj=new Emp();
        obj.input();
        obj.display();
    }


}
