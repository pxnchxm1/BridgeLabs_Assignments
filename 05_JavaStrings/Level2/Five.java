import java.util.Scanner;
import java.util.Arrays;
public class Five{
    
    public static char isVowel(char c){
        char ch = c;
        if(c-0 <97){
            ch = ( (char) (c-0 + 32));
        }
        if(ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u'){
            return 'v';
        }else if((ch - 0) >= 97 && (ch-1)<=123){
            return 'c';
        }
        return 'n';
    }
    public static int[] count(String s){
        int[] ans = new int[2];
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))=='v'){
                ans[0]++;
            }
            if(isVowel(s.charAt(i))=='c'){
                ans[1]++;
            }
        }
        return ans;
    }
	
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	   int[] res = Five.count(str);
	   System.out.println("vowels : "+ res[0]+"\n consonants : "+res[1]);
	   
    }
}

