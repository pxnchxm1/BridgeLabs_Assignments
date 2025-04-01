import java.util.Scanner;
import java.util.Arrays;
public class Eight{
    
    public static String canVote(int age){
		if(age<0){
			return "Invalid age ";
		}else if(age>=18){
			return "Can Vote";
		}else{
			return "Cannot vote";
		}
        
    }
	public static int genAge(){
		return (int)( Math.random()*30 + 1);
	}
    
	public static int[] getAges(){
		int[] ans = new int[10];
		for(int i=0;i<10;i++){
			ans[i]=Eight.genAge();
		}
		return ans;
	}
	public static String[][] validity(int[] ages){
		String[][] res = new String[ages.length][2];
		for(int i=0;i<ages.length;i++){
			res[i][0] = Integer.toString(ages[i]);
			res[i][1] = canVote(ages[i]);
		}
		return res;
	}
    public static void main(String[] args) {
 
       
	   int[] ages = getAges();
	   String[][] res = Eight.validity(ages);
	   for(int i=0;i<res.length;i++){
	       System.out.println("Age : " +res[i][0]+ " : " + res[i][1]);
	   }
	   
    }
}