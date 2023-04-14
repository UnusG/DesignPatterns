package factory;

/**
 * An implementation of the {@link ConfigParserFactory} interface for creating {@link
 * PropertiesConfigParser} instances.
 */
public class PropertiesConfigParserFactory implements ConfigParserFactory {
  @Override public ConfigParser createParser() {
    return new PropertiesConfigParser();
  }
}
