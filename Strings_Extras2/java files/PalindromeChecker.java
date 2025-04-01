import java.util.Scanner;
public class PalindromeChecker{
	public static boolean isPalindrome(String s ){
	   String rev="";
	   for(int i=s.length()-1;i>=0;i--){
		   rev+=s.charAt(i);
	   }
	   return rev.equals(s);
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : " );
		String str =sc.nextLine();
		System.out.println("Is palindrome ? " + isPalindrome(str));
		sc.close();
	
	}
}