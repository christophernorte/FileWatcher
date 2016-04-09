package com.devfondation.filewatcher.service.fs;


/**
 * Created by christopher on 09/04/16.
 */
public class DirectoryWatcher implements IDirectoryWatcher{

    private String directoryPath;

    public DirectoryWatcher(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public String getDirectoryPath() {
        return directoryPath;
    }
}
