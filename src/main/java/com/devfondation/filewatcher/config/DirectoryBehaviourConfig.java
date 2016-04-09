package com.devfondation.filewatcher.config;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by christopher on 09/04/16.
 */
public class DirectoryBehaviourConfig {
    private List<String> ListInputDirectory = new ArrayList<String>();

    public List<String> getListInputDirectory() {
        return ListInputDirectory;
    }
}
