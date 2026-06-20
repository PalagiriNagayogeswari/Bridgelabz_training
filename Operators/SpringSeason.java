public class SpringSeason {

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);


        boolean result = false;


        if((month == 3 && day >= 20) ||
                (month > 3 && month < 6) ||
                (month == 6 && day <= 20)) {

            result = true;
        }


        System.out.println(result);
    }
}