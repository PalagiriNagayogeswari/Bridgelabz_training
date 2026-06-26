//Implemented AccountTest class to test debit method.
import java.util.*;
//Class Account holding all the details regarding Account.
class Account{
    private int balance;
    //setter to set balance
    public void setBalance(int bal){
        this.balance=bal;
    }

    //debit method
    //modifies balance if amount<balance else prints as Insufficient Balance and stops execution.
    public void debit(int amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance=balance-amount;
        }
    }
}

//AccountTest class to test debit method
public class AccountTest {
    public static void main(String[] args){
        Account acc=new Account();
        //setting the balance.
        acc.setBalance(2000);
        System.out.println("Enter the withdrawal amount:");
        System.out.println();
        //taking amount input from user to be withdrawn.
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        //calling debit method.
        acc.debit(amount);

    }
}
