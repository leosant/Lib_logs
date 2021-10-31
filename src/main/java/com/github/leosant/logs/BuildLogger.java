package com.github.leosant.logs;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class BuildLogger extends ConsoleAppender{

    public static final Logger logger = initLogger();


    private static Logger initLogger() {
        Logger log = Logger.getLogger(BuildLogger.class);
        log.addAppender(configureLog());
        return log;
    }
    private static ConsoleAppender configureLog() {
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setThreshold(Level.ALL);
        consoleAppender.setLayout(new ColoredPatternLayout("|%d{dd-MM-yyyy HH:mm:ss}| |%-5p|  [%t] |--%c--| %C{1}.class %m %n"));
        consoleAppender.activateOptions();
        consoleAppender.setEncoding("UTF-8");
        return consoleAppender;
    }
}
