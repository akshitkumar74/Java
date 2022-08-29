import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int n = t.nextInt();
        int sum=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = t.nextInt();
        }
        t.close();
        System.out.println("Result");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            sum += a[i];        
        }
        System.out.println(sum);
    }
    
}
