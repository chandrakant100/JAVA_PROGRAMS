/**
 * @description: Get sum of array elements
 */
 
class ArraySum{
	
   public static void main(String args[]){
      int[] array = {10, 20, 30, 40, 50, 10};
      int sum = 0;
      //Advanced for loop
      for( int num : array) {
          sum = sum+num;
      }
	  
	  // Print sum of array elements
      System.out.println("Sum of array elements is:"+sum);
   }
   
}