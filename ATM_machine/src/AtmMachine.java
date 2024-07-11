import java.util.Base64;
import java.util.Scanner;

import static java.lang.System.exit;

public class AtmMachine {
    int balance=1;
    int PIN= 123;
    Scanner scanner= new Scanner(System.in);
    public void select(){
        System.out.println("Enter PIN CODE");
        int pin = scanner.nextInt();
        if(pin == PIN){
            menu();
        }
    }

    private void menu() {
        while(true){
            System.out.println("SELECT ONE");
            System.out.println("1.WITHDRAW \n 2.DEPOSITE \n 3.BALANCE ENQUIRY \n 4.EXIT ");
            int n=scanner.nextInt();
            switch (n){
                case 1: withdray();
                break;
                case 2: deposite();
                break;
                case 3: balance();
                break;
                case 4: exitMenu();
                break;
                default:
                    System.out.println("SELECT DIGIT BETWEEN 1-4");
            }
        }
    }

    private void withdray() {
        System.out.println("ENTER AMOUND");
        int withdrayAmound = scanner.nextInt();
        if(withdrayAmound >= balance){
            balance-=withdrayAmound;
            System.out.println("Current Balance = " + balance);
            menu();
        }
        else{
            System.out.println("NOT HAVING ENOUGHT BALANCE");
            exitMenu();
        }

    }

    private void deposite() {
        System.out.println("ENTER AMOUND TO DEPOSIT");
        int depositeMoney=scanner.nextInt();
        balance+=depositeMoney;
        System.out.println("Money Deposit Successfully");
        exitMenu();
    }

    private void exitMenu() {
        select();
    }

    private void balance() {
        System.out.println("CURRENT BALANCE=" + balance);
        exitMenu();
    }
}
