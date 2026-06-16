import java.util.*;

class Strings{
    public static void main(String args[]){

        String name= "piyush yadav";
        System.out.println(name);
    }
}



import java.util.*;

class Strings{
    public static void main(String args[]){
        Scanner sc  = new Scanner (System.in);
        System.out.print("your name : ");

        String name= sc.next();
        System.out.println("your name is : "+name);
    }
}





concatenation and charAt


import java.util.*;

class Strings{
    public static void main(String args[]){
        
        String firstName= "piyush";
        String lastName = "yadav";
        String fullName = firstName + lastName;
        
        System.out.println(fullName);
        System.out.println(fullName.length());

        //charAt

        for( int i = 0 ; i <fullName.length(); i++){
            System.out.print(fullName.charAt(i)+ " ");
        }

    }
}



compare


import java.util.*;

class Strings{
    public static void main(String args[]){
        
        String name1= "piyush";
        String name2 = "piyushh";

       //s1>s2 : positive alue
       // s1=s2 : 0
       // s1<s2 : neg value

        if((name1.compareTo(name2))==0){
            System.out.println("equal");
        }
        else
        System.out.println("unequal");

    }
}



substring

import java.util.*;

class Strings{
    public static void main(String args[]){
        
        String sentence = "my name is tony";

        //substring=(begin index , end index)   end index count ni hota uske phle wala hota h
                                                //agr 10 likha toh 9 index tk calculate hoga

        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}



import java.util.*;

class Strings{
    public static void main(String args[]){
        
        String sentence = "piyush yadav don";

        String name = sentence.substring(2 , 9);   //8 tk count hua
        System.out.println(name);
    }
}



import java.util.*;

class Strings{
    public static void main(String args[]){
        
        String sentence = "my name is tony";

        String name = sentence.substring(6);
        System.out.println(name);
    }
}



import java.util.*;

class Strings{
    public static void main(String args[]){
        Scanner sc  = new Scanner (System.in);
       int n = sc.nextInt();

     String[] name = new String[n];
     int totallength=0;

     for(int i = 0 ; i< n; i++){
        name[i] = sc.next();
        totallength= totallength + name[i].length();

     }
     System.out.println(totallength);
    }
}



import java.util.*;

class Strings{
    public static void main(String args[]){
        Scanner sc  = new Scanner (System.in);
       String original = sc.next();
       String result = "";

       for(int i = 0 ; i< original.length() ; i++){

         if( original.charAt(i) == 'e'){
            result = result + 'i';
         }
         else
         result = result + original.charAt(i);
       }
       System.out.println(result);
    }
}



import java.util.*;

class Strings{
    public static void main(String args[]){
       Scanner sc  = new Scanner (System.in);
       String original = sc.next();
       String result = "";

       for(int i = 0 ; i < original.length() ; i++){

         if( original.charAt(i) == '@'){
             break;
         }
         else
         result = result + original.charAt(i);
       }
       System.out.println(result);
    }
}