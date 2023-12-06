
public class UserRegistration {

    public class UserRegistrationException extends Exception {
        public UserRegistrationException(String message) {
            super(message);
        }
    }
    public boolean isValidFirstName(String firstName) throws UserRegistrationException {
        if (!firstName.matches("[A-Z][a-z]{2,}")){
            throw new UserRegistrationException("Invalid First Name");
        }
        else return  true;
    }

    public boolean isValidLastName(String lastName) throws UserRegistrationException {
        if (!lastName.matches("[A-Z][a-z]{2,}")){
            throw new UserRegistrationException("Invalid Last Name");
        }
        else{
            return true;
        }
    }

    public boolean isValidEmail(String email) throws UserRegistrationException {
        if (!email.matches("[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*([_+%-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?")){
            throw new UserRegistrationException("Invalid Email");
        }
        else return true;
    }

    public boolean isValidMobile(String mobile) throws UserRegistrationException {
        if (!mobile.matches("\\d{2} \\d{10}")){
            throw new UserRegistrationException("Invalid Mobile");
        }
        else return true;
    }

    public boolean isValidPassword(String password) throws UserRegistrationException {
        if (!password.matches("(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}")){
            throw new UserRegistrationException("Invalid Password");
        }
        else return true;
    }
}
