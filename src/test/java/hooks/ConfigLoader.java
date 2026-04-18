package hooks;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigLoader {

    private static Properties properties = new Properties();

    public static void load(String env) {
        try {
            FileInputStream file = new FileInputStream(
                    "src/test/resources/config/" + env + ".properties"
            );
            properties.load(file);
        } catch (Exception e) {
            throw new RuntimeException("Config file not found: " + env);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
