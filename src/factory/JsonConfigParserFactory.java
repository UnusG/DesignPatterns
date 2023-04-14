package factory;

/**
 * An implementation of the {@link ConfigParserFactory} interface for creating {@link
 * JsonConfigParser} instances.
 */
public class JsonConfigParserFactory implements ConfigParserFactory {
  @Override public ConfigParser createParser() {
    return new JsonConfigParser();
  }
}
