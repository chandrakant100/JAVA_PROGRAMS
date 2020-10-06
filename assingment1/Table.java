
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		
		System.out.println("Enter the number for finding table of the number: ");
		
		int n = sc.nextInt();
		
		//for loop for finding the table of the given number
		for(int j=1; j<=10; j++) {
			int result = n*j;
			System.out.print(n + " * " + j + " = " + result+ " ");
		}
		}		
	}
}
