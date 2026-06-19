import javax.swing.*;
import java.util.*;
public class Palindrome {
    public static int Reverse_For_Loop(int n) {

      //  Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int temp = 0, rev = 0;
        while(n>0)
        {
            temp = n % 10;
            rev = rev * 10 + temp;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=Reverse_For_Loop(n);
        if(res==n)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
