import java.util.Scanner;
import java.util.Arrays;
public class Two{
    
	public static int len(String s){
		int count = 0;
		try{
			while(true){
				s.charAt(count);
				count++;
			}
		}catch(Exception e){
			return count;
		}
	}
	public static int wordCount(String s){
		int w = 0;
		for(int i=0; i < Two.len(s);i++){
			if((s.charAt(i)) == ' '){
				w++;
			}
		}
		return (s=="" ? 0 : w+1);
	}
	public static String[] wordArray(String s){
		int w = Two.wordCount(s);
		int idx=0;
		String[] ans = new String[w];
		String temp="";
		for(int i=0; i < Two.len(s);i++){
			
			if(s.charAt(i)== ' ' ){
				ans[idx] = temp;
				idx++;
				temp="";
			}
			else{ 
			 temp+=s.charAt(i);
			}
			
		}
		ans[idx]=temp;
		return ans;
		
	}
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	  
	  String[] arr = Two.wordArray(str);
	  System.out.println("Split using user defined method : " + Arrays.toString(arr));
	  String[] arr2 = str.split(" ");
	  System.out.println("Split using built in method : " + Arrays.toString(arr2));
      System.out.println("Equal ? : " + Arrays.equals(arr,arr2));
      
    }
}

