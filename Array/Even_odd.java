import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int n = t.nextInt();
        int[] a = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i] = t.nextInt();
        }
        System.out.println("Even number");
        for(i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd number");
        for(i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
    }  
    
}
