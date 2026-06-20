import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int a = sc.nextInt();

        System.out.print("Enter b value: ");
        int b = sc.nextInt();

        System.out.print("Enter c value: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = c + a / b;
        int result3 = a % b + c;
        int result4 = a * b + c;

        System.out.println("a+b*c = " + result1);
        System.out.println("c+a/b = " + result2);
        System.out.println("a%b+c = " + result3);
        System.out.println("a*b+c = " + result4);


        // Finding Maximum
        int max = result1;

        if(result2 > max)
            max = result2;

        if(result3 > max)
            max = result3;

        if(result4 > max)
            max = result4;


        // Finding Minimum
        int min = result1;

        if(result2 < min)
            min = result2;

        if(result3 < min)
            min = result3;

        if(result4 < min)
            min = result4;


        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);


        sc.close();
    }
}