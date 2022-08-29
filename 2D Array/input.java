import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the range for 1: ");
        int n = t.nextInt();
        System.out.print("Enter the range for 2: ");
        int v = t.nextInt();
        int[][] a = new int [n][v];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<v;j++){
                a[i][j] = t.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<v;i++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
