package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor :
            this.sensors) {
            if (!sensor.isOn())
                return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        this.sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensors == null)
            throw new IllegalStateException("All sensors must be ON or sensors cannot be null");
        int total = 0;
        int size = this.sensors.size();
        for (Sensor sensor :
                this.sensors) {
            total += sensor.read();
        }
        int average = total/size;
        readings.add(average);
        return average;
    }
}
