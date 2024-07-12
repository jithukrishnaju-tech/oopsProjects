import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int PASSWORD_LENGTH=7;
    private String COMPANY_NAME = "Tigmaminds";
    private String alternateEmail;
    Scanner scanner = new Scanner(System.in);
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = generatePassword(PASSWORD_LENGTH);
        this.department = getDepartment();
    }
    String generateEmail(){
        String fnameRefactored = firstName.toLowerCase();
        String lnameRefactored = lastName.toLowerCase();
        String departmenRefactored = department.toLowerCase();
        String companyNameRefactored = COMPANY_NAME.toLowerCase();
        return fnameRefactored+"."+lnameRefactored+"@"+departmenRefactored+"."+companyNameRefactored+"."+"com";
    }
    private String getDepartment() {
        System.out.println("Select Department");
        System.out.println("1.Sales \n2.Development \n3.Accounting");
        int  n = scanner.nextInt();
        if(n==1){
            return "Sales";
        }
        else if(n==2){
            return "Development";
        }
        return "Accounting";
    }
    String generatePassword(int maxlength){
        String string="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:'\",.<>?/~`";
        char[] randomPassword=new char[maxlength];
        for (int i = 0; i < maxlength; i++) {
            int random= (int) (Math.random()*string.length());
            randomPassword[i] = string.charAt(random);
        }
        return new String(randomPassword);
    }
    void changePassword(String newPassword){
        this.password=newPassword;
        System.out.println("PASSWORD IS CHANGED");
    }
    void setAlternateEmail(String newMail){
        this.alternateEmail=newMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
}
