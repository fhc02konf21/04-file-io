package org.campus02.objectoutputstream;

import java.io.*;

public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        String demoText = "Das ist ein Demo-Text. Schönen Abend";

        Car c = new Car("VW", "black");

        File f = new File("D:\\temp\\sub-ordner\\dokumente\\string.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(f); // wo => File
        BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream); // Buffered => optimierung
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();

    }
}
