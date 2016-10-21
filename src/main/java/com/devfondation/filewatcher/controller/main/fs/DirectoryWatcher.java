package com.devfondation.filewatcher.controller.main.fs;


/**
 * Created by christopher on 09/04/16.
 */
public class DirectoryWatcher {

    private String directoryPath;

    public DirectoryWatcher(String directoryPath) {

        this.directoryPath = directoryPath;
    }

    public String getDirectoryPath() {

        return directoryPath;
    }
}
