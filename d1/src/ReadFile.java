import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static List read() {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            List data = new LinkedList<String>();
            while (myReader.hasNextLine()) {
                 data.add(myReader.nextLine());
            }
            myReader.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}
