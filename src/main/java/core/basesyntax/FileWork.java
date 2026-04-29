package core.basesyntax;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileWork {
    public String[] readFromFile(String fileName) {
        //write your code here
        String[] result = new String[0];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String[] words = bufferedReader.lines().collect(Collectors.joining("\n")).split("\\W+");
            List<String> wordsList = Arrays.stream(words)
                    .map(String::toLowerCase)
                    .filter(word -> word.startsWith("w"))
                    .sorted()
                    .toList();
            result = wordsList.toArray(new String[0]);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
