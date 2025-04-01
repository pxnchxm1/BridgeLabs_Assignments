import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Twelve{
	public  int[] generate4DigitRandomArray(int size){
		int[] num = new int[size];
		for(int i=0;i<size;i++){
			num[i]=(int) (Math.random()*9000 + 1000);
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
		Twelve twelve = new Twelve();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] array = twelve.generate4DigitRandomArray(n);
		System.out.println(Arrays.toString(array));
		double[] ans = twelve.meanMaxMin(array);
		System.out.println("Mean : "+ ans[2]+" Minimum : " + ans[0] +"Maximum : "+ans[1]);
		sc.close();
	}
	
}