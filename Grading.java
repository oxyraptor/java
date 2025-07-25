import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of grades to be entered: ");
        int numGrades = sc.nextInt();
        
        Avg(sc, numGrades);
        
        sc.close();
    }
    
    public static void Avg(Scanner sc, int numGrades) {
        double[] grades = new double[numGrades];
        double sum = 0;
        
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }
        
        double average = sum / numGrades;
        System.out.println("The average grade is: " + average);
    }
}