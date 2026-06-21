public class DecimalToBinary {


    public static String toBinary(int n) {


        String binary = "";


        while(n > 0) {


            int remainder = n % 2;


            binary = remainder + binary;


            n = n / 2;

        }


        // Padding to 32 bits (4 bytes)
        while(binary.length() < 32) {

            binary = "0" + binary;

        }


        return binary;

    }



    public static void main(String[] args) {


        int number = Integer.parseInt(args[0]);


        String result = toBinary(number);


        System.out.println("Binary representation = " + result);


    }

}