import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
import java.util.HashSet;;
public class Seven{
	
	//generate otp
	public static int generateOTP(){
		return (int)(Math.random()*900000 + 100000);
	}
	
	//generate array of 10 otp
	public static int[] generateOTPArray(){
		int[] arr = new int[10];
		for(int i=0;i<10;i++){
			arr[i] = Seven.generateOTP();
		}
		return arr;
	}
	
	//validate unique or not
	public static boolean validate(int[] otpArray){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i:otpArray){
			if(!set.add(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		int[] otpArray = Seven.generateOTPArray();
		System.out.println("OTP ARRAY IS : "+ Arrays.toString(otpArray));
		System.out.println("IS UNIQUE : "+ Seven.validate(otpArray));
		
	}
	
}