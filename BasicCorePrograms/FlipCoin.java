import java.util.Scanner;

public class FlipCoin {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of flips: ");
        int n = sc.nextInt();


        if(n <= 0) {

            System.out.println("Enter positive number");
            return;

        }


        int heads = 0;
        int tails = 0;



        for(int i = 0; i < n; i++) {


            double random = Math.random();


            if(random < 0.5) {

                tails++;

            }
            else {

                heads++;

            }

        }


        double headPercentage = (heads * 100.0) / n;

        double tailPercentage = (tails * 100.0) / n;



        System.out.println("Heads count = " + heads);
        System.out.println("Tails count = " + tails);


        System.out.println("Heads Percentage = "
                + headPercentage + "%");


        System.out.println("Tails Percentage = "
                + tailPercentage + "%");




    }

}