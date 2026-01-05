package com.learn.binary.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args)throws IOException {
        try (
            FileOutputStream outputStream = new FileOutputStream("temp.dat");
        ) {
            for (int i = 1; i <= 10; i++)
                outputStream.write(i);
        }

        try (
                FileInputStream inputStream = new FileInputStream("temp.dat");
                ) {
            int value;
            while ((value = inputStream.read()) != -1)
                System.out.println(value + " ");
        }
    }
}
