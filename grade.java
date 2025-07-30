import java.util.Scanner;

public class grade{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Cotlin marks: ");
        int cotlin=Sc.nextInt();

          System.out.println("Enter Java marks: ");
        int java=Sc.nextInt();

          System.out.println("Enter Rust marks: ");
        int rust=Sc.nextInt();
        int total=rust+java+cotlin;
        int percentage=total*100/300;
        System.out.println("Your percentage is: " + percentage);
        if(percentage>=75){
            System.out.println("You Got Distinction.");
        }
        else if(percentage <=60){
                        System.out.println("You Got First Class.");
        }
        else if(percentage <=35){
                        System.out.println("You Got Second Class.");
        }
        else{
                        System.out.println("Fail.");
        }
    }
}