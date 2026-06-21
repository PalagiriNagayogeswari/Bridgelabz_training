import java.util.Scanner;

public class PowerOfTwo {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter power value: ");
        int n = sc.nextInt();



        if(n < 0 || n >= 31) {

            System.out.println("Enter value between 0 and 30");
            return;

        }



        for(int i = 0; i <= n; i++) {


            int power = (int)Math.pow(2, i);


            System.out.println("2^" + i + " = " + power);


        }




    }

}