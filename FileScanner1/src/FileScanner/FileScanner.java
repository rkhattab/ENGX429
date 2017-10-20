package FileScanner;

/**
*
* @author Reem Khattab
*/


import java.io.File;
import java.util.Scanner;

public class FileScanner {
	  
	  public Scanner read;
	 
	  Scanner scanner = new Scanner(System.in);

	  public void openFile() {
	      try {
	          read = new Scanner(new File("./words.txt"));
	          System.out.println("Enter a word to search: ");
	      } catch (Exception e) {
	          System.out.println("could not find file");
	      } finally {
	          System.out.println();
	      }
	  }
	  
	  public void readFile() {
	      int total = 0;
	      String currentTerm;
	      String searchTerm = scanner.nextLine();
	      while (read.hasNext()) {
	          System.out.println("String looped over is " + read.next());
	          currentTerm = read.next();
	          if (currentTerm.equalsIgnoreCase(searchTerm)) {
	              total++;
	          }
	      }
	      System.out.println(total);
	      System.out.println(searchTerm + " was read " + total + " times");
	  }

	  public void closeFile() {
	      read.close();
	  }
}
