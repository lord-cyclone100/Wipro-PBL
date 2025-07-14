import java.io.*;
import java.util.*;

public class Test {
	public static void main(String[] args) {
    // if (args.length != 2) {
    //   System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
    //   return;
    // }

    String inputFile = args[0];
    String outputFile = args[1];
    Map<String, Integer> wordCount = new TreeMap<>();

    FileReader reader = null;
    BufferedReader br = null;
    FileWriter writer = null;

    try {
      reader = new FileReader(inputFile);
      br = new BufferedReader(reader);
      String line;

      while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");

				for (String word : words) {
					word = word.trim();
					if (!word.isEmpty()) {
						wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
					}
				}
			}

      writer = new FileWriter(outputFile);
      for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
      }

      System.out.println("Word count written to: " + outputFile);
    } 
		catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
		finally {
      try {
        if (br != null) br.close();
        if (reader != null) reader.close();
        if (writer != null) writer.close();
      } 
			catch (IOException e) {
        System.out.println("Error closing files: " + e.getMessage());
      }
    }
  }
}
