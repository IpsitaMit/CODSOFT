import java.lang.*;
import java.util.*;

class gradeGenerater {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter studeny's Name : ");
        String name = sc.nextLine();
        double arr[] = input();
        double sum = summation(arr);
        double avg = avarage(sum, arr.length);
        char gr = grade(avg);

        System.out.println(
                "Name : " + name + "\nTotal Marks : " + sum + "\tAverage Percentage : " + avg + "\tGrade :" + gr);
    }

    public static double[] input() {
        System.out.println("Enter the number of subjects : ");
        int n = sc.nextInt();
        double arr[] = new double[n];
        System.out.println("Enter the marks of each subject out of 100 : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + " : ");
            arr[i] = sc.nextDouble();
            if (arr[i] > 100.0 || arr[i] < 0.0) {
                i -= 1;
                System.out.println("Please, enter proper grade : ");
            }
        }
        return arr;
    }

    public static double summation(double arr[]) {
        double sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double avarage(double sum, int n) {
        return sum / n;
    }

    public static char grade(double avg) {
        char gr = '\u0000';
        if ((int) (avg / 10) + 1 <= 4) {
            gr = 'F';
        } else {
            char arr[] = { 'D', 'C', 'B', 'A', 'E', 'O' };
            gr = arr[(int) (avg / 10) - 4];
        }
        return gr;
    }

}