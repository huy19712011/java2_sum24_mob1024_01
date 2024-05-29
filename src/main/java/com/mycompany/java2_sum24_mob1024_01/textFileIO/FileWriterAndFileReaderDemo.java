package com.mycompany.java2_sum24_mob1024_01.textFileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndFileReaderDemo {

    public static void main(String[] args) throws IOException {

        // Write
        FileWriter writer = new FileWriter(new File("textFile.txt"));

        writer.write("IO with text files\n");
        writer.write("This is the 1st line\n");
        writer.write("This is the 2nd line\n");
        writer.write("This is the 3rd line\n");

        writer.close();

        // read
        FileReader reader = new FileReader(new File("textFile.txt"));

        int ch = reader.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = reader.read();
        }

        reader.close();

    }

}
