public class TempConv {


    public static double temperatureConversion(double temp, char type) {


        if(type == 'C' || type == 'c') {

            // Celsius to Fahrenheit
            double fahrenheit = (temp * 9 / 5) + 32;

            return fahrenheit;

        }


        else if(type == 'F' || type == 'f') {

            // Fahrenheit to Celsius
            double celsius = (temp - 32) * 5 / 9;

            return celsius;

        }


        else {

            System.out.println("Invalid conversion type");
            return -1;

        }

    }



    public static void main(String[] args) {


        double temperature = Double.parseDouble(args[0]);

        char type = args[1].charAt(0);


        double result = temperatureConversion(temperature, type);


        System.out.println("Converted temperature = " + result);


    }

}