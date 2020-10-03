class Prime {
    public static void main(String[] args) {
		boolean flag = true;
        
        System.out.println("-------To Display the prime numbers(1-100)-----");
		
        for(int i = 3; i < 100; i++) {
            for(int j = 2; j < (i / 2); j++) {
        	    if(i%j==0) {
                    flag = false;
                    break;
                }	
            }
            
            if(flag == true) {
                System.out.println(i + " ");
            }
            
            flag = true;	
        }             
    }
}