import java.io.*;
import java.util.*;

public class Ciphertext {
    public static void main(String[] args) throws IOException {
        String ciphertext = "ASDFGHJKLQETUOWRYIPZCBMNVX";
        String plaintext = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Map<Character, Character> cipherToPlainMap = new HashMap<>();
        for (int i = 0; i < ciphertext.length(); i++) {
            cipherToPlainMap.put(ciphertext.charAt(i), plaintext.charAt(i));
        }

        File inputFile = new File("ciphertext.dat");
        Scanner scanner = new Scanner(inputFile);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String encodedLine = scanner.nextLine();
            StringBuilder decodedLine = new StringBuilder();

            for (char ch : encodedLine.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    decodedLine.append(cipherToPlainMap.getOrDefault(ch, ch));
                } else {
                    decodedLine.append(ch);
                }
            }

            System.out.println(decodedLine);
        }

        scanner.close();
    }
}
