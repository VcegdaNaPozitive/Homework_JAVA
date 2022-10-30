package Homework_7;

public class Main {
    public static void main(String[] args) {
        electricCar car1 = new electricCar();
        car1.setModel("Tesla Model 3");
        car1.setColour("Black");
        car1.setWeight(2000);
        car1.setCharge(100);
        car1.info();

        petroCar car2 = new petroCar();
        car2.setModel("BMW M8");
        car2.setColour("White");
        car2.setWeight(3000);
        car2.setVolume(4);
        car2.info();
    }
}
