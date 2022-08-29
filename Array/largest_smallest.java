import java.util.Scanner;
public class largest_smallest {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = t.nextInt();
        int [] a = new int[n];
        int large,small;
        for(int i=0;i<n;i++){
            a[i]=t.nextInt();
        }
        large=a[0];
        for(int i=0;i<a.length;i++){
            if(large<a[i]){
                large=a[i];
            }
        }
        System.out.println("\nthe largest element of an array : "+large);
        small=a[0];
    
        for (int i=0;i<a.length;i++){
        if(small>a[i])
        {
            small=a[i];
        }
        }
        System.out.println("\nthe smallest element of an array : "+small);
    }
    
}
