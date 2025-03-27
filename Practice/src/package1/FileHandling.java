package package1;

import java.io.*;

public class FileHandling {
	
	public static void main(String[] args) {
		String name="Example.txt";
		String Content="Hello, this is a file!";
		
		try(FileWriter writer=new FileWriter(name)) {
			writer.write(Content);
			System.out.println("File Wrriten successfully");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
		
		
	}

}
