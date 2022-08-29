import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the number whose you have factorial : ");
        int n = t.nextInt();

        int fact = 1;
        for(int i =1;i<=n;i++){
            fact *= i;
        }
        System.out.println("factorial: "+fact);
    }
    
}
