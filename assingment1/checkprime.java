import java.util.*;
class CPrime{
        public static void main(String argv[])
            {
                System.out.println("-------To Check whether a number is prime or not-----");
                boolean flag = false;

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter any number:");
                int num=sc.nextInt();

                for(int i=2;i<num/2;i++)
                		if(num%i==0)
                		{
                				flag=true;
                				break;
                		}
                if(flag==true)
                	System.out.println("The number "+num+" is a prime number");
                else			
                	System.out.println("The number "+num+" is a not prime number");
                
            }
}
