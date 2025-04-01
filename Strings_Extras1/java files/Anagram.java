import java.util.Arrays;
import java.util.Scanner;
public class Anagram{
	
	public static boolean isAnagram(String a,String b){
		if (a.length() != b.length()) {
			return false;
		}
		char[] aa = a.toCharArray();
		Arrays.sort(aa);
		char[] bb = b.toCharArray();
		Arrays.sort(bb);
		
		return Arrays.equals(aa,bb);
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str1 = sc.next();
		System.out.println(" ENTER ANOTHER STRING ");
		String str2 = sc.next();
		System.out.println("IS ANAGRAM : "+ isAnagram(str1,str2));
		sc.close();
	}
	
}