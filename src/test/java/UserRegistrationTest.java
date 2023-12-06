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
        Assert.assertTrue(userReg.isValidEmail("example@domain.com"));
    }

    @Test
    public void testInvalidEmail() {
        Assert.assertFalse(userReg.isValidEmail("example.com"));
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

