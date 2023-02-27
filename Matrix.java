import java.util.Scanner;

/**
 * Matrix
 */
public class Matrix { 

    public static boolean search(int matrix[][],int key) {
        for (int i = 0; i < matrix.length-1; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
              if(matrix[i][j]==key){
                System.out.println("("+i+","+j+")");
                return true;
              }
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int matrix[][]=new int[3][3];

        for (int i = 0; i < matrix.length-1; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < matrix.length-1; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
               System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
      
        search(matrix, 4);

    }
}