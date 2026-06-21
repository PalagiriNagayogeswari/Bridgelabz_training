import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class TwoDArray {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        PrintWriter out = new PrintWriter(
                new OutputStreamWriter(System.out)
        );


        System.out.print("Enter rows: ");
        int m = sc.nextInt();


        System.out.print("Enter columns: ");
        int n = sc.nextInt();



        int[][] array = new int[m][n];



        System.out.println("Enter array elements:");

        for(int i = 0; i < m; i++) {


            for(int j = 0; j < n; j++) {


                array[i][j] = sc.nextInt();

            }

        }



        out.println("2D Array:");

        for(int i = 0; i < m; i++) {


            for(int j = 0; j < n; j++) {


                out.print(array[i][j] + " ");

            }


            out.println();

        }



        out.flush();

    }

}