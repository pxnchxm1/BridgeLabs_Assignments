import java.util.Scanner;
import java.util.Arrays;

public class ToggleCase{
	
	public static String toggle(String s){
		String ans = "";
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c-0 >=65 && c-0 <= 123){
				if(c-0 >=97){
					char t = (char) ((c-0) - 32);
					ans += t;
			    }else{
					char t = (char) ((c-0) + 32);
					ans += t;
			    }
			}else{
				ans += c;
			}
			
		}
		return ans;
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str = sc.nextLine();
		
		System.out.println("After toggling case, the string is:  "+ toggle(str));
		sc.close();
	}
	
}