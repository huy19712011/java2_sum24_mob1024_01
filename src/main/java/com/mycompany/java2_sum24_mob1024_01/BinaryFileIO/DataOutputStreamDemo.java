package com.mycompany.java2_sum24_mob1024_01.BinaryFileIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        final int NUM = 5;

        DataOutputStream writer =
                new DataOutputStream(new FileOutputStream("data_file_output.dat"));

        writer.writeInt(NUM);
        for (int i = 0; i <= NUM; ++i) {
            writer.writeInt(i);
        }

        writer.writeUTF("Xin chào các bạn");

        writer.close();
    }
}
