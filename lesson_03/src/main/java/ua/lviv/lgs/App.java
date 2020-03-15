package ua.lviv.lgs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class App {
    private static Logger logger = Logger.getLogger(String.valueOf(App.class));

    public static void main(String[] args) {
//             logWithBasicConfigurator();
        loggerWithDomConfigurator();
    }

//    public static void logWithBasicConfigurator() {
//        BasicConfigurator.configure();
//        logger.trace("some trance message");
//        logger.debug("some debug message");
//        logger.info("some info message");
//        logger.warn("some warn message");
//        logger.error("some error message");
//        logger.fatal("some fatal message");
//    }

    public static void loggerWithDomConfigurator(){
        DOMConfigurator.configure("log4j.xml");
        logger.trace("some trance message");
        logger.debug("some debug message");
        logger.info("some info message");
        logger.warn("some warn message");
        logger.error("some error message");
        logger.fatal("some fatal message");
        logger.error("some error message");
    }
}

