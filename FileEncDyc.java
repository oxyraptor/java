import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileEncDyc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();
        
        System.out.print("Enter the output file path: ");
        String outputFilePath = sc.nextLine();
        
        System.out.print("Choose (E)ncrypt or (D)ecrypt: ");
        char choice = sc.nextLine().toUpperCase().charAt(0);
        
        System.out.print("Enter the shift value: ");
        int shift = sc.nextInt();
        
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            String result;
            
            if (choice == 'E') {
                result = encrypt(content, shift);
            } else {
                result = decrypt(content, shift);
            }
            
            FileWriter writer = new FileWriter(outputFilePath);
            writer.write(result);
            writer.close();
            
            System.out.println("Operation completed. Check the output file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        sc.close();
    }
    
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);
            }
            result.append(c);
        }
        
        return result.toString();
    }
    
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}