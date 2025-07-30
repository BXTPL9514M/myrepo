import java.util.Scanner;

public class oddeven{
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter a number to know if it's  odd or even: ");
        int a = Sc.nextInt();
        if(a%2==0){
            System.out.println(a + "is an even number.");
        }
        else{
                        System.out.println(a + "is an odd number.");

        }
    }
}