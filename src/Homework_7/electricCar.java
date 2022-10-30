package Homework_7;

public class electricCar extends Car {
    private int charge;

    public void setCharge(int charge) {
        if (charge > 0) this.charge = charge;
    }

    @Override
    void info() {
        System.out.println("I`am electric car, model: " + model + ", colour: " + colour + ", weight: " + weight + ", charge: " + charge);
    }
}
