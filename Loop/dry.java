import java.util.Scanner;

public class dry {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();

        int c = 0;
        while(n!=0){
            n/=10;
            c++;
        }
        System.out.println(c);

    }
    
}
