package com.devfondation.filewatcher.controller.main;

import com.devfondation.filewatcher.controller.main.fs.DirectoryWatcher;
import com.devfondation.filewatcher.service.config.IConfigReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class EntryPoint {

    private final IConfigReader configReader;
    private final List<DirectoryWatcher> listDirectoryWatcher = new ArrayList<>();

    @Autowired
    public EntryPoint(IConfigReader configReader) {
        this.configReader = configReader;
    }

    public void startApplication()
    {
        List<String> listInputDirectory = configReader.getListInputDirectory();

        for (String inputDirectory : listInputDirectory)
        {
            listDirectoryWatcher.add(new DirectoryWatcher(inputDirectory));
        }


    }


}
