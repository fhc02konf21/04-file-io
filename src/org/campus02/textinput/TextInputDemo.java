package org.campus02.textinput;

import java.io.*;

public class TextInputDemo {

    public static void main(String[] args) throws IOException {
        File f = new File("D:\\temp\\demo-text.txt");

        FileReader fr = new FileReader(f); // FileInputStream
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
