import java.io.*;
import java.util.*;

public class Old {
    public static void main(String[] args) {
        String inputFile = "old.dat";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            List<String> insectNames = new ArrayList<>();
            
            while ((line = reader.readLine()) != null) {
                String[] insects = line.split(",");
                for (String insect : insects) {
                    insectNames.add(insect.trim().toUpperCase());
                }
                
                Collections.sort(insectNames, Collections.reverseOrder());
                
                System.out.println(String.join(",", insectNames));
                
                insectNames.clear();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
