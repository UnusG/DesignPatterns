package factory;

/**
 * A factory class that creates YAML config parser objects implementing the ConfigParser interface.
 */
public class YamlConfigParserFactory implements ConfigParserFactory {
  @Override public ConfigParser createParser() {
    return new YamlConfigParser();
  }
}
