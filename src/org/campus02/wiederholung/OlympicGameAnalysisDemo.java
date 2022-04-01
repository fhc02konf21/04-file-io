package org.campus02.wiederholung;

import java.io.*;

public class OlympicGameAnalysisDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("D:\\temp\\medals.oly");
        ObjectInputStream ois = new ObjectInputStream( new BufferedInputStream(fis));

        //try {
            OlympicMedal medal = null;
            Integer size = (Integer) ois.readObject();
            System.out.println("size = " + size);
            while ((medal = (OlympicMedal)ois.readObject()) != null) {
                System.out.println("medal = " + medal);
            }
            ois.close();
      /*  }
        catch(EOFException eofException) {
            System.out.println("Dateiende");
        }*/

    }
}
