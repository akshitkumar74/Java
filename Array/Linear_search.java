import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = t.nextInt();
        int[] a = new int[n];
        int i;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++){
            a[i] = t.nextInt();
        }
        System.out.print("Elements would u have search : ");
        int v = t.nextInt();

        for(i=0;i<a.length;i++)
        {
            if(a[i]==v){
                break;
            }
        }

        if(i<n)
        System.out.print("Element found at index "+i);
        else
        System.out.print("Element not found");
    }
    
}
