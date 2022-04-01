package org.campus02.wiederholung;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoApp {

    /*

    Wiederholung anhand von Live-Coding
	Eigenes Beispiel selbst codieren
	Einlesen von Text
	Schreiben von Text
	Exception-Handling verbessern
     */

    /*
        - Binäre Zugriff
        - Textuelle Zugriff (.csv, .xml)

        File (rechte Eigenschaften)
        InputStream
        FileInputStream
     */

                                            // checked Exception
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next(); // ENTER

        File file = new File("D:\\temp\\newfilefrominput.txt");
        //if (file.exists())
        FileOutputStream fos = new FileOutputStream(file);

        for(char c : inputString.toCharArray()) {
            fos.write(c);
        }
        fos.flush(); // !!
        fos.close();
    }
}
