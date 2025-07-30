import java.util.Scanner;

public class usingscanner{
   
    public static void main(String[] args) {

        Scanner Sc= new Scanner(System.in);  //to read input
        System.out.println("Enter your name:");
        String name =Sc.nextLine();// take input from user

         System.out.println("Enter your address:");
        String address =Sc.nextLine();// take input from user

         System.out.println("Enter your Mobile number:");
        String number=Sc.nextLine();// take input from user

         System.out.println("Enter your percentage:");
        String percentage=Sc.nextLine();// take input from user

        System.out.println( name);
             System.out.println(address);
                  System.out.println(number);
                       System.out.println(percentage);
    }
}