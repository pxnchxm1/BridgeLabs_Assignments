
import java.lang.Math;
public class Eleven{
	
	public static int[][] salaryYears(){
		int[][] sy = new int[10][2];
		for(int i=0;i<10;i++){
			  sy[i][0] = (int) (Math.random() * 90000) + 10000; 
            sy[i][1] = (int) (Math.random() * 50) + 1;     
		}
		return sy;
	}
	public static int[][] newSalAndBonus(int[][] oldsalaryAndYears){
		int[][] nb = new int[10][2];
		for(int i=0;i<10;i++){
			nb[i][1] = oldsalaryAndYears[i][1]>5 ? (int)(oldsalaryAndYears[i][0]*0.05) : (int)(oldsalaryAndYears[i][0]*0.02) ;
			nb[i][0] = oldsalaryAndYears[i][0] + nb[i][1];
		}
		return nb;
	}
	public static int[] calcTotals(int[][] old,int[][] newarr){
		int[] ans = {0,0,0};
		for(int i=0;i<10;i++){
			ans[0]+=old[i][0];
			ans[1] += newarr[i][1];
			ans[2] += newarr[i][0];
		}
		return ans;
	}
	public static void main(String[] args){
		int[][] o = Eleven.salaryYears();
		int[][] n = Eleven.newSalAndBonus(o);
		System.out.println("index -- old salary -- years -- new salary -- bonus");
		for(int i=0;i<10;i++){
			System.out.println(i+1 + "--"+ o[i][0]+"--"+o[i][1]+"--"+n[i][0]+"--"+n[i][1]);
		}
		int[] ans = Eleven.calcTotals(o,n);
		System.out.println("Total bonus : " + ans[2] + "\n Total old salary : " + ans[0] + "\n Total new Salary : "+ ans[1]);
		
	}
	
}