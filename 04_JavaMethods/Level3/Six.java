import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Six{
	public static int[] factors(int n){
		int c=0;
		for(int i = 1;i<=n;i++){
			if(n%i==0){
				c++;
			}
		}
		int[] factors = new int[c];
		int idx=0;
		for(int i = 1; i<=n; i++){
			if(idx==c) break;
			if( n%i == 0 ){
				factors[idx]=i ;
				idx++;
			}
		}
		return factors;
		
	}
	public static int greatestFact(int[] factors){
		return factors[factors.length-1];
	}
	public static int sumOfFact(int[] factors){
		int f=0;
		for(int i=0;i<factors.length;i++){
			f += factors[i];
		}
		return f;
	}
	public static int productOfFact(int[] factors){
		int f=1;
		for(int i=0;i<factors.length;i++){
			f *= factors[i];
		}
		return f;
	}
	public static int cubeProductOfFact(int[] factors){
		int f=1;
		for(int i=0;i<factors.length;i++){
			f *= Math.pow(factors[i],3);
		}
		return f;
	}
	public static boolean isPerfect(int[] factors,int number){
		if(Six.sumOfFact(factors)==number){
			return true;
		}
		return false;
	}
	public static boolean isAbundant(int[] factors,int number){
		if(Six.sumOfFact(factors)>number){
			return true;
		}
		return false;
	}
	public static boolean isDeficient(int[] factors,int number){
		if(Six.sumOfFact(factors)<number){
			return true;
		}
		return false;
	}
	public static int factorial(int n){
		if(n==0){
			return 1;
		}else{
			return (n * Six.factorial(n-1));
		}
	}
	public static boolean isStrong(int[] factors,int num){
		int s = 0;
		for(int i=0;i<factors.length;i++){
			s += Six.factorial(factors[i]);
		}
		return s==num;
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : " );
	    int num = sc.nextInt();
		int[] factorArray = Six.factors(num);
		System.out.println("FACTOR ARRAY : " + Arrays.toString(factorArray)); 
		System.out.println("greatest factor : " + Six.greatestFact(factorArray));
		System.out.println("Sum :"+ Six.sumOfFact(factorArray));
		System.out.println("Product :"+ Six.productOfFact(factorArray));
		System.out.println("Product of cube of factors  :"+ Six.cubeProductOfFact(factorArray));
		System.out.println("Perfect number ? " + Six.isPerfect(factorArray,num));
		System.out.println("Abundant number ? " + Six.isAbundant(factorArray,num));
		System.out.println("Deficient number ? " + Six.isDeficient(factorArray,num));
		System.out.println("Strong number ? " + Six.isStrong(factorArray,num));
	}
	
}