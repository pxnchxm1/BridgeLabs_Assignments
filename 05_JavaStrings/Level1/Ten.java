import java.util.Scanner;
import java.util.Arrays;
public class Ten {
    public static String toLower(String s){
		String ans="";
		for(int i=0;i<s.length();i++){
			if (s.charAt(i)-0 <97){
				ans += (char)(s.charAt(i) + 32);
			}
			else{
				ans+=s.charAt(i);
			}
		}
		System.out.println("using conversion : " + ans);
		return ans;
	} 
	public static String toLowerBuilt(String s){
		String ans = s.toLowerCase();
		System.out.println("using built in method : " + ans);
		return ans;
		
	} 
	public static String compare(String a ,String b){
		
		String ans = "";
		if(a.equals(b)){
			ans="They both are equal" ;
		}else{
			ans = "Not equal";
		}
		return ans;
	} 
	

	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : " );
		String s = sc.nextLine();
		String s1 = Ten.toLowerBuilt(s);
		String s2 = Ten.toLower(s);
		System.out.println(Ten.compare(s1,s2));
		
        sc.close();
    }
}
