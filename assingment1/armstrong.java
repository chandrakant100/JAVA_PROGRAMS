import java.util.*;
class Armstrong
{
	public static void main(String argv[])
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);

		int num,temp,sum=0,temp2;
		num=sc.nextInt();
		temp=num;	
		temp2=num;
		while(num!=0)
			{
				temp=num%10;
				sum+=temp*temp*temp;

				num/=10;
			}
		if(sum==temp2)
			System.out.println("The number "+temp2+" is a armstrong number");
		else
			System.out.println("The number "+temp2+" is not a armstrong number");	


	}
}