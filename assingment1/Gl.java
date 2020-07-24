//wap to accept input from user
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		int num1,num2,gcd;
		int temp1,temp2;
		Scanner sc=new Scanner(System.in);//predefined class to take the input from the keyboard
		System.out.println("Enter the number 1:");
		num1=sc.nextInt();
		System.out.println("Enter the number 2 :");
		num2=sc.nextInt();
		temp1=num1;
		temp2=num2;
		while(num1!=num2)
			{
				if(num1 > num2)
					num1=num1-num2;
				else	
					num2=num2-num1;	
			}
		gcd=num1;
		System.out.println("The gcd of the number "+temp1+" and "+temp2+" are "+gcd);
		sc.close();
	}

}
