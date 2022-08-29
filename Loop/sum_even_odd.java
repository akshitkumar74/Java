import java.util.Scanner;

public class sum_even_odd {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int n = t.nextInt();
        
        int sum_odd = 0;
        int sum_even = 0;
        for(int i =0; i<=n ; i++){
            System.out.print("Enter the value : ");
            int v = t.nextInt();
        if (v%2 == 0){
            sum_even += v;
        }
        else{
            sum_odd += v;
        }
        }

        System.out.println("Sum Of even number : "+sum_even);
        System.out.println("Sum Of odd number : "+sum_odd);
    }
    
}
