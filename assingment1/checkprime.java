import java.util.*;
class CPrime{
        public static void main(String argv[])
            {
                System.out.println("-------To Check whether a number is prime or not-----");
                int i,num,flag=1;

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter any number:");
                num=sc.nextInt();

                for(i=2;i<num/2;i++)
                		if(num%i==0)
                		{
                				flag=0;
                				break;
                		}
                if(flag==1)
                	System.out.println("The number "+num+" is a prime number");
                else			
                	System.out.println("The number "+num+" is a not prime number");
                
            }
}