package com.sysrs.jobreadiness.corejava.iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author 
 *
 */
public class CharArrayStreamDemo {
    public static void main(String[] args) {
        char[] charBuffer = new char[1024];

        try (FileReader fr = new FileReader("input.txt");
             FileWriter fw = new FileWriter("output.txt")) {

            int charsRead;
            while ((charsRead = fr.read(charBuffer)) != -1) {
                fw.write(charBuffer, 0, charsRead);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
