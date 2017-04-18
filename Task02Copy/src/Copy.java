import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Copy {
  public static void main(String[] args) throws IOException {
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
      File source = new File(args[1]);
      File destination = new File(args[2]);
      Usage.copyFile(source,destination);
    }
  }

}



