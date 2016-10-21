package com.devfondation.filewatcher.service.config;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by christophernorte on 21/10/16.
 */

public interface IConfigReader {
    List<String> getListInputDirectory();
}
