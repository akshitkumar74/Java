import java.util.Scanner;

public class sunday_saturaday {
        public static void main(String[] args)
        {
            Scanner n = new Scanner(System.in);
            System.out.print("Enter the week number : ");
            int days= n.nextInt();

            switch (days) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
            }
        }
}
 