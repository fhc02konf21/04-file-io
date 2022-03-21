package org.campus02.fileoutputdemo;

import java.io.*;
import java.util.Scanner;

public class FileOutputDemoApp {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\sub-ordner\\dokumente\\newfile3.txt");
        String demoText = "20:53 Hello World. Our first file123 987 ende - weiteres ende";

        try {
            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fos);

            for (char c : demoText.toCharArray()){
                bufferedOutputStream.write(c);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
