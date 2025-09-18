package prog5121poe;

import java.util.Scanner;
public class PROG5121POE{

 
    public static void main(String[] args) {     
        Scanner scan = new Scanner(System.in);
        
        String userName;
        String password;
        String cellNumber;
        String registerUser;
        String registerStatus;
               
        
        // PROMPT FOR REGISTRATION
        
        //Prompt for username
        System.out.print("Enter username: ");
        userName = scan.nextLine();

        // Prompt for password
        System.out.print("Enter password: ");
        password = scan.nextLine();
        
        //Prompt for cellphone number
        System.out.print("Enter cellphone number (with country code, e.g. +27123456789): ");
        cellNumber = scan.nextLine();
        
        Login login = new Login(userName, password, cellNumber);
        
        registerStatus = login.registerUser();
        System.out.println(registerStatus);
        
        // If registration successful, allow login test
        if (registerStatus.equals("User has been registered successfully")) {
            System.out.println("\n--- LOGIN PHASE ---");

            System.out.print("Enter username again: ");
            String enteredUser = scan.nextLine();

            System.out.print("Enter password again: ");
            String enteredPass = scan.nextLine();

            // Show login status
            System.out.println(login.returnLoginStatus(enteredUser, enteredPass));
        }
              
     
        scan.close();
    }
}  
