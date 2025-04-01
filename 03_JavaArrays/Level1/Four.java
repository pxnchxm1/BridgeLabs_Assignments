import java.util.Scanner;
public class Four{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		double arr[] = new double[10];
		int idx=0;
		while(true){
			
			System.out.print("\n Enter a number : ");
			double num = sc.nextDouble();
			if(num==0 || idx ==  9){
				arr[idx] = num;
				break;
			}else{
				arr[idx] = num ;
				idx++;
			}
			
		}
		for(int i = 0; i<idx+1;i++){
			System.out.println("element " + (i+1) + " is " + arr[i]);
			total+=arr[i];
		}
		System.out.println(" Total sum of the array elements is " + total);
		
		sc.close();
	}
}