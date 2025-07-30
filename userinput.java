import java.util.Scanner;

public class userinput{
   
    public static void main(String[] args) {

        Scanner Sc= new Scanner(System.in);  //to read input
        System.out.println("Enter a Nummber:");
        int number=Sc.nextInt();// take input from user
        System.out.println(number );
    }
}