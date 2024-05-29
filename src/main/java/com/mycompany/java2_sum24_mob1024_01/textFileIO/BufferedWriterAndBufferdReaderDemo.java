package com.mycompany.java2_sum24_mob1024_01.textFileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedWriterAndBufferdReaderDemo {

    public static void main(String[] args) throws IOException {

        // write
        BufferedWriter writer = new BufferedWriter(new FileWriter("text_file_2.txt"));

        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 11.5, 10));
        products.add(new Product("Product 2", 22.5, 20));
        products.add(new Product("Product 3", 33.5, 30));

        writer.write("Products:\n");
        for (Product product: products) {
            writer.write(product.toString());
            writer.newLine();
        }

        writer.close();

        // read
        BufferedReader reader = new BufferedReader(new FileReader("text_file_2.txt"));

        String text;
        while ((text = reader.readLine()) != null) {
            System.out.println(text);
        }

        reader.close();

    }
}
