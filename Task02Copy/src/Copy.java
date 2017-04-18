import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Copy {
  public static void main(String[] args){
    File source = new File(args[1]);
    File destination = new File(args[2]);
    List<String> Lines = readLinesFromFile(source);
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
      try {
//        File source = new File(args[1]);
//        File destination = new File(args[2]);
        Files.copy( source.toPath(), destination.toPath());
        for (int i = 0; i < Lines.size(); i++) {
          System.out.println(i + 1 + " - " + Lines.get(i));
          writeToFile(Lines,source);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  private static List<String> readLinesFromFile(File input) {
    Path path = Paths.get(String.valueOf(input));
    List<String> todoLines;
    try {
      todoLines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      todoLines = new ArrayList<>();
    }
    return todoLines;
  }

  private static void writeToFile(List<String> data,File input) {
    Path path = Paths.get(String.valueOf(input));
    try {
      Files.write(path, data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}



