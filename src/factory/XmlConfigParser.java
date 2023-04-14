package factory;

/**
 * This class implements the ConfigParser interface and provides the pseudocode code to parse
 * xml configuration content.
 */
public class XmlConfigParser implements ConfigParser {
  @Override public void parse(String configContent) {
    System.out.println("Parse xml config content:\n" + configContent + "\n");
  }
}
