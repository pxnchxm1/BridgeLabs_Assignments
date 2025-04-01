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
	public static char[] uniques(String s){
		int l = len(s);
		int idx=0;
		StringBuilder uniqueChars = new StringBuilder();
		for(int i=0;i<l;i++){
			boolean flag = true;
			for (int j= i+1 ;j<l;j++){
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
	
	
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.nextLine();
	   char[] arr = Two.uniques(str);
	   System.out.println(Arrays.toString(arr));
      
    }
}

