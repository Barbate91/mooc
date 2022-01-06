public class Fitbyte {
    private int age;
    private int rBPM;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.rBPM = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double mBPM = (206.3 - (0.711 * this.age));
        double tBPM = ((mBPM-this.rBPM) * (percentageOfMaximum) + this.rBPM);
        return tBPM;
    }
}
