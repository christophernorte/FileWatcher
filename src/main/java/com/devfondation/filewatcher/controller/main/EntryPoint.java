package com.devfondation.filewatcher.controller.main;

import com.devfondation.filewatcher.service.fs.IDirectoryWatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by christopher on 09/04/16.
 */
@Component
public class EntryPoint {


    @Autowired
    private IDirectoryWatcher directoryWatcher;

    public void startApplication()
    {
//        directoryWatcher.
    }


}
