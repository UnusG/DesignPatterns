package factory;

/**
 * This class implements the ConfigParser interface and provides the pseudocode code to parse json
 * configuration content.
 */
public class JsonConfigParser implements ConfigParser {
  @Override public void parse(String configContent) {
    System.out.println("Parse json config content:\n" + configContent + "\n");
  }
}
