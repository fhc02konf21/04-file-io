package org.campus02.inputstreamreaderdemo;

import java.io.*;

public class DemoReadApp {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("D:\\temp\\demo-text.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        System.out.println(bufferedReader.readLine());


    }
}
