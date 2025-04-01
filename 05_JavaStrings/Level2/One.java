import java.util.Scanner;
public class One {
    
	public static int handleExp(String s){
		int count = 0;
		try{
			String temp="";
			while(true){
				temp += s.charAt(count);
				count++;
			}
		}catch(Exception e){
			return count;
		}
	}
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = sc.next();
	   System.out.println("length using user defined method : "+ One.handleExp(str));
	  
	   System.out.println("length using built in method : " + str.length());
      
    }
}
