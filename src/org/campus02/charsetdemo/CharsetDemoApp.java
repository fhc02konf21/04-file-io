package org.campus02.charsetdemo;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharsetDemoApp {

    public static void main(String[] args) {

       try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("D:\\temp\\persons.txt"),
                        StandardCharsets.UTF_16BE))){

            String stringHelper = "";

            while ((stringHelper = br.readLine()) != null) {

                String[] columns = stringHelper.split(";");

                System.out.println("columns = " + columns.length);
                System.out.println("columns[0] = " + columns[0]);
                System.out.println("columns[1] = " + columns[1]);
                System.out.println("columns[2] = " + columns[2]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
