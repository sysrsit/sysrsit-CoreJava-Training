package com.sysrs.jobreadiness.corejava.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter; // Added import statement for FileWriter
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) { 

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            String content = "Hello, writing to a file!";
            writer.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
