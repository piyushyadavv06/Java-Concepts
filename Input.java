import java.util.*;

class Input{

    public static void main(String args[]){

        Scanner sc = new Scanner ( System.in);
        String name = sc.next();    //puri line ke liye sc.nextLine()
        System.out.print(name);
    }
}


import java.util.*;

class Input{

    public static void main(String args[]){

        Scanner sc = new Scanner ( System.in);
        String name = sc.nextLine();   
        System.out.print(name);
    }
}


import java.util.*;

class Input{

    public static void main( String args[]){

        int a ;
        int b;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of a : ");
        a = sc.nextInt();
        System.out.print("enter value of b : ");
        b = sc.nextInt();
      int sum = a+b;
      System.out.print("sum is : ");
      System.out.print(sum);
    }
}


//area of circle

import java.util.*;

class Input{
public static void main( String args[]){

    float radius;
    double area;
   
   Scanner sc = new Scanner ( System.in );

   radius = sc.nextFloat();

   area = 3.14*(radius)*(radius);

   System.out.print("area is : ");
   System.out.print(area);
}
}


// table printing

import java.util.*;

class Input{
public static void main( String args[]){
   
   Scanner sc = new Scanner ( System.in );

   int n = sc.nextInt();
   System.out.println("Table is as follows : ");
   System.out.println(n*1);
   System.out.println(n*2);
   System.out.println(n*3);
   System.out.println(n*4);
   System.out.println(n*5);
   System.out.println(n*6);
   System.out.println(n*7);
   System.out.println(n*8);
   System.out.println(n*9);
   System.out.println(n*10);
}
}



