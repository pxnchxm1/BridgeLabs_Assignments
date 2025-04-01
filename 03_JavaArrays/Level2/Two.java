import java.util.Scanner;
public class Two{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] ages = new int[3];
		int[] heights = new int[3];
		for(int i=0;i<3;i++){
			System.out.println("Enter age of friend "+(i+1)+" : ");
			ages[i]=sc.nextInt();
			System.out.println("Enter height of friend "+(i+1)+" : ");
			heights[i]=sc.nextInt();
		}
		int tall = Integer.MIN_VALUE;
		int tallIdx=0;
		int young = Integer.MAX_VALUE;
		int youngidx=0;
		for(int i=0;i<3;i++){
			if(ages[i]<young){
				young = ages[i];
				youngidx = i+1;
			}if(heights[i]>tall){
				tall = heights[i];
				tallIdx = i+1;
			}
		}
		System.out.println("Youngest of 3 friends is friend :" + youngidx + " and Tallest of three friends is Friend :"+ tallIdx );
		sc.close();
	}
}