import java.util.Scanner;

public class LeapYear{

    public static void main(String[] args) {

    	int year;
    	Scanner scan = new Scanner(System.in);
		
		// Taking user input
		
    	System.out.println("Enter any Year:");
    	year = scan.nextInt();
    	scan.close();
        boolean isLeap = false;
		
		// Validating that year is leap year or not

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
	
		// Print that year is leap year or not
        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}