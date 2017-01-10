package com.cmiot.jsuws.wsb.listener;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.File;
import java.io.IOException;

/**
 * Created by ZJL on 2017/1/5.
 */
public class LogbackConfigListener implements ServletContextListener {
    private static final Logger logger = LoggerFactory.getLogger(LogbackConfigListener.class);

    private static final String CONFIG_LOCATION = "logbackConfigLocation";

    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
            // 从web.xml中加载指定文件名的日志配置文件
            String logbackConfigLocation = event.getServletContext().getInitParameter(CONFIG_LOCATION);
            String fn = event.getServletContext().getRealPath(logbackConfigLocation);
            LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

            File externalConfigFile = new File(fn);
            if (!externalConfigFile.exists()) {
                throw new IOException("Logback External Config File Parameter does not reference a file that exists");
            } else {
                if (!externalConfigFile.isFile()) {
                    throw new IOException("Logback External Config File Parameter exists, but does not reference a file");
                } else {
                    if (!externalConfigFile.canRead()) {
                        throw new IOException("Logback External Config File exists and is a file, but cannot be read.");
                    } else {
                        ch.qos.logback.classic.joran.JoranConfigurator configurator = new ch.qos.logback.classic.joran.JoranConfigurator();
                        configurator.setContext(lc);
                        lc.reset();
                        configurator.doConfigure(fn);
                        StatusPrinter.printInCaseOfErrorsOrWarnings(lc);
                    }
                }
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
    }
}
