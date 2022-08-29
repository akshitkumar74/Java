import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = t.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
