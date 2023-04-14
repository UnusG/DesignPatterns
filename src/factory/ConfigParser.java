package factory;

/**
 * The ConfigParser interface defines the method for parsing configuration content.
 */
public interface ConfigParser {
  /**
   * Parses the given configuration content.
   * @param configContent the configuration content to be parsed
   */
  void parse(String configContent);
}
