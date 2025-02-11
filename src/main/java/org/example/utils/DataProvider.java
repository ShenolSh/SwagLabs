package org.example.utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataProvider {
    private static final String PRODUCTS_CSV = "src/test/resources/products.csv";

    @org.testng.annotations.DataProvider(name = "productsList")
        public Object[][] getSortedTestData(){
        List<String> dataList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PRODUCTS_CSV))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                dataList.add(line.trim());
            }

        } catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Failed to read data from file: " + PRODUCTS_CSV, e);
        }
        Collections.sort((dataList));

        Object[][] data = new Object[dataList.size()][1];
        for (int i = 0; i < dataList.size(); i++){
            data[i][0] = dataList.get(i);
        }
        return data;
    }

}
