import java.util.Random;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the password");
        int len=sc.nextInt();
        System.out.println("Include numbers?(true/false)");
        boolean num=sc.nextBoolean();
        System.out.println("Include special characters?(true/false)");
        boolean special=sc.nextBoolean();
        String password = generatePassword(len, num, special);
        System.out.println("Generated Password: "+password);
        sc.close();


    
    }
    public static String generatePassword(int len, boolean num, boolean special) {
        String numb="0123456789";
        String chr="AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String spclchar=",<>.?/:;{{}}+=_-!@#$%^&*(())";
        String password = "";
        Random r = new Random();
        if (num) {
            password += numb.charAt(r.nextInt(numb.length()));
            // password += numb.charAt(r.nextInt(numb.length()));
            }
        if (special) {  
            password += spclchar.charAt(r.nextInt(spclchar.length()));
            // password += spclchar.charAt(r.nextInt(spclchar.length()));
            }
                password += chr.charAt(r.nextInt(chr.length()));
                // password += chr.charAt(r.nextInt(chr.length()));
                for (int i = password.length(); i < len; i++) {
                    password += chr.charAt(r.nextInt(chr.length()));
                }
            return password;   
    }
}


