package org.campus02.wiederholung;

/*
        OlympicMedal swim1 = new OlympicMedal("Australia", (byte)1, "swim");
        OlympicMedal swim2 = new OlympicMedal("USA", (byte)2, "swim");
        OlympicMedal swim3 = new OlympicMedal("Germany", (byte)3, "swim");

        OlympicMedal ski1 = new OlympicMedal("Austria", (byte)1, "ski-superg");
        OlympicMedal ski2 = new OlympicMedal("Austria", (byte)2, "ski-superg");
        OlympicMedal ski3 = new OlympicMedal("Germany", (byte)3, "ski-superg");
 */

import java.io.Serializable;

public class OlympicMedal implements Serializable {
    private String nation;
    private byte medalType; // 1 ... gold, 2 ... silver, 3 ... bronze
    private String discipline;

    public OlympicMedal(String nation, byte medalType, String discipline) {
        this.nation = nation;
        this.medalType = medalType;
        this.discipline = discipline;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public byte getMedalType() {
        return medalType;
    }

    public void setMedalType(byte medalType) {
        this.medalType = medalType;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "OlympicMedal{" +
                "nation='" + nation + '\'' +
                ", medalType=" + medalType +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}
