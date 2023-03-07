package file_utils;

import file_utils.FileUtilsExample;

import java.io.IOException;
import java.util.List;

public class TestFileUtilsExample {

    public static void main(String[] args) throws IOException {
        String sPath = "src/main/resources/tekst.txt";
        FileUtilsExample fileUtilsExample = new FileUtilsExample();
        List<String> lines =  fileUtilsExample.readFile(sPath);
        System.out.println(lines);
    }
}
