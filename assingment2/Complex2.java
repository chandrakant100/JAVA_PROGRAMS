import java.util.Scanner;

class Complex2
{

    int a,b;

    Complex2(int num, Scanner sc)
    {
        System.out.println("---|numbers is in the form a+bi|---");
        System.out.println("Enter the value of a(real)"+num+":");
        a=sc.nextInt();
        System.out.println("Enter the value of b(imaginary)"+num+":");
        b=sc.nextInt(); 	
    }

    Complex2(Complex2 obj1, Complex2 obj2)
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
    	Scanner sc =new Scanner(System.in);
        Complex2 obj1=new Complex2(1,sc);
        Complex2 obj2=new Complex2(2,sc);
        Complex2 obj3=new Complex2(obj1,obj2);

        sc.close();
        obj3.display();
    }
}
