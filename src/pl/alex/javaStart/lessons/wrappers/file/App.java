package pl.alex.javaStart.lessons.wrappers.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class App {
    public static void main(String[] args) throws IOException {
        String fileName = "file.txt";

        try (var fileReader = new FileReader(fileName);
             var bufferedReader = new BufferedReader(fileReader)) {
            String line;
            int sum = 0;
            BigInteger big1 = null;
            BigInteger big2 = null;
            int count = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (count < 4) {
                    sum += Integer.parseInt(line);
                    count++;
                    continue;
                }
                if (count == 4) {
                    big1 = new BigInteger(line);
                    count++;
                }
                big2 = new BigInteger(line);

            }
            System.out.println("Sum of first 3 lines: " + sum);
            if (big1 != null) {
                System.out.println("Sum of last 2 lines: " + big1.add(big2));
            }
        } catch (IOException e) {
            System.err.println("Error while reading the file " + fileName);
        }

    }
}
