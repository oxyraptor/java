import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, rev="";
        System.out.println("Enter a string");
        str = sc.nextLine();
        int len = str.length();
        for (int i = len-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if(str == rev){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");

        }
        sc.close();

    }
}