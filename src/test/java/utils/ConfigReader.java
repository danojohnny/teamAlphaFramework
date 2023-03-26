package utils;

import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

    public ConfigReader() {
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    static {
        try {
            properties.load(Files.newInputStream(Path.of("config.properties")));
        } catch (IOException var1) {
            throw new RuntimeException(var1);
        }
    }
}
