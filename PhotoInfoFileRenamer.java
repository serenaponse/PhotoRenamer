import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhotoInfoFileRenamer {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 1) {
            System.out.println("Usage: java PhotoInfoFileRenamer <inputTextFile>");
            return;
        }

        String inputTextFileName = args[0];

        try {
            // Open the input text file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputTextFileName));
            String line;

            // Read each line from the text file
            while ((line = reader.readLine()) != null) {
                // Replace "_photo.jpg" with "_info.txt" in the file name
                String modifiedFileName = line.replace("_photo.jpg", "_info.txt");
                
                // Print the modified file name
                System.out.println(modifiedFileName);
            }

            // Close the file reader
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the input text file: " + e.getMessage());
        }
    }
}
