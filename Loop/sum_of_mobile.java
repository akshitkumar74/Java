import java.util.Scanner;

public class sum_of_mobile {
    public static void main (String[] args){
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int sum = 0;
        for(int i=0;i<10;i++){
            int n = t.nextInt();

            sum += n;
            
        }
        System.out.println(sum);
    }
    
}
