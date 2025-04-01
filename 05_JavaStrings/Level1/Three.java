import java.util.Scanner;
import java.util.Arrays;
class Three {
    public static char[] charArr(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    public static boolean compare(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        char[] userArr = charArr(str);
        char[] builtArr = str.toCharArray();
		System.out.println("Using userdefined, array is :"+Arrays.toString(userArr));
		System.out.println("Using buit in, array is :"+Arrays.toString(builtArr));
        boolean compare = compare(userArr, builtArr);
        if(compare){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
    
}

