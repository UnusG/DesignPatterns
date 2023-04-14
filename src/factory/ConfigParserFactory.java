package factory;

/**
 * A factory interface for creating instances of {@link ConfigParser}.
 */
public interface ConfigParserFactory {
  /**
   * Creates and returns a new instance of {@link ConfigParser}.
   *
   * @return a new instance of {@link ConfigParser}.
   */
  ConfigParser createParser();
}
