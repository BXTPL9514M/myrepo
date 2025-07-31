import java.util.Scanner;
 public class nestedif{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the maths marks");
        int marks=sc.nextInt();
        System.out.println("enter the ss marks");
        int ss=sc.nextInt();
        System.out.println("enter the science marks");
        int sci=sc.nextInt();
        int sum=marks+ss+sci;
        double per=(sum*100)/300;
        System.out.println("this is you percentage" +per);
        if (per>35)
        {

            if(per>75)
            {

                System.out.println("pass with good marks");
            }
            else{

                System.out.println("pass");
            }
        }

        else{

            System.out.println("fail");
        }
    }
 }