import java.util.Scanner;

public class average_marks {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the subjects : ");
        int n = t.nextInt();
        int[] a = new int[n];
        int average=0,sum=0;
        System.out.println("Enter the marks");
        for(int i=0;i<n;i++){
            a[i] = t.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println("Sum of the marks : "+sum);
        System.out.print("Average of the marks : "+sum/n);

    }
    
}
