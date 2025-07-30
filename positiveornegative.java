import java.util.Scanner;
public class positiveornegative{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a =Sc.nextInt();
        if(a>=0){
            System.out.println(a +" is positive number.");
        }
        else{
                        System.out.println(a +" is negative number.");

        }
    }
    
}