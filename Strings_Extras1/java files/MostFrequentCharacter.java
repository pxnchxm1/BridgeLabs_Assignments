import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class MostFrequentCharacter{
	
	public static char most(String s){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char ans = s.charAt(0);
		int max=0;
		for( char i : s.toCharArray()){
			map.put(i,map.getOrDefault(i,0)+1);
			if(map.get(i)> max){
				max= map.get(i);
				ans = i;
			}
			
		}
		return ans;
		
		
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str1 = sc.nextLine();
		System.out.println("most frequent character is  : "+ most(str1));
		
		sc.close();
	}
	
}