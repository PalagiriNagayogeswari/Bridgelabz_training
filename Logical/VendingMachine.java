import java.util.Scanner;

public class VendingMachine {


    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};


    static int count = 0;


    public static void calculateNotes(int amount, int index) {



        if(amount == 0) {
            return;
        }



        if(amount >= notes[index]) {


            int noteCount = amount / notes[index];


            count = count + noteCount;


            System.out.println(notes[index] + " Rs Notes : " + noteCount);


            amount = amount % notes[index];

        }



        if(index < notes.length - 1) {

            calculateNotes(amount, index + 1);

        }

    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter change amount: ");
        int amount = sc.nextInt();


        calculateNotes(amount, 0);


        System.out.println("Minimum number of notes required = " + count);


        sc.close();

    }

}