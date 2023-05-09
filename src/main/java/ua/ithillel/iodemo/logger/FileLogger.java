package ua.ithillel.iodemo.logger;

public class FileLogger {
    private FileLoggerConfig config;

    public FileLogger(FileLoggerConfig config) {
        this.config = config;
    }

    public void debug(String messsage) throws FileMaxSizeException {
        // check LEVEL
//        config.getLevel()
        // check file size
        // write message to file

    }
    public void info(String messsage) {}
}
