import java.util.HashSet;
import java.util.Scanner;

public class CouponNumbers {


    // Function to generate random coupon number
    public static int generateCoupon(int n) {

        return (int)(Math.random() * n) + 1;

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of coupons: ");
        int n = sc.nextInt();


        HashSet<Integer> coupons = new HashSet<>();

        int count = 0;


        while(coupons.size() < n) {


            int coupon = generateCoupon(n);

            count++;


            if(!coupons.contains(coupon)) {

                coupons.add(coupon);

                System.out.println("New coupon collected: " + coupon);

            }

        }


        System.out.println("Total random numbers generated = " + count);


        sc.close();

    }
}