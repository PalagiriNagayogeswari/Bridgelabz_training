import java.util.Scanner;

public class Binary {



    public static String toBinary(int n) {

        String binary = "";


        while(n > 0) {

            int remainder = n % 2;

            binary = remainder + binary;

            n = n / 2;
        }



        while(binary.length() < 8) {

            binary = "0" + binary;

        }


        return binary;
    }




    public static int swapNibbles(int num) {


        int swapped = ((num & 0x0F) << 4) |
                ((num & 0xF0) >> 4);


        return swapped;

    }



 
    public static boolean isPowerOfTwo(int num) {


        if(num <= 0) {

            return false;

        }


        return (num & (num - 1)) == 0;

    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number: ");
        int num = sc.nextInt();



        System.out.println("Binary representation: "
                + toBinary(num));



        int result = swapNibbles(num);



        System.out.println("After swapping nibbles:");

        System.out.println(toBinary(result));


        System.out.println("New decimal number: "
                + result);



        if(isPowerOfTwo(result)) {

            System.out.println(result +
                    " is a power of 2");

        }
        else {

            System.out.println(result +
                    " is not a power of 2");

        }


        sc.close();

    }

}