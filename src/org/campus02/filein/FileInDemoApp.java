package org.campus02.filein;

import java.io.File;

public class FileInDemoApp {

    public static void main(String[] args) {
        File file = new File("D:\\temp\\sub-ordner\\dokumente\\er hörte leise.txt");
        long size = readPrintFile(file);

        System.out.println("size = " + size);
        
    }

    public static long readPrintFile(File f) {

        /*
        * Schreiben Sie ein Programm, welches von einer Datei alle Zeichen einließt und auf der Konsole ausgibt.
            Zählen Sie die Anzahl der eingelesenen Zeichen und geben Sie die Gesamtanzahl am Ende aus.
        *  */

        return 0;
    }
}
