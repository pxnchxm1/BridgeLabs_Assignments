import java.util.Scanner;
import java.util.Arrays;
public class Seven{
    
    static int start(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				return i;
			}
		}
		return 0;
	}
	static int end(String s){
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)!=' '){
				return i;
			}
		}
		return s.length()-1;
	}
	static String subS(int start,int end,String s){
		String ans="";
		for(int i=start;i<=end;i++){
			ans+=s.charAt(i);
		}
		return ans;
	}
	static String compare(String a ,String b){
		if(a.equals(b)){
			return "They are equal";
		}
		return "Not equal";
	}
	
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	   int s = Seven.start(str);
	   int e = Seven.end(str);
	   String sub = Seven.subS(s,e,str);
	   String t = str.trim();
	   System.out.println("Using user defined trim : "+ sub);
	   System.out.println("Using built in  trim : "+ t);
	   System.out.println("Comparing...."+ Seven.compare(sub,t));
	   
    }
}

