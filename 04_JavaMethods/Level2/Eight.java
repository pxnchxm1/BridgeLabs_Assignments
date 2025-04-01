import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Eight{
	public static int youngest(int[] a){
		int young = Integer.MAX_VALUE;
		int youngidx=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<young){
				young = a[i];
				youngidx = i+1;
			}
		}
		return youngidx;
	}
	public static int tallest(int[] h){
		int tall = Integer.MIN_VALUE;
		int tallIdx=0;
		for(int i=0;i<h.length;i++){
			if(h[i]>tall){
				tall = h[i];
				tallIdx = i+1;
			}
		}
		return tallIdx;
	}
	
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
		int y = Eight.youngest(ages);
		int t = Eight.tallest(heights);
		
		System.out.println("Youngest of 3 friends is friend :" + y + " and Tallest of three friends is Friend :"+ t );
		sc.close();
	}
	
}