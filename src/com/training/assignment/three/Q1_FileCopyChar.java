package com.training.assignment.three;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Q1_FileCopyChar {

    public static void main(String[] args) {

        File source = new File("resources/sample.png");
        File dest   = new File("resources/sample_char_copy.jpg");

        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(dest)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            System.out.println("Character copy done.");
            System.out.println("Original Size: " + source.length());
            System.out.println("Copied Size  : " + dest.length());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
