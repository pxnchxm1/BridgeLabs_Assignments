public class ProblemSeven{
	public static void main(String[] args){
		int radius = 6378 ;
		double cubicKm = ( 4 / 3 ) * 3.14 * radius *radius *radius ;
		double cubicMiles = cubicKm * 0.239913;
		System.out.println(String.format(" The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",cubicKm,cubicMiles));
	}
}

