import java.util.Scanner;
import java.util.Arrays;
public class Eight {
    public static String generateException(String[] arr){
		return arr[arr.length];
	}
	public static void handle(String[] arr){
		try{
			String ans = generateException(arr);
			System.out.println(ans);
		}catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("message : "+ e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
	}

	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array : " );
		int l = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[l];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter text " + i);
			arr[i] = sc.nextLine();
		}
		System.out.println("Arrays : "+ Arrays.toString(arr));
		//System.out.println("Element at index " + arr.length + " : " + Eight.generateException(arr));
        Eight.handle(arr);
        sc.close();
    }
}
