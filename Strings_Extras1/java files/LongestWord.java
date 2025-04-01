import java.util.Scanner;
import java.util.Arrays;

public class LongestWord{
	
	public static String[] words(String s){
		return s.split(" ");
		
	}
	public static int[] lengths(String[] arr){
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			ans[i] = arr[i].length();
		}
		return ans;
	}
	public static String longest(String str){
		String[] words = words(str);
		int[] lens = lengths(words);
		String longest = words[0];
		int lidx = 0;
		for(int i=1;i<words.length;i++){
			if(lens[lidx]<lens[i]){
				longest = words[i];
				lidx = i;
			}
		}
		return longest;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str = sc.nextLine();
		System.out.println("Longest word in the string is:  "+ longest(str));
		sc.close();
	}
	
}