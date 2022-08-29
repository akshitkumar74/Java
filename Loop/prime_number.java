import java.util.Scanner;

public class prime_number {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = t.nextInt();

        boolean flag = false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag = true;
            }
        }
        if (!flag){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }
    
}
