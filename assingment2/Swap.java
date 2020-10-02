import java.util.Scanner;

class First
{
	int num1;

	void show1()
	{
		System.out.println("After Swappinng:\nA="+num1);		
	}
}

class Second
{
	int num2;

	void show2()
	{
		System.out.println("After Swappinng:\nB="+num2);
	}		
}

class Swap
{
	static void swap(First obj1, Second obj2)
	{
		int temp;
		temp=obj1.num1;
		obj1.num1=obj2.num2;
		obj2.num2=temp;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		First obj1=new First();
		Second obj2=new Second();

		System.out.println("Enter the value of num1 and num2 respectively:");
		obj1.num1=sc.nextInt();
		obj2.num2=sc.nextInt();

		System.out.println("Before Swappinng:\nA="+obj1.num1+" and B="+obj2.num2);
		swap(obj1,obj2);
		obj1.show1();
		obj2.show2();

		sc.close();
	}
}

