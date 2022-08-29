import java.util.Scanner;

public class sum_of_negative {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = t.nextInt();
        int[] a = new int[n];
        int i,neg=0;
        for(i=0;i<n;i++){
            a[i] = t.nextInt();
        }
        for(i=0;i<a.length;i++){
            if(a[i]<0){
                System.out.println(a[i]);
                neg += a[i];
            }
        }
        System.out.print("the negative sum : "+neg);
    }
    
}
