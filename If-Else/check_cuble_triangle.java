import java.util.Scanner;

public class check_cuble_triangle {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the area : ");
        int n = t.nextInt();
        int a;
        a = n*n*n;
        if (a<=0){
            System.out.println("This is not atriangle");
        }
        else{
            System.out.println("This is a triangle");
        }
    }
    
}
