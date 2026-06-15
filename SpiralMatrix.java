import java.util.*;

class SpiralMatrix{

    public static void main( String args[]){

        Scanner sc = new Scanner ( System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array= new int[n][m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<m ; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("your array is : ");

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Spiral array is : ");

        int rowstart = 0;
        int colstart=0;
        int rowend=n-1;
        int colend=m-1;

        while( rowstart <= rowend && colstart<= colend){

            //1
            for(int col = colstart ; col <= colend ; col++){
                System.out.print(array[rowstart][col]+" ");
            }
            rowstart++;

            //2
            for(int row = rowstart ; row <= rowend ; row++){
                System.out.print(array[row][colend]+ " ");
            }
            colend--;

            //3
            for(int col = colend ; col >= colstart ; col--){
                System.out.print(array[rowend][col]+" ");
            }
            rowend--;

            //4
            for(int row = rowend ; row >= rowstart ; row--){
                System.out.print(array[row][colstart]+ " ");
            }
            colstart++;

            System.out.println();
        }
    }
}