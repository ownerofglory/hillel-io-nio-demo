package ua.ithillel.iodemo.logger;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileLoggerConfigLoader {
    public FileLoggerConfig load(String fileName) {
        FileLoggerConfig fileLoggerConfig = new FileLoggerConfig();
        fileLoggerConfig.setFilePath("");
        fileLoggerConfig.setLevel("");
        return fileLoggerConfig;
    }
}
