import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class One{
	public static int countLength(int n){
		int c = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0)c++;
		}
		return c;
	}
	public int[] factArr(int c,int n){
		int[] factors = new int[c];
		int idx=0;
		for(int i=1;i<=n;i++){
			if(idx==c)break;
			if(n%i==0){
				factors[idx] = i ;
				idx++;
			}
		}
		return factors;
	}
	public double[] sumSquareProduct(int[] factors,int c){
		double[] res = {0.0,0.0,1.0};
		for(int i=0;i<factors.length;i++){
			res[0] += factors[i];
			res[1]  += Math.pow(factors[i],2);
			res[2]  *= factors[i];
		}
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int count = One.countLength(num);
		One one = new One();
		int[] factorArray = one.factArr(count,num);
		double[] result = one.sumSquareProduct(factorArray,count);
		System.out.println("The factor array is : " + Arrays.toString(factorArray));
		System.out.println(String.format("Sum : %.2f ........ SquareSum : %.2f ....... Product : %.2f",result[0],result[1],result[2]));
		
	}
}