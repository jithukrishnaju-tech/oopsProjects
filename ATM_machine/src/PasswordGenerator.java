import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password length");
        int passwordLength = scanner.nextInt();
        char[] ans=generateRandomPassword(passwordLength);
        System.out.println(ans);
    }

    private static char[] generateRandomPassword(int passwordLength) {
        String string="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:'\",.<>?/~`";
        char[] randomPassword=new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            int randumNumber = (int) (Math.random()*string.length());
            randomPassword[i] = string.charAt(randumNumber);
        }
     return randomPassword;
    }
}
