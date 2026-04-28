package core.basesyntax;

import java.io.*;
import java.util.stream.Stream;

public class FileWork {
    public String[] readFromFile(String fileName) {
        //write your code here
        String[] result = new String[0];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
