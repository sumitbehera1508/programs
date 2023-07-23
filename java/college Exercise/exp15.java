import java.io.*;

public class exp15 {
    public static void main(String[] args) {
        // Read data from the file
        try {
            File inputFile = new File("D:\\programs\\java\\college Exercise\\input.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            String additionalData = "This is additional data.";
            content.append(additionalData).append("\n");

        
            File outputFile = new File("data.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            writer.write(content.toString());

            writer.close();

            System.out.println("File read, append, and write operations completed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
