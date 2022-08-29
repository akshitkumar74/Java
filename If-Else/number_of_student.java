import java.util.Scanner;

public class number_of_student {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Number of classes held : ");
        float h = s.nextFloat();
        System.out.print("Number of classes attended : ");
        float a = s.nextFloat();
        float p;
        p = a/(h/100);
        System.out.println("percentage of class attended : " + (a/(h/100))+"%");

        if (p<=75){
            System.out.println("You are not able to attemp the exam\nBecause you are attendence are below 75%");

        }
        else{
            System.out.println("You are able to attemp the exam");
        }

    } 
    
}
