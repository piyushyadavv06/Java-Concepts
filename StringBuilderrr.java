import java.util.*;

class StringBuilderrr{
    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);

        //char at index
        System.out.println(sb.charAt(3));

        //set char at index (change)
        sb.setCharAt(1, 'a');
        System.out.println(sb);

        //inserting
        sb.insert(1 , "hello");
        System.out.println(sb);

        //deletion
        sb.delete(1,6);        //ending index is non considered , pichla wala will be considered;
        System.out.println(sb);

        //append (last mein jodna)
        sb.append(" star");
        System.out.println(sb);
        
        sb.append("k");
        System.out.println(sb);

    }
}




//REVERSE STRING 

import java.util.*;

class StringBuilderrr{
    public static void main(String args[]){

   StringBuilder sb = new StringBuilder("piyush");

   for(int i = 0 ; i < sb.length()/2 ;   i++){
    int front = i;
    int back = sb.length() -1 -i;

    char FrontChar = sb.charAt(front);
    char BackChar = sb.charAt(back);

    sb.setCharAt(front , BackChar);
    sb.setCharAt(back , FrontChar); 
   }
   System.out.println(sb);
   
    }
}