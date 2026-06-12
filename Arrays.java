import java.util.*;

class Arrays{

    public static void main( String args[]){
        // int[] marks = new int[3];
        int marks[] = {97,98,95};
        
        // marks[0]= 97;
        // marks[1]=87;
        // marks[2]=45;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for ( int i = 0 ; i < 3 ; i++){
            System.out.println(marks[i]);
        }
    }
}



import java.util.*;

class Arrays{

    public static void main( String args[]){
        
        Scanner sc= new Scanner ( System.in);
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("enter array numbers : ");

        for(int i = 0 ; i <n ; i++){
           numbers[i] = sc.nextInt();
        }
        System.out.println(" array numbers : ");

        for ( int i = 0 ; i < n ; i++){
            System.out.println(numbers[i]);
        }
    }
}



import java.util.*;

class Arrays{

    public static void main( String args[]){
        
        Scanner sc= new Scanner ( System.in);
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("enter array numbers : ");

        for(int i = 0 ; i <n ; i++){
           numbers[i] = sc.nextInt();
        }
        System.out.print("which u want to search : ");
        int x = sc.nextInt();

        for ( int i = 0 ; i < numbers.length ; i++){
            if( x == numbers[i])
            System.out.println("it is at "+i+" index");
        }
    }
}



import java.util.*;

class Arrays{

    public static void main( String args[]){
        
        Scanner sc= new Scanner ( System.in);
        int n = sc.nextInt();

        String name[] = new String[n];
        System.out.println("enter array names : ");

        for(int i = 0 ; i <n ; i++){
           name[i] = sc.next();
        }
        System.out.println("names are :  ");

        for ( int i = 0 ; i < n ; i++){
            System.out.println(name[i]);
        }
    }
}



import java.util.*;

class Arrays{

    public static void main( String args[]){
        
        Scanner sc= new Scanner ( System.in);
        int n = sc.nextInt();
        int flag = 1;

        int number[] = new int[n];
        System.out.println("enter array number : ");

        for(int i = 0 ; i <n ; i++){
           number[i] = sc.nextInt();
        }

        for ( int i = 0 ; i < n-1 ; i++){
            if( number [ i]< number[i+1]){
            flag = 1;
            }
            else{
                flag = 0;
            break;}
    }
if(flag == 1 ){
    System.out.println("ascending");
}
else
System.out.println("not ascending");
}}