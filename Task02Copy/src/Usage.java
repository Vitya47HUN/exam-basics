import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Usage {
  public static void printUsage() {
    System.out.println("Java Copy application\n" +
            "====================\n" +
            "Command line arguments:\n" +
            "copy [source] [destination]\n");
  }

  public static void oneArgument() {
    System.out.println("No destination provided");
  }

  public static void copyFile(File from, File to ) throws IOException {
    Files.copy( from.toPath(), to.toPath() );
  }

}