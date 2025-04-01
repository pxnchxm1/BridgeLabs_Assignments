import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class One{
	public  int[] generate3DigitRandomArray(int size){
		int[] num = new int[size];
		for(int i=0;i<size;i++){
			num[i]=(int) (Math.random()*100 + 150 );
		}
		return num;
		
	}
	public double[] meanMaxMin(int[] num){
		double[] res = new double[3];
		res[0] = num[0];
		res[1]= num[0];
		res[2]=num[0];
		for(int i=1;i<num.length;i++){
			res[0] = Math.min(res[0],num[i]);
			res[1] = Math.max(res[0],num[i]);
			res[2]+=num[i];
		}
		res[2] /= num.length;
		return res;
	}
	public static void main(String[] args){
		One one = new One();
		int[] heights = one.generate3DigitRandomArray(11);
		System.out.println(Arrays.toString(heights));
		double[] ans = one.meanMaxMin(heights);
		System.out.println("Mean : "+ ans[2]+" Shortest : " + ans[0] +"Tallest : "+ans[1]);
		
	}
	
}