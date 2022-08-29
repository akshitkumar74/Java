import java.util.Scanner;

public class Another_array_copy_from_other {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = t.nextInt();
        int[] a= new int[n];
        int[] b= new int[n];
        int i;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i] = t.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println("Copied Elements");
        for(i=0;i<a.length;i++)
        {
            System.out.println("The inside "+i+" elements "+b[i]);
        }
    }
    
}
