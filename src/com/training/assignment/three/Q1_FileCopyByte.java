package com.training.assignment.three;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Q1_FileCopyByte {

    public static void main(String[] args) {

        File source = new File("resources/sample.png");
        File dest   = new File("resources/sample_byte_copy.jpg");

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            System.out.println("Byte copy done.");
            System.out.println("Original Size: " + source.length());
            System.out.println("Copied Size  : " + dest.length());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
