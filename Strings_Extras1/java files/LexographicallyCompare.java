import java.util.Scanner;
import java.util.Arrays;

public class LexographicallyCompare{
	public static int returnInt(String a,String b){
		int l = Math.min(a.length(),b.length());
		for(int i=0;i<l;i++){
			if(a.charAt(i) != b.charAt(i)){
				return a.charAt(i) - b.charAt(i) ;
			}
		}
		return a.length()-b.length();
	}
	
	public static void stringCompare(String a,String b){
		int res = returnInt(a,b);
		if(res==0){
			System.out.println("both words are equal lexographically");
		}else if(res>0){
			System.out.println(b+ " comes before " + a + " lexographically");
		}else{
			System.out.println( a+ " comes before " + b + " lexographically");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str1 = sc.nextLine();
		System.out.println("ENTER ANOTHER STRING : ");
		String str2 = sc.nextLine();
		stringCompare(str1,str2);
		sc.close();
	}
	
}