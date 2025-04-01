import java.util.Scanner;
import java.util.Arrays;
public class Nine {
    public static String toUpper(String s){
		String ans="";
		for(int i=0;i<s.length();i++){
			if (s.charAt(i)-0 >=97){
				ans += (char)(s.charAt(i) - 32);
			}
			else{
				ans+=s.charAt(i);
			}
		}
		System.out.println("using conversion : " + ans);
		return ans;
	} 
	public static String toUpperBuilt(String s){
		String ans = s.toUpperCase();
		System.out.println("using built in method : " + ans);
		return ans;
		
	} 
	public static String compare(String a ,String b){
		
		String ans = "";
		if(a.equals(b)){
			ans="They both are equal" ;
		}else{
			ans = "Not equal";
		}
		return ans;
	} 
	

	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : " );
		String s = sc.nextLine();
		String s1 = Nine.toUpperBuilt(s);
		String s2 = Nine.toUpper(s);
		System.out.println(Nine.compare(s1,s2));
		
        sc.close();
    }
}
