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
}