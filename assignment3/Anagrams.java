
import java.util.Scanner;

public class Anagrams {
    // Basically this isAnagram will take take 2 string as input
    static boolean isAnagram(String a, String b) {
        
        boolean result = true;
        int sz = 26;
        int [] count = new int[sz];
        
        //here we'll check whether the length of both the strings are identical or not
        if(a.length()!=b.length()) result = false;
        
        //we'll loop through the strings char by char and keep adding the char respect to it's numeric value in array from string1
        //i.e a=0,b=1,c=2
        //and then we'll remove values which we'll find in the string2 simultaneously 
        for(int i=0;i<a.length() && i<b.length();i++){
            count[a.toLowerCase().charAt(i) % 26]++;
            count[b.toLowerCase().charAt(i) % 26]--;
        }
        
        //lastly we'll check if the values in arrary are completely 0 then it means strings are anagrams of each other
        // else it will display not anagrams
        for(int k=0;k<sz;k++){
            if (count[k] != 0) {
                result = false;
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
