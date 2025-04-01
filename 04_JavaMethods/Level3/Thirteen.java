import java.lang.Math;
import java.util.Scanner;

public class Thirteen {

    public static int[][] generateMatrix(int r,int c) {
		int[][] m = new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				m[i][j] = (int) (Math.random() * 20) + 1;
			}
		}
		return m;
        
    }
	public static void displayMat(int[][] m){
		
		for(int i=0;i < m.length;i++){
			for(int j=0;j < m[0].length;j++){
				System.out.print(m[i][j]+ "   ");
			}
			System.out.println();
		}
		
	}
	public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
	public static int[][] subMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
    
	public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
	
	public static int[][] transposeMatrix(int[][] a) {
        
        int[][] result = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }
	
	
    public static int determinant2(int[][] a) {
		int ans = (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
        return ans;
    }

    public static int determinant3(int[][] a) {
		int ans = a[0][0] * (a[1][1] * a[2][2] - a[1][2] * a[2][1])- a[0][1] * (a[1][0] * a[2][2] - a[1][2] * a[2][0])+ a[0][2] * (a[1][0] * a[2][1] - a[1][1] * a[2][0]);
        return ans;
    }


    public static int[][] inverse2(int[][] a) {
        int det = determinant2(a);
        if (det == 0) {
            System.err.print("Matrix is singular, no inverse.");
			return null;
        }
		int[][] inv = new int[2][2];
        inv[0][0] = (int) (a[1][1] / (double) det);
        inv[0][1] = (int) (-a[0][1] / (double) det);
        inv[1][0] = (int)(-a[1][0] / (double) det);
        inv[1][1] = (int)(a[0][0] / (double) det);
        return inv;
		
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
		System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        sc.close();
		
		int[][] m1 = Thirteen.generateMatrix(r,c);
        System.out.println("The matrix is : \n ");
		Thirteen.displayMat(m1);
		
		int[][] m2 = Thirteen.generateMatrix(r,c);
		System.out.println("The matrix2 is : \n ");
		Thirteen.displayMat(m2);
		
		int[][] addedmatrix = Thirteen.addMatrices(m1,m2);
		System.out.println("The matrix addition is : \n ");
		Thirteen.displayMat(addedmatrix);
		
		int[][] submatrix = Thirteen.subMatrices(m1,m2);
		System.out.println("The matrix subtraction is : \n ");
		Thirteen.displayMat(submatrix);
		
		int[][] mul = Thirteen.multiplyMatrices(m1,m2);
		System.out.println("The matrix multiplication is : \n ");
		Thirteen.displayMat(mul);
		
		int[][] trans = Thirteen.transposeMatrix(m1);
		System.out.println("The matrix transpose is : \n ");
		Thirteen.displayMat(trans);
		
		
		int[][] m3 = Thirteen.generateMatrix(2,2);
		System.out.println("The 2*2 : \n "); 
		Thirteen.displayMat(m3);
		
		int det2 = Thirteen.determinant2(m3);
		System.out.println("The matrix determinant2 is : \n " + det2);
		
		int[][] inv = Thirteen.inverse2(m3);
		System.out.println("The matrix inverse(2*2) is : \n ");
		Thirteen.displayMat(inv);
		
		int[][] m4 = Thirteen.generateMatrix(3,3);
		System.out.println("The 3*3 : \n "); 
		Thirteen.displayMat(m4);
		
		
		int det3 = Thirteen.determinant2(m4);
		System.out.println("The matrix determinant2 is : \n " + det3);
		
        
    }
}
