public class Stat {
    private int value;
    private int grade;

    public Stat(int value) {
        this.value = value;

        if (value >= 0 && value < 50)
            this.grade = 0;
        else if (value >= 50 && value < 60)
            this.grade = 1;
        else if (value >= 60 && value < 70)
            this.grade = 2;
        else if (value >= 70 && value < 80)
            this.grade = 3;
        else if (value >= 80 && value < 90)
            this.grade = 4;
        else if (value >= 90 && value <= 100)
            this.grade = 5;
        else
            this.grade = -1;
    }

    public int getValue() {
        return this.value;
    }

    public int getGrade() {
        return this.grade;
    }
}
