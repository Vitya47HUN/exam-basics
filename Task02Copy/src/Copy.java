import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Copy {
  public static void main(String[] args) throws IOException {
    File source = new File(args[1]);
    File destination = new File(args[2]);
    String fileName = args[1];
//    List<String> todoLines = readLinesFromFile();
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    if (args.length == 0) {
      Usage.printUsage();
    } else if (args.length == 1) {
      Usage.oneArgument();
    } else if (args.length == 3 && args[0] == "copy") {
      Usage.copyFile(source,destination);
      readFile(source);
    }
  }

  public static void readFile(File from){
    try {
      FileReader fr = new FileReader(from);
      int c = fr.read();
      while(c != -1) {
        System.out.println(from);
      }
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}


