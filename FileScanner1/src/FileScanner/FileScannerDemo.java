package FileScanner;

/**
*
* @author Reem Khattab
*/


public class FileScannerDemo {
   public static void main(String[] args) {
       FileScanner words = new FileScanner();
       words.openFile();
       words.readFile();
       words.closeFile();
   }
}
