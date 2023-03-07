package file_utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileUtilsExample {

    public List<String> readFile(String sPathToFile) throws IOException {
        File file = new File(sPathToFile);
        List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
        return lines;
    }
}
