package org.campus02.wiederholung;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OlympicGameDemo {
    public static void main(String[] args) throws IOException {
        OlympicMedal swim1 = new OlympicMedal("Australia", (byte)1, "swim");
        OlympicMedal swim2 = new OlympicMedal("USA", (byte)2, "swim");
        OlympicMedal swim3 = new OlympicMedal("Germany", (byte)3, "swim");

        OlympicMedal ski1 = new OlympicMedal("Austria", (byte)1, "ski-superg");
        OlympicMedal ski2 = new OlympicMedal("Austria", (byte)2, "ski-superg");
        OlympicMedal ski3 = new OlympicMedal("Germany", (byte)3, "ski-superg");

        ArrayList<OlympicMedal> listMedals = new ArrayList<>();
        listMedals.add(swim1);
        listMedals.add(swim2);
        listMedals.add(swim3);
        listMedals.add(ski1);
        listMedals.add(ski2);
        listMedals.add(ski3);

       /* FileOutputStream fos = new FileOutputStream("D:\\Temp\\medals.oly");
        ObjectOutputStream oos = new ObjectOutputStream(fos);*/
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Temp\\medals.oly"));
        oos.writeObject((Integer)listMedals.size());
        for(OlympicMedal om : listMedals) {
            oos.writeObject(om);
        }
        oos.writeObject(null);
        oos.flush();
        oos.close();
    }
}
