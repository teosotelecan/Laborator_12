package org.example;

import java.util.ArrayList;
import java.util.List;

class ExportConfig {
    final String title;
    final String filename;
    ExportConfig(String title, String filename) {
        this.title = title;
        this.filename = filename;
    }
    public String getTitle() {
        return title;
    }
    public String getFilename() {
        return filename;
    }
}
class Exporter {
    final ExportConfig config;
    final List<String> values;
    Exporter(ExportConfig config, List<String> values) {
        this.config = config;
        this.values = new ArrayList<>(values);
    }
    public void export() {
        System.out.println(config.getTitle());
        System.out.println(config.getFilename());
        for (String value : values) {
            System.out.println(value);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        ExportConfig config1 = new ExportConfig("titlu1", "filename1");
        ExportConfig config2 = new ExportConfig("titlu2", "filename2");
        values.add("value1");
        values.add("value2");
        Exporter exporter1 = new Exporter(config1, new ArrayList<>(values));
        values.add("value3");
        Exporter exporter2 = new Exporter(config2, new ArrayList<>(values));
        exporter1.export();
        exporter2.export();
    }
}