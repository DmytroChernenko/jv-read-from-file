package core.basesyntax;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FileWork {
    public String[] readFromFile(String fileName) {
        //write your code here
        String[] result = new String[0];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String[] words = bufferedReader.lines()
                    .collect(Collectors.joining("\n"))
                    .split("\\W+");
            result = Arrays.stream(words)
                    .map(String::toLowerCase)
                    .filter(word -> word.startsWith("w"))
                    .sorted()
                    .toList()
                    .toArray(new String[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
