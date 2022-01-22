import java.util.ArrayList;

public class Bird {
    private String nameCommon;
    private String nameLatin;
    private int observations = 0;

    public Bird(String common, String latin) {
        this.nameCommon = common;
        this.nameLatin = latin;
    }

    public void addObservation() {
        this.observations++;
    }

    public String getNameCommon() {
        return this.nameCommon;
    }

    public String toString() {
        return this.nameCommon + " (" + this.nameLatin + "): " + this.observations + " observations";
    }
}
