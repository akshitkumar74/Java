import java.util.Scanner;

public class factor {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        int sum = 1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        System.out.println(sum);
    }
    
}
