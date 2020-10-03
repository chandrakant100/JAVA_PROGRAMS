import java.util.Scanner;

class Fact
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("----To find the factorial of any number-----");
      
      System.out.println("Enter any number:");
      int num = sc.nextInt();
      
      int fact = 1;
      int temp = num;
      
      while(num != 1)
      {
      	fact *= num;
      	num--;
      }

      System.out.println("The facrial of the number " + temp + " is " + fact);
      
      sc.close();
   }
}
