package com.mycompany.java2_sum24_mob1024_01.BinaryFileIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {

    public static void main(String[] args) throws IOException {

        DataInputStream reader = new DataInputStream(new FileInputStream("data_file_output.dat"));

        int NUM = reader.readInt();
        System.out.println(NUM);

        for (int i =0; i <=NUM; ++i) {
            int n = reader.readInt();
            System.out.println(n);
        }

        System.out.println(reader.readUTF());

        reader.close();
    }
}
