class Prime{
        public static void main(String argv[])
            {
                System.out.println("-------To Display the prime numbers(1-100)-----");
                int i,j;
                int flag=1;

                for(i=3;i<100;i++)
                {
                	for(j=2;j<(i/2);j++)
                			{
                				if(i%j==0)
                					{
                						flag=0;
                						break;
                					}	
                			}
                		if(flag==1)
                			System.out.println(i+" ");
                			flag=1;	
                }

                
            }
}