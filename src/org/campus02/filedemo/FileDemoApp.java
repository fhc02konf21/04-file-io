package org.campus02.filedemo;

import java.io.File;
import java.io.InputStream;

public class FileDemoApp {
    public static void main(String[] args) {

        // D:\temp\sub-ordner\
        // /usr/home/temp/sub-ordner/

        File file = new File("D:\\temp\\sub-ordner\\dokumente\\");

        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.exists() = " + file.exists());


        if (file.isDirectory()) {

            File[] fileArray = file.listFiles();

            for (File f : fileArray) {
                System.out.println("f.getName() + \" \" + f.length() = " + f.getName() + " " + f.length());
            }
        }
        // Byte = KiloByte => / 1024 (!! / 1000)



    }


}
