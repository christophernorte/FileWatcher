package com.devfondation.filewatcher;

import com.devfondation.filewatcher.controller.main.EntryPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by christopher on 08/01/16.
 */
@Configuration
@ComponentScan
public class FileWatcher {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FileWatcher.class);

        EntryPoint entryPoint = context.getBean(EntryPoint.class);
        entryPoint.startApplication();

    }
}

