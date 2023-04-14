package factory;

/**
 * This class implements the ConfigParser interface and provides the pseudocode code to parse
 * properties configuration content.
 */
public class PropertiesConfigParser implements ConfigParser {
  @Override public void parse(String configContent) {
    System.out.println("Parse properties config content:\n" + configContent + "\n");
  }
}
