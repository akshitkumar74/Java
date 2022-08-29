import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = t.nextInt();

        int rem,i=0,temp;
        temp = n;

        while(n>0){
            rem = n%10;
            i = rem*rem*rem+i;
            n /= 10;
        }
        if(temp==i){
            System.out.println("Number is an armstrong");
    }
    else{
        System.out.println("Number is not an armstrong");
    }
    
}
}
