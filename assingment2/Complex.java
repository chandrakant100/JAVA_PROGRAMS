package assingment1;

import java.util.Scanner;

class Complex{

    int a,b;

    void input(int num)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("---|numbers is is in the form a+bi|---");

        System.out.println("Enter the value of a"+num+":");
        a=sc.nextInt();
        System.out.println("Enter the value of b"+num+":");
        b=sc.nextInt();
        sc.close(); 
    }

    Complex sum(Complex obj2)
    {
        Complex obj3=new Complex();
        obj3.a=a+obj2.a;
        obj3.b=b+obj2.b;

        return obj3;
    }

    void display()
    {
        System.out.println("The sum is:"+a+"+i"+b);
    }
    
    public static void main(String[] args)
    {   
        Complex obj1=new Complex();
        Complex obj2=new Complex();
        Complex obj3=new Complex();

        obj1.input(1);
        obj2.input(2);
        obj3=obj1.sum(obj2);
        obj3.display();
    }
}