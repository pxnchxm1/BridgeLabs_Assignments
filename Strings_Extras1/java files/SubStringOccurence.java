import java.util.Scanner;
import java.util.Arrays;

public class SubStringOccurence{
	
	public static int subCount(String s,String sub){
		return (s.split(sub)).length - 1;
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str = sc.nextLine();
		System.out.println("ENTER THE SUBSTRING : ");
		String sub = sc.nextLine();
		System.out.println("Occurence of substring  in the string is:  "+ subCount(str,sub));
		sc.close();
	}
	
}