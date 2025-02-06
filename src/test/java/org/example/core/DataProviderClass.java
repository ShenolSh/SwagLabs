package org.example.core;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataProviderClass {
    @DataProvider
    public Object[][] testData() throws IOException {
        return getTestData("src/test/resources/products.csv");
    }

    public String[][] getTestData(String fileName) throws IOException {
        List<String[]> records = new ArrayList<>();
        String line;

        BufferedReader file = new BufferedReader(new FileReader(fileName));
        line = file.readLine();

        while (line != null) {
            String[] fields = line.split(",");
            records.add(fields);
            line = file.readLine();
        }

        file.close();

        return records.toArray(new String[records.size()][]);
    }
}
