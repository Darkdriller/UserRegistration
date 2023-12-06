public class UserRegistration {
    public boolean isValidFirstName(String firstName) {
        return firstName.matches("[A-Z][a-z]{2,}");
    }

    public boolean isValidLastName(String lastName) {
        return lastName.matches("[A-Z][a-z]{2,}");
    }

    public boolean isValidEmail(String email) {
        return email.matches("[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*([_+%-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?"

        );
    }

    public boolean isValidMobile(String mobile) {
        return mobile.matches("\\d{2} \\d{10}");
    }

    public boolean isValidPassword(String password) {
        return password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
    }
}
