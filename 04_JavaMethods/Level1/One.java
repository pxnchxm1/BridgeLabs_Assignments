import java.util.Scanner ;
public class One{
	public double simpleInterest(double p,double r, int t){
		double si = ((p * r * t) / 100 ) ;
		return si;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle : ");
		double principle = sc.nextDouble();
		System.out.println("Enter rate of interest : ");
		double rate = sc.nextDouble();
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		One one = new One();
		System.out.println("Simple interest is : " + one.simpleInterest(principle,rate,year));
	}
}