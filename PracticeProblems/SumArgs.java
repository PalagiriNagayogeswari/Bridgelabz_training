public class SumArgs {


    public static void main(String[] args) {


        int sum = 0;

        int invalid = 0;



        for(int i = 0; i < args.length; i++) {


            try {


                int num = Integer.parseInt(args[i]);


                sum = sum + num;


            }
            catch(Exception e) {


                invalid++;

            }


        }



        System.out.println("Sum = " + sum);

        System.out.println("Invalid integers = " + invalid);


    }

}