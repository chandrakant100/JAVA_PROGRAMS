
import java.util.StringTokenizer;

public class stringReverse {
    public static void main(String[] args){

        //using charAt()
        String str = "The quick brown fox jumps over the lazy dog";
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        //using char_Array
        char[] arr_c = str.toCharArray();
        System.out.print("\n");
        for(int j=arr_c.length-1;j>=0;j--){
            System.out.print(arr_c[j]);
        }

        //using byte_Array
        byte[] arr_b = str.getBytes();
        byte[] re_by=new byte[arr_b.length];
        System.out.print("\n");
        for(int k = 0;k<=arr_b.length-1;k++){
            re_by[k] = arr_b[arr_b.length-k-1];
        }
        System.out.print(new String(re_by));

        //using reverse()
        StringBuilder sbl = new StringBuilder(str);
        System.out.print("\n");
        System.out.println(sbl.reverse());

        //using Swapping with help of Array
        char[] temp =str.toCharArray();
        char[] k = new char[temp.length];

        for(int i=0;i<=temp.length-1;i++){
            k[i]=temp[temp.length-i-1];
        }
        System.out.println(k);

    }
}
