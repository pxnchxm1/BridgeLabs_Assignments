import java.util.Scanner;
import java.util.Arrays;
public class Palindrome {
    
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
			{
				return false;
			}
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursion(String s,int start,int end) {
		
        if (start >= end){
			return true;
		}
        if (s.charAt(start) != s.charAt(end)) 
		{
			return false;
		}
        return isPalindromeRecursion(s, start + 1, end - 1);
    }

   
    public static boolean isPalindromeArray(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) 
		{
			rev[i] = s.charAt(arr.length - 1 - i);
		}
        return  Arrays.equals(arr,rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine().toLowerCase(); 
        
        System.out.println("Two-pointer: " + isPalindrome(s));
        System.out.println("Recursion: " + isPalindromeRecursion(s,0,s.length()-1));
        System.out.println("Char Array: " + isPalindromeArray(s));
        
        sc.close();
    }
}
