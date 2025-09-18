
package prog5121poe;


public class Login {
    private String userName;
    private String password;
    private String cellNumber;
    private String enteredUserName;
    private String enteredPassword;
    private String registerUser;
    

    // Constructor
    public Login(String userName, String password, String cellNumber) {
        this.userName = userName;
        this.password = password;
        this.cellNumber = cellNumber;
    }
    
    //Username rules
    public boolean checkUserName(String userName){
      if(userName == null){
          return false;
      }
        return userName.length() <= 5 && userName.contains("_");
    }
    
    //Password
    public boolean checkPasswordComplexity(String password){       
    
        if(password.length()<8) {
            return false;
        }
        
    
    // Use regex to check the rules
    boolean hasUpperCase = password.matches(".*[A-Z].*");      // At least one uppercase letter
    boolean hasDigit = password.matches(".*[0-9].*");          // At least one digit
    boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*"); // At least one special char

    return hasUpperCase && hasDigit && hasSpecialChar;  
    }
    // Cell number rules
    // Adding international code AI Ref (OpenAi, 2023)
    public boolean checkCellPhoneNumber(String cellNumber) {
        
        // Regex: ^\+27\d{9}$ 
        // ^      → start of string
        // \+27   → must start with +27
        // \d{9}  → exactly 9 digits
        // $      → end of string
    return cellNumber.matches("^\\+27\\d{9}$");
    }
    
    //---Required methods---
    
    //1 . Register user
    public String registerUser(){
    
        if (!checkUserName(userName)){
        
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else {
        
            System.out.println("Username successfully captured.");
        }
        
        if (!checkPasswordComplexity(password)){
        
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }else {
        
            System.out.println("Password successfully captured.");
        }
        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cellphone number is not correctly formatted. Please include a country code and ensure it is no longer than 10 digits.";
        }else {
        
            System.out.println("Cell Phone number successfully added.");
        }
        
        return "User has been registered successfully";
    }
    // 2. Login User (verify credentials)
    public boolean loginUser(String enteredUserName, String enteredPassword) {
        return this.userName.equals(enteredUserName) && this.password.equals(enteredPassword);
    }

    // 3. Return Login Status
    public String returnLoginStatus(String enteredUserName, String enteredPassword) {
        if (loginUser(enteredUserName, enteredPassword)) {
            return "Login successful! Welcome " + this.userName + ", it is great to see you again";
        } else {
            return "Login failed. Username or password incorrect, please try again.";
        }
    }   

    
    public String getUserName() {
        return userName;
    }
}
