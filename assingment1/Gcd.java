//wap to accept input from user
import java.util.Scanner;

class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);  //predefined class to take the input from the keyboard
		
		System.out.println("Enter the number 1:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number 2 :");
		int num2 = sc.nextInt();
		
		int temp1 = num1;
		int temp2 = num2;

		while(num1 != num2)
		{
			if(num1 > num2)
			{
				num1 = num1 - num2;
			} 
			else 
			{	
				num2 = num2 - num1;
			}	
		}

		System.out.println("The gcd of the number " + temp1 + " and " + temp2 + " are " + num1);

		sc.close();
	}
}
