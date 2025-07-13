import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file name : ");
		String fileName = sc.nextLine();

		System.out.print("Enter the character to be counted : ");
		char targetChar = sc.nextLine().toLowerCase().charAt(0); // Case-insensitive

		FileReader reader = null;
		int count = 0;

		try{
			reader = new FileReader(fileName);
			int ch;

			while ((ch = reader.read()) != -1){
				if (Character.toLowerCase((char) ch) == targetChar){
					count++;
				}
			}

			System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + targetChar + "'.");
		} 
		catch (IOException e){
				System.out.println("Error reading the file: " + e.getMessage());
		} finally{
				if (reader != null){
					try{
						reader.close();
					} catch (IOException e){
							System.out.println("Error closing the file: " + e.getMessage());
						}
					}
					sc.close();
				}
  	}
}
