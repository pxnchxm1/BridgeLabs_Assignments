import java.util.Scanner;
import java.util.Arrays;

public class VowelsConsonantCount{
	public static char vowels(char a){
		if(a == 'a' || a=='e' || a=='i' || a=='o' || a=='u'){
			return 'v';
		}else if ( (a - 0)>=97 && (a-0)<=123){
			return 'c';
		}else{
			return 'n';
		}
		
	}
	
	public static int[] count(String s){
		int[] ans = {0,0};
		for(int i=0;i<s.length();i++){
			if(vowels(s.charAt(i))=='v'){
				ans[0]++;
			}
			else if(vowels(s.charAt(i))=='c'){
				ans[1]++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str = sc.nextLine();
		int[] res = count(str);
		System.out.println("Vowels  : "+res[0]+"\nConsonants : " + res[1]);
		sc.close();
	}
	
}