package com.learn.binary.homework;

import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try (DataOutputStream outputStream =
                    new DataOutputStream(new FileOutputStream("test.dat"))) {
                outputStream.writeDouble(4.5);
                outputStream.writeDouble(43.25);
                outputStream.writeDouble(3.2);
            }

            try (DataInputStream inputStream =
                    new DataInputStream(new FileInputStream("test.dat"))) {
                while (true)
                    System.out.println(inputStream.readDouble());
            }
        }catch (EOFException ex) {
            System.out.println("All data were read");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
