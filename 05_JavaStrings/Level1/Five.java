import java.util.Scanner;

public class Five {
    public static char genExp(String s){
		return s.charAt(s.length());
	}
	public static void handleExp(String s){
		try{
			char res = genExp(s);
			System.out.println(res);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Five.handleExp(s);
        sc.close();
    }
}
