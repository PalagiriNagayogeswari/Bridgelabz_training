import java.util.*;
public class ReverseInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0,rev=0;
        while(n>0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println(rev);
    }
}
