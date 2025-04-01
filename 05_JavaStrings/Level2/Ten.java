import java.lang.Math;
import java.util.Scanner;

public class Ten {

    public static double[][] marksGen(int n) {
        double[][] marks = new double[n][3]; 
        for (int i = 0; i < n; i++) {
            marks[i][0]= Math.round((Math.random() * 100) * 100.0)/ 100.0; 
            marks[i][1]= Math.round((Math.random() * 100) * 100.0)/100.0; 
            marks[i][2]= Math.round((Math.random() * 100) * 100.0)/100.0; 
        }
        return marks;
    }

    public static double[][] total(double[][] marks) {
        double[][] calcs = new double[marks.length][3]; 
        for (int i = 0; i < marks.length; i++) {
            calcs[i][0]= marks[i][0] + marks[i][1] + marks[i][2]; 
            calcs[i][1]= Math.round((calcs[i][0] / 3)* 100.0) / 100.0; 
            calcs[i][2]= Math.round((calcs[i][0] *0.33) * 100.0) / 100.0; 
        }
        return calcs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.close();

        double[][] m = Ten.marksGen(n);
        double[][] c = Ten.total(m);

        System.out.println("Index | Physics | Chemistry | Maths | Total | Average | Percentage");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d | %.2f | %.2f | %.2f | %.2f | %.2f | %.2f%%\n",
                    (i + 1), m[i][0], m[i][1], m[i][2], c[i][0], c[i][1], c[i][2]);
        }
    }
}

