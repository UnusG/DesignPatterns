package factory;

/**
 * This class implements the ConfigParser interface and provides the pseudocode code to parse yaml
 * configuration content.
 */
public class YamlConfigParser implements ConfigParser {
  @Override public void parse(String configContent) {
    System.out.println("Parse yaml config content:\n" + configContent + "\n");
  }
}
