package org.campus02.filein;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInDemoApp {

    public static void main(String[] args) {
        File file = new File("D:\\temp\\sub-ordner\\dokumente\\er hörte leise.txt");
        long size = readPrintFile(file);

        System.out.println();
        System.out.println("size = " + size);
        
    }

    public static long readPrintFile(File f)  {

        /*
        * Schreiben Sie ein Programm, welches von einer Datei alle Zeichen einließt und auf der Konsole ausgibt.
            Zählen Sie die Anzahl der eingelesenen Zeichen und geben Sie die Gesamtanzahl am Ende aus.
        *  */
        long length = 0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);

            int byteRead = 0;
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
                length++;
            }
            // fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return length;
    }
}
