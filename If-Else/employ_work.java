import java.util.Scanner;

public class employ_work {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        float salary = s.nextInt();
        System.out.print("Enter your year of service : ");
        float year = s.nextInt();

        if (year>=5){
            System.out.println("Your bonus : "+(0.05*salary));
            System.out.println("Your Salary of this month add with bonus : "+(salary+(0.05*salary)));
        }
        else{
            System.out.println("Your salary : "+(salary));
        }

    }
    
}
