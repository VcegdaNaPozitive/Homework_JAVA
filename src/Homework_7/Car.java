package Homework_7;

public class Car {
    protected String model;
    protected String colour;
    protected int weight;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(int weight) {
        if (weight > 0) this.weight = weight;
    }

    void info() {
        System.out.println("I`am car, model: " + model + ", colour: " + colour + ", weight: " + weight);
    }
}
