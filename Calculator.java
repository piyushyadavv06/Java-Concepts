import java.util.*;

class Calculator {
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter choice : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : int sum = a+b;
            System.out.println(sum);
            break;

            case 2 : int diff = a - b ;
            System.out.println(diff);
            break;

            case 3 : int mul = a*b;
            System.out.println(mul);
            break;

            case 4 : if(b==0)
            System.out.println("Invalid ans ");
            else{
            int div = a/b;
            System.out.println(div);
            }
            break;

            case 5 : if(b==0)
            System.out.println("Invalid ans ");
            else{
            int mod = a%b;
            System.out.println(mod);
            }
            break;
        }
    }
}