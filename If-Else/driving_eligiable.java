import java.util.Scanner;

public class driving_eligiable {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = num.nextInt();

        if (age>=18){
            System.out.println("You're eligible for Driving");
        }
        else{
            System.out.println("You're not eligible for Driving");
        }

    }
    
}
