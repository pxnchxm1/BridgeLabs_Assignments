import java.util.Scanner;
import java.util.Arrays;
public class Nine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter no of columns : ");
		int cols = sc.nextInt();
		int[][] twoDArray = new int[rows][cols];
		int[] oneDArray = new int[rows*cols];
		int idx=0;
		for(int i = 0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.println(String.format("enter row %d col %d element",i,j));
				twoDArray[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i<rows;i++){
			if(idx==oneDArray.length){
				break;
			}
			for(int j=0;j<cols;j++){
				oneDArray[idx] = twoDArray[i][j];
				idx++;
			}
		}
		System.out.println(Arrays.toString(oneDArray));
	
		
		sc.close();
	}
}