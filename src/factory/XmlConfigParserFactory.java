package factory;

/**
 * An implementation of the {@link ConfigParserFactory} interface for creating {@link
 * XmlConfigParser} instances.
 */
public class XmlConfigParserFactory implements ConfigParserFactory {
  @Override public ConfigParser createParser() {
    return new XmlConfigParser();
  }
}
