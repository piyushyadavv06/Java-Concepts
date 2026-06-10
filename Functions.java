public class Functions {
   //A METHOD to calculate sum of 2 numbers - a & b
   public static void sum(int a, int b) {
       int sum = a + b;
       System.out.println(sum);
   }
  
   public static void main(String[] args) {
      int a = 10;
      int b = 20;
       sum(a, b); // Function Call

   }
}



import java.util.*;

public class Functions {
   //Multiply 2 numbers
   public static int multiply(int a, int b) {
       return a*b;
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();


       int result = multiply(a, b);
       System.out.println(result);
   }
}



​​import java.util.*;

public class Functions {
  
   public static void printFactorial(int n) {
       //loop
       if(n < 0) {
           System.out.println("Invalid Number");
           return;
       }
       int factorial = 1;
       for(int i=n; i>=1; i--) {
           factorial = factorial * i;
       }
       System.out.println(factorial);
       return;
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       printFactorial(n);
   }
}



import java.util.*;

class Functions{

    public static void main( String args[]){

        Scanner sc = new Scanner ( System.in);

        System.out.print("how many number you want to enter : ");
        int n = sc.nextInt();

        int pos_sum = 0;
        int neg_sum=0;
        int zero_sum=0;

        for(int i = 1 ; i <=n ; i++){
            System.out.print("enter number : ");
            int a = sc.nextInt();
            if( a > 0)
            pos_sum=pos_sum+1;
            else if(a<0)
            neg_sum= neg_sum+1;
            else
            zero_sum=zero_sum+1;

        }
        System.out.println("pos : " + pos_sum);
        System.out.println("neg : " + neg_sum);
        System.out.println("zero : " + zero_sum);
    }
}
