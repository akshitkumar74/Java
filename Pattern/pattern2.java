import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = t.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
