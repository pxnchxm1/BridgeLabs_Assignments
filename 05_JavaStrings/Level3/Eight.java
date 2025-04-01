import java.util.Scanner;
import java.util.Arrays;
public class Eight {
    
   

    public static void display(char[] a,char[] b) {
        Arrays.sort(a);
		Arrays.sort(b);
        if(Arrays.equals(a,b)){
			System.out.println("Anagram");
		}else{
			System.out.println("Not an anagram");
		}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        char[] str = sc.next().toCharArray();
		System.out.println("Enter another string : ");
        char[] str2 = sc.next().toCharArray();
        display(str,str2);
        sc.close();
    }
}
