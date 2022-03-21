package org.campus02.fileoutputdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputDemoApp {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\sub-ordner\\dokumente\\newfile3.txt");
        String demoText = "20:53 Hello World. Our first file123 987 ende - weiteres ende";

        try {
            FileOutputStream fos = new FileOutputStream(f);

            for (char c : demoText.toCharArray()){
                fos.write(c);
            }
            fos.flush();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
