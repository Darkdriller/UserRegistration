import org.junit.Test;
import org.junit.Assert;
public class UserRegistrationTest {
    UserRegistration userReg = new UserRegistration();

    // Test cases for First Name
    @Test
    public void testValidFirstName() {
        Assert.assertTrue(userReg.isValidFirstName("Alice"));
    }

    @Test
    public void testInvalidFirstName() {
        Assert.assertFalse(userReg.isValidFirstName("al"));
    }

    // Test cases for Last Name
    @Test
    public void testValidLastName() {
        Assert.assertTrue(userReg.isValidLastName("Smith"));
    }

    @Test
    public void testInvalidLastName() {
        Assert.assertFalse(userReg.isValidLastName("Sm"));
    }

    // Test cases for Email
    @Test
    public void testValidEmail() {
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
    public void testInvalidEmail() {
        Assert.assertFalse(userReg.isValidEmail("abc"));
        Assert.assertFalse(userReg.isValidEmail("abc@.com.my"));
        Assert.assertFalse(userReg.isValidEmail("abc123@gmail.a"));
        Assert.assertFalse(userReg.isValidEmail("abc123@.com"));
        Assert.assertFalse(userReg.isValidEmail("abc123@.com.com"));
        Assert.assertFalse(userReg.isValidEmail(".abc@abc.com"));
        Assert.assertFalse(userReg.isValidEmail("abc()*@gmail.com"));
        Assert.assertFalse(userReg.isValidEmail("abc@%*.com"));
        Assert.assertFalse(userReg.isValidEmail("abc..2002@gmail.com"));
        Assert.assertFalse(userReg.isValidEmail("abc.@gmail.com"));
        Assert.assertFalse(userReg.isValidEmail("abc@abc@gmail.com"));
        Assert.assertFalse(userReg.isValidEmail("abc@gmail.com.1a"));
        Assert.assertFalse(userReg.isValidEmail("abc@gmail.com.aa.au"));


    }

    // Test cases for Mobile
    @Test
    public void testValidMobile() {
        Assert.assertTrue(userReg.isValidMobile("91 1234567890"));
    }

    @Test
    public void testInvalidMobile() {
        Assert.assertFalse(userReg.isValidMobile("911234567890"));
    }

    // Test cases for Password
    @Test
    public void testValidPassword() {
        Assert.assertTrue(userReg.isValidPassword("Password1@"));
    }

    @Test
    public void testInvalidPassword() {
        Assert.assertFalse(userReg.isValidPassword("pass"));
    }
}

