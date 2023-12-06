import org.junit.Test;
import org.junit.Assert;
public class UserRegistrationTest {
    UserRegistration userReg = new UserRegistration();

    // Test cases for First Name
    @Test
    public void testValidFirstName() throws UserRegistration.UserRegistrationException {
        Assert.assertTrue(userReg.isValidFirstName("Alice"));
    }

    @Test
    public void testInvalidFirstName() {
        try {
            Assert.assertFalse(userReg.isValidFirstName("al"));
        }
        catch (UserRegistration.UserRegistrationException e){
            Assert.assertEquals(e.getMessage(), "Invalid First Name");
        }

    }

    // Test cases for Last Name
    @Test
    public void testValidLastName() throws UserRegistration.UserRegistrationException {
        Assert.assertTrue(userReg.isValidLastName("Smith"));
    }

    @Test
    public void testInvalidLastName() {
        try {
            Assert.assertFalse(userReg.isValidLastName("Sm"));
        }
        catch (UserRegistration.UserRegistrationException e){
            Assert.assertEquals(e.getMessage(),"Invalid Last Name");
        }
    }

    // Test cases for Email
    @Test
    public void testValidEmail() throws UserRegistration.UserRegistrationException {
            Assert.assertTrue(userReg.isValidEmail("abc@yahoo.com"));
            Assert.assertTrue(userReg.isValidEmail("abc-100@yahoo.com"));
            Assert.assertTrue(userReg.isValidEmail("abc.100@yahoo.com"));
            Assert.assertTrue(userReg.isValidEmail("abc111@abc.com"));
            Assert.assertTrue(userReg.isValidEmail("abc-100@abc.net"));
            Assert.assertTrue(userReg.isValidEmail("abc.100@abc.com.au"));
            Assert.assertTrue(userReg.isValidEmail("abc@gmail.com.com"));
            Assert.assertTrue(userReg.isValidEmail("abc+100@gmail.com"));

    }

    @Test
    public void testInvalidEmail() throws UserRegistration.UserRegistrationException {
        try {
            userReg.isValidEmail("abc");
            userReg.isValidEmail("abc@.com.my");
            userReg.isValidEmail("abc123@gmail.a");
            userReg.isValidEmail("abc123@.com");
            userReg.isValidEmail("abc123@.com.com");
            userReg.isValidEmail(".abc@abc.com");
            userReg.isValidEmail("abc()*@gmail.com");
            userReg.isValidEmail("abc@%*.com");
            userReg.isValidEmail("abc..2002@gmail.com");
            userReg.isValidEmail("abc.@gmail.com");
            userReg.isValidEmail("abc@abc@gmail.com");
            userReg.isValidEmail("abc@gmail.com.1a");
            userReg.isValidEmail("abc@gmail.com.aa.au");
        }
        catch (UserRegistration.UserRegistrationException e){
            Assert.assertEquals(e.getMessage(), "Invalid Email");
        }


    }

    // Test cases for Mobile
    @Test
    public void testValidMobile() throws UserRegistration.UserRegistrationException {
        Assert.assertTrue(userReg.isValidMobile("91 1234567890"));
    }

    @Test
    public void testInvalidMobile() {
        try {
            userReg.isValidMobile("911234567890");
        }
        catch (UserRegistration.UserRegistrationException e){
            Assert.assertEquals(e.getMessage(), "Invalid Mobile");
        }
    }

    // Test cases for Password
    @Test
    public void testValidPassword() throws UserRegistration.UserRegistrationException {
        Assert.assertTrue(userReg.isValidPassword("Password1@"));
    }

    @Test
    public void testInvalidPassword() {
        try {
            Assert.assertFalse(userReg.isValidPassword("pass"));
        }
        catch (UserRegistration.UserRegistrationException e){
            Assert.assertEquals(e.getMessage(), "Invalid Password");
        }
    }
}

