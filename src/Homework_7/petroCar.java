package Homework_7;

public class petroCar extends Car {
    private int volume;

    public void setVolume(int volume) {
        if (volume > 0) this.volume = volume;
    }

    @Override
    void info() {
        System.out.println("I`am petrol car, model: " + model + ", colour: " + colour + ", weight: " + weight + ", volume: " + volume);
    }
}
