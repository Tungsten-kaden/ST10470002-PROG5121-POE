
package prog5121poe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    // Default constructor for the test class
    public LoginTest() {
    }

    // Runs once before all tests in this class
    @BeforeClass
    public static void setUpClass() {
        // Can initialize shared resources here if needed
    }

    // Runs once after all tests in this class
    @AfterClass
    public static void tearDownClass() {
        // Can clean up shared resources here if needed
    }

    // Runs before each test method
    @Before
    public void setUp() {
        // Can set up preconditions for each test
    }

    // Runs after each test method
    @After
    public void tearDown() {
        // Can clean up after each test
    }

    // Test for validating the username
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "user_"; // Input to test
        Login instance = new Login("user_", "Password1!", "+27123456789"); // Create Login object
        boolean expResult = true; // Expected result: username is valid
        boolean result = instance.checkUserName(userName); // Call the method
        assertEquals(expResult, result); // Check if result matches expected
    }

    // Test for validating password complexity
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        Login instance = new Login("user_", "Password1!", "+27123456789");
        String password = "Password1!"; // Test password
        boolean expResult = true; // Expected: password meets complexity requirements
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }

    // Test for validating cell phone number format
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        Login instance = new Login("user_", "Password1!", "+27123456789");
        String cellNumber = "+27123456789"; // Test cell number
        boolean expResult = true; // Expected: valid number
        boolean result = instance.checkCellPhoneNumber(cellNumber);
        assertEquals(expResult, result);
    }

    // Test for registering a user
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Login instance = new Login("user_", "Password1!", "+27123456789");
        String expectedMessage = "User has been registered successfully"; // Expected message after registration
        assertEquals(expectedMessage, instance.registerUser());
    }

    // Test for logging in a user
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUserName = "user_"; // Input username
        String enteredPassword = "Password1!"; // Input password
        Login instance = new Login("user_", "Password1!", "+27123456789");
        boolean expResult = true; // Expected: login successful
        boolean result = instance.loginUser(enteredUserName, enteredPassword);
        assertEquals(expResult, result);
    }

    // Test for returning login status message
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String enteredUserName = "user_"; // Correct username
        String enteredPassword = "Password1!"; // Correct password
        Login instance = new Login("user_", "Password1!", "+27123456789");
        String expResult = "Login successful! Welcome user_, it is great to see you again"; // Expected message
        String result = instance.returnLoginStatus(enteredUserName, enteredPassword);
        assertEquals(expResult, result);
    }

    // Test for retrieving the username of the registered user
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Login instance = new Login("user_", "Password1!", "+27123456789");
        String expResult = "user_"; // Expected username
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }
}

