import java.util.Scanner;

public class CheckPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        
        String strength = checkPasswordStrength(password);
        System.out.println("strength of the Password : " + strength);
        
        sc.close();
    }
    
    public static String checkPasswordStrength(String password) {
        int length = password.length();
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
        
        if (length >= 8 && hasUppercase && hasLowercase && hasNumber && hasSpecialChar) {
            return "Strong";
        } else if (length >= 6 && ((hasUppercase && hasLowercase) || (hasNumber && hasSpecialChar))) {
            return "Medium";
        } else {
            return "Weak";
        }
    }
}
