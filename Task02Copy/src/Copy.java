import java.io.*;
import java.util.Scanner;

public class Copy {
  static File randomFile, randomFile2, randomDir;

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    String strDirectoryPath = "C:/Greenfox";
    String strFileName = "Test";
    String strExtension = ".txt";
    randomDir = new File(strDirectoryPath);
    randomDir.mkdir();
    randomFile = new File(args[1]);
    randomFile2 = new File(args[2]);

    if (args.length == 0) {
      Usage.printUsage();
    } else if (args.length == 1) {
      Usage.oneArgument();
    } else if (args.length == 3 && args[0] == "copy") {
      try {
        randomFile.createNewFile();
        randomFile2.createNewFile();
        Usage.copyFile(randomFile,randomFile2);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
