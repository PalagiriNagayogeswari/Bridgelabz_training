import java.util.Scanner;

public class Factors {



    public static boolean isPrime(int num) {


        if(num <= 1) {
            return false;
        }


        for(int i = 2; i < num; i++) {


            if(num % i == 0) {

                return false;

            }

        }


        return true;

    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number: ");
        int n = sc.nextInt();



        System.out.println("Prime factors are:");



        for(int i = 2; i <= n; i++) {



            if(isPrime(i)) {


                while(n % i == 0) {


                    System.out.print(i + " ");


                    n = n / i;

                }

            }

        }


    }

}