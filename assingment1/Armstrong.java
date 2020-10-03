import java.util.Scanner;

class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number:");
		int num = sc.nextInt();

		int temp = num;	
		int temp2 = num;
		int sum = 0;

		while(num != 0)
		{
			temp = num % 10;
			sum += temp * temp * temp;
			num /= 10;
		}

		if(sum == temp2) 
		{
			System.out.println("The number " + temp2 + " is a armstrong number");
		} 
		else 
		{
			System.out.println("The number " + temp2 + " is not a armstrong number");	
		}

		sc.close();
	}
}