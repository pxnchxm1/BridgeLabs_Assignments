import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class ReplaceChar{
	
	public static String replace(String s,char r){
		
		String ans = "" ;
		for(char c : s.toCharArray()){
			if(c == r){
				ans+="abc";
			}else{
				ans+=c;
			}
		}
		return ans;
		
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str1 = sc.nextLine();
		System.out.println("enter a  char to replace with abc : ");
		char ch = sc.next().charAt(0);
		System.out.println("after removing the character  : "+ replace(str1,ch));
		sc.close();
	}
	
}