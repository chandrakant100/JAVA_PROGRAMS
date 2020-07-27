import java.util.*;

class Complex2{

        int a,b;

    Complex2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("---|numbers is in the form a+bi|---");

        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        sc.close(); 
    }
    Complex2(Complex2 obj1,Complex2 obj2)
    {
        a=obj1.a+obj2.a;
        b=obj1.b+obj2.b;
    }
    void display()
    {
        System.out.println("The sum is:"+a+"+i"+b);
    }
    public static void main(String[] args)
    {   
        Complex2 obj1=new Complex2();
        Complex2 obj2=new Complex2();
        Complex2 obj3=new Complex2(obj1,obj2);
        obj3.display();
    
    }
}