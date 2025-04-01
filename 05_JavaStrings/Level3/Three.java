import java.util.Scanner;
import java.util.Arrays;
public class Three{
    
	
	public static int[] frequency(String s){
		int[] freqs = new int[256];
		Arrays.fill(freqs,0);
		for(int i=0;i<s.length();i++){
			freqs[s.charAt(i)]++;
		}
		return freqs; 
	}
	public static char nonRepeatingFirst(String s){
		int[] f = Three.frequency(s);
		for(int i=0;i<s.length();i++){
			if(f[s.charAt(i)]==1){
				return s.charAt(i);
			}
		}
		return '\0';
	}
	
	
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	   
	   System.out.println("first non repeating char is : "+ nonRepeatingFirst(str));
      
    }
}

