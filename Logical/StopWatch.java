import java.util.Scanner;

public class StopWatch {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Press Enter to start stopwatch");

        sc.nextLine();


        long startTime = System.currentTimeMillis();


        System.out.println("Stopwatch started...");


        System.out.println("Press Enter to stop stopwatch");

        sc.nextLine();


        long endTime = System.currentTimeMillis();



        long elapsedTime = endTime - startTime;



        System.out.println("Elapsed time in milliseconds: "
                + elapsedTime);


        System.out.println("Elapsed time in seconds: "
                + elapsedTime / 1000);



        sc.close();

    }
}