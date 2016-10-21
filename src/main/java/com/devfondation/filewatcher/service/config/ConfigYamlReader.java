package com.devfondation.filewatcher.service.config;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ConfigYamlReader implements IConfigReader {

    @Override
    public List<String> getListInputDirectory() {

        List<String> listInputDirectory = new ArrayList();
        try {
            File configYamlFile = new File(getClass().getResource("/directoryBehaviour.yaml").toURI());

            YamlReader reader = new YamlReader(new FileReader(configYamlFile));
            Object object = reader.read();
            Map map = (Map) object;
            listInputDirectory = (List<String>) map.get("inputDirectory");

        } catch (FileNotFoundException | YamlException | URISyntaxException e) {
            e.printStackTrace();
        }

        return listInputDirectory;
    }
}
