package org.campus02.readFromConsole;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFromConsoleApp {
    public static void main(String[] args) {
        File f = new File("D:\\temp\\sub-ordner\\dokumente\\console.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(f);

            int cFromConsole;
            while ((cFromConsole = System.in.read()) != 'x') {

                fileOutputStream.write(cFromConsole);
            }
            fileOutputStream.flush();
            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
