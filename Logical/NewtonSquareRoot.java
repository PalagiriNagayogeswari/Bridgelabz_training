public class NewtonSquareRoot {


    public static double sqrt(double c) {


        if(c < 0) {
            return -1;
        }


        double epsilon = 1e-15;


        double t = c;


        while(Math.abs(t - c/t) > epsilon * t) {


            t = (c/t + t) / 2;


        }


        return t;

    }



    public static void main(String[] args) {


        double number = Double.parseDouble(args[0]);


        double result = sqrt(number);


        System.out.println("Square root = " + result);


    }

}