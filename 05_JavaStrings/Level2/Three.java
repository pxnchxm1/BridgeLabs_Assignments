import java.util.Scanner;
import java.util.Arrays;
public class Three{
    
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
		for(int i=0; i < Three.len(s);i++){
			if((s.charAt(i)) == ' '){
				w++;
			}
		}
		return (s=="" ? 0 : w+1);
	}
	public static String[][] wordArray(String s){
		int w = Three.wordCount(s);
		int idx=0;
		String[][] ans = new String[w][2];
		String temp="";
		for(int i=0; i < Three.len(s);i++){
			
			if(s.charAt(i)== ' ' ){
				ans[idx][0] = temp;
				ans[idx][1] = String.valueOf(Three.len(temp));
				idx++;
				temp="";
			}
			else{ 
			 temp+=s.charAt(i);
			}
			
		}
		ans[idx][0]=temp;
		ans[idx][1] =  String.valueOf(Three.len(temp));
		return ans;
		
	}
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	  
	  String[][] arr = Three.wordArray(str);
	 System.out.println("Word --- length");
	 for(int i=0;i<arr.length;i++){
	     System.out.println(arr[i][0] + "-----"+arr[i][1]);
	 }
      
    }
}

