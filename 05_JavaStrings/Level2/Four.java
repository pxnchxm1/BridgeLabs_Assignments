import java.util.Scanner;
import java.util.Arrays;
public class Four{
    
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
		for(int i=0; i < Four.len(s);i++){
			if((s.charAt(i)) == ' '){
				w++;
			}
		}
		return (s=="" ? 0 : w+1);
	}
	public static String[][] wordArray(String s){
		int w = Four.wordCount(s);
		int idx=0;
		String[][] ans = new String[w][2];
		String temp="";
		for(int i=0; i < Four.len(s);i++){
			
			if(s.charAt(i)== ' ' ){
				ans[idx][0] = temp;
				ans[idx][1] = String.valueOf(Four.len(temp));
				idx++;
				temp="";
			}
			else{ 
			 temp+=s.charAt(i);
			}
			
		}
		ans[idx][0]=temp;
		ans[idx][1] =  String.valueOf(Four.len(temp));
		return ans;
		
	}
	public static String[] shortestLargest(String[][] arr){
	    String[] a = new String[2];
	    int smIdx = 0;
	    int lgIdx = 0;
	    for(int i = 0 ; i<arr.length;i++){
	        int num = Integer.parseInt(arr[i][1]);
	        
	        smIdx = (Math.min(Integer.parseInt(arr[smIdx][1]),num)==num) ? i : smIdx;
	        lgIdx = (Math.max(Integer.parseInt(arr[lgIdx][1]),num)==num) ? i : lgIdx;
	    }
	    a[0] = arr[smIdx][0];
	    a[1] = arr[lgIdx][0];
	    return a;
	}
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	  
	  String[][] arr = Four.wordArray(str);
	  String[] answer = Four.shortestLargest(arr);
	  System.out.println("Shortest word : "+ answer[0] + "\nLongest : "+answer[1]);
      
    }
}

