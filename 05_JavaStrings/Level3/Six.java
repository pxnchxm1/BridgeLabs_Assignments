import java.util.Scanner;

public class Six {
    
    public static String[] frequencyOfChars(String s) {
        char[] arr = s.toCharArray();
        int[] freq = new int[arr.length];  
        boolean[] counted = new boolean[arr.length];  
        for (int i = 0; i < arr.length; i++) {
            if (counted[i]) continue;  
            
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    counted[j] = true;  
                }
            }
            freq[i] = count;
        }

        int uniqueCount = 0;
        for (boolean c : counted) {
            if (!c) uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) {
                result[index++] = arr[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void display(String s) {
        String[] ans = frequencyOfChars(s);
        for (String str : ans) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        display(str);
        sc.close();
    }
}
