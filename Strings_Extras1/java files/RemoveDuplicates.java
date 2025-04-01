import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates{
	public static String unique(String s){
		String ans = "";
		for(int i=0;i<s.length();i++){
			if(!(ans.contains( Character.toString(s.charAt(i))))){
				ans += s.charAt(i);
			}
		}
		return ans;
		
	}
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str = sc.nextLine();
		System.out.println("After removing duplicates , string is :  "+ unique(str));
		sc.close();
	}
	
}