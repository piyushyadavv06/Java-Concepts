import java.util.*;

class PrimeNumber{
    public static void main( String args[]){

        Scanner sc = new Scanner ( System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();
        int prime = 1;

        for ( int i = 2 ; i <= n/2 ; i++){

            if ( n % i == 0 ){
                prime = 0;
                break;
            } 
        }

        if(prime == 1){
            System.out.println("Prime number ");
        }
        else
        System.out.println("Not Prime number");

    }
}