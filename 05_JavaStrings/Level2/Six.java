import java.util.Scanner;
import java.util.Arrays;
public class Six{
    
    public static String isVowel(char c){
        char ch = c;
        if(c-0 <97){
            ch = ( (char) (c-0 + 32));
        }
        if(ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u'){
            return "vowel";
        }else if((ch - 0) >= 97 && (ch-1)<=123){
            return "consonant";
        }
        return "not a letter";
    }
    public static String[][] count(String s){
        String[][] ans = new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            ans[i][0] = Character.toString(s.charAt(i));
            ans[i][1] = isVowel(s.charAt(i));
        }
        return ans;
    }
	
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	   String[][] res = Six.count(str);
	   for(int i=0;i<res.length;i++){
	       System.out.println(res[i][0]+ " : " + res[i][1]);
	   }
	   
    }
}

