import java.util.*;
class Fact
{
   public static void main(String []args)
   {
      System.out.println("----To find the factorial of any number-----");
      int num,i,fact=1,temp;

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number:");
      num=sc.nextInt();
      temp=num;
      while(num!=1)
      {
      	fact*=num;
      	num --;
      }
      System.out.println("The facrial of the number "+temp+" is "+fact);

   }
}
