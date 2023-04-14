package factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates how to use the factory method pattern to parse configuration files in
 * different formats. It reads the content of configuration files from the file system and uses the
 * appropriate factory to create a parser for the file format. The file format is determined based
 * on the file extension.
 */
public class Client {
  /**
   * Reads the content of the configuration files from the file system and parses them using the
   * appropriate parser factory.
   *
   * @param args the command-line arguments (not used).
   * @throws IOException if an I/O error occurs while reading the configuration files.
   */
  public static void main(String[] args) throws IOException {
    List<String> configFilesPath = new ArrayList<>();
    configFilesPath.add("config/application.properties");
    configFilesPath.add("config/config.yml");
    configFilesPath.add("config/config.json");
    configFilesPath.add("config/config.xml");

    for (String configPath : configFilesPath) {
      String configContent = Files.readString(Path.of(configPath));
      ConfigParserFactory factory = determineFactory(configPath);
      ConfigParser parser = factory.createParser();
      parser.parse(configContent);
    }
  }

  /**
   * Determines the appropriate parser factory based on the file extension of the configuration
   * file.
   *
   * @param configFilePath the path of the configuration file.
   * @return the parser factory for the file format.
   * @throws IllegalArgumentException if the file format is not recognized.
   */
  private static ConfigParserFactory determineFactory(String configFilePath) {
    String fileExtension = getFileExtension(configFilePath);
    switch (fileExtension) {
      case ".json":
        return new JsonConfigParserFactory();
      case ".xml":
        return new XmlConfigParserFactory();
      case ".yaml":
      case ".yml":
        return new YamlConfigParserFactory();
      case ".properties":
        return new PropertiesConfigParserFactory();
      default:
        throw new IllegalArgumentException("Unknown config file format");
    }
  }

  /**
   * Returns the file extension of the given file name.
   *
   * @param filename the name of the file.
   * @return the file extension (including the dot).
   * @throws IllegalArgumentException if the file name has no extension.
   */
  private static String getFileExtension(String filename) {
    int index = filename.lastIndexOf(".");
    if (index == -1) {
      throw new IllegalArgumentException("No file extension found in " + filename);
    }
    return filename.substring(index);
  }
}
