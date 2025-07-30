public class operator{
    public static void main(String[] args) {
        int a=10, b=20,c=10,d=20 ;

        //arthmetic operators
        System.out.println("A+B: " + (a+b));
         System.out.println("A-B: " + (a-b));
          System.out.println("A*B: " + (a*b));
           System.out.println("A/B: " + (a/b));

           //relational operator
            System.out.println("A==B: " + (a==b));
             System.out.println("A!=B: " + (a!=b));
              System.out.println("A<=B: " + (a<=b));
               System.out.println("A>=B: " + (a>=b));
                System.out.println("A<B: " + (a<b));
                 System.out.println("A>B: " + (a>b));

                 //assignment operator
                  System.out.println("A+=A: " + (a+=a));
                   System.out.println("A-=A: " + (a-=a));
                    System.out.println("A*=A: " + (a*=a));
                     System.out.println("B/=B: " + (b/=b));

                     //logical operator
                    
                     //AND operator
                      System.out.println(c>=10 && d>=10 );

                      //or operator
                       System.out.println(c>=10 || d>=30);

    }
}