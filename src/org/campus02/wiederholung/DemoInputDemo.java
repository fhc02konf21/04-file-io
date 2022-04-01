package org.campus02.wiederholung;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoInputDemo {
    public static void main(String[] args) {

        FileInputStream fis = null;
        BufferedInputStream bos = null;
        try {
            fis = new FileInputStream("D:\\temp\\newfilefrominput.txt");

            bos = new BufferedInputStream(fis);

            int byteRead = 0;
            while ((byteRead = bos.read()) != -1) {
                System.out.print((char) byteRead);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
