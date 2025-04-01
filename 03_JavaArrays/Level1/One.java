import java.util.Scanner;
public class One{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] studArray = new int[10];
		for(int i=0;i< studArray.length;i++){
			System.out.print("\nEnter age of student " + (i+1) + " : ");
			studArray[i] = sc.nextInt();
		}
		for( int i = 0 ;i <studArray.length ;i++){
			if(studArray[i]<0){
				System.err.println(studArray[i] + "is an invalid age");
			}
			else if (studArray[i]>=18){
				System.out.println("The student with age "+ studArray[i] + " can vote");
			}else{
				System.out.println("The student with age "+ studArray[i] + " cannot vote");
				
			}
		}
	}
}