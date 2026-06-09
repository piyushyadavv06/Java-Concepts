//for 

public class Loops{
    public static void main ( String args[]){

        for ( int counter = 0 ; counter <3 ; counter +=1){
            System.out.println("Hello World");
        }
    }
}


public class Loops{
    public static void main ( String args[]){

        for ( int counter = 0 ; counter <10 ; counter ++){
            System.out.println("number is : " + counter);
        }
    }
}


import java.util.*;

class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum = 0;
        for ( int i = 1 ; i <=n ; i++){
            sum = sum + i;
        }
        System.out.println("sum is : "+ sum);
    }
}


import java.util.*;

class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println(n*i);
        }
        
    }
}

//while loop

public class Loops{
    public static void main ( String args[]){
        int i = 0;
        while ( i < 11){
            System.out.println(i);
            i++;
        }
    }
}


//do while 


public class Loops{
    public static void main ( String args[]){
       int i = 0 ;

       do {
        System.out.println(i);
        i++;
       }
       while(i<11);
    }
}



public class Loops{
    public static void main ( String args[]){
       int i = 12 ;

       do {
        System.out.println(i);
        i++;
       }
       while(i<11);
    }
}

//homework 


import java.util.*;

public class Loops{
     public static void main ( String args[]){

        Scanner sc = new Scanner ( System.in);
        System.out.print("enter 1 or 0 : ");
        int i = sc.nextInt();
        do {
            
            System.out.print("enter marks : ");
            int marks = sc.nextInt();
            if(marks >= 90)
            System.out.println("this is good");
            else if ( 89>= marks && marks >= 60)
            System.out.println("this is also good");
            else if (59>= marks && marks >= 0)
            System.out.println("this is good as well cozmarks dont matter");

            System.out.print("enter 1 or 0 : ");
            i = sc.nextInt();

        } while(i!=0 );
        
             }}