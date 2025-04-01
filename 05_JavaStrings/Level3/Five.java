import java.util.Scanner;
import java.util.Arrays;
public class Five{
    
	
	public static int[] frequency(String s){
		int[] freqs = new int[256];
		Arrays.fill(freqs,0);
		for(int i=0;i<s.length();i++){
			freqs[s.charAt(i)]++;
		}
		return freqs; 
	}
	public static char[] uniques(String s){
		StringBuilder uniqueChars = new StringBuilder();
		for(int i=0;i<s.length();i++){
			boolean flag = true;
			for (int j= i+1 ;j<s.length();j++){
				if((s.charAt(i))==(s.charAt(j))){
					flag=false;
					break;
				}
			}
			if(flag){
				uniqueChars.append(s.charAt(i));
			}
			
		}
		return uniqueChars.toString().toCharArray();
	}
	public static String[][] frequencyOfChars(String s){
		int[] f = Four.frequency(s);
		char[] unique = Four.uniques(s);
		String[][] ans = new String[unique.length][2];
		int idx=0;
		for(int i=0;i<unique.length;i++){
			ans[i][0] = Character.toString(unique[i]);
			ans[i][1] = String.valueOf(f[unique[i]]);
		}
		return ans;
	}
	
	public static void display(String s){
		String[][] ans= frequencyOfChars(s) ;
		for(int i=0;i<ans.length;i++){
			System.out.println("Frequency of " + ans[i][0] + " is " + Integer.parseInt(ans[i][1]));
		}
	}
	
	
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	   display(str);
      
    }
}

