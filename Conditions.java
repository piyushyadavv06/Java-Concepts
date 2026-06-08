import java.util.*;

public class Conditions{ 
    public static void main(String args[]){
       Scanner sc = new Scanner ( System.in );
       int age = sc.nextInt();
       if(age>18){
        System.out.println("Bda hogaya tu");
       }
       else
       { System.out.println("kid h tu abhi ");
       }
       
    }
}



import java.util.*;

public class Conditions{ 
    public static void main(String args[]){
       Scanner sc = new Scanner ( System.in );
       int n = sc.nextInt();

       if ( n % 2 ==0 ){
        System.out.println("even");
       }
       else
       System.out.println("odd");
       }}



import java.util.*;

public class Conditions{ 
    public static void main(String args[]){
       Scanner sc = new Scanner ( System.in );
       int a = sc.nextInt();
       int b = sc.nextInt();

       if ( a==b ){
        System.out.println("equal");
       }
       else if ( a > b){
        System.out.println("a is greater");
       }
       else{
        System.out.println("a is smaller");
       }
       }}