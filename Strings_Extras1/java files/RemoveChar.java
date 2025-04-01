import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class RemoveChar{
	
	public static String remove(String s,char r){
		
		String ans = "" ;
		for(char c : s.toCharArray()){
			if(c != r){
				ans+=c;
			}
		}
		return ans;
		
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str1 = sc.nextLine();
		System.out.println("enter a  char to remove : ");
		char ch = sc.next().charAt(0);
		System.out.println("after removing the character  : "+ remove(str1,ch));
		sc.close();
	}
	
}