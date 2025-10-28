package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        Car C = new Car();
        System.out.println("Tacómetro cero? " + C.isTachometerEqualToZero());

        C.start();
        C.start();


        C.stop();
        C.accelerate();
        C.stop();

        for (int i = 0; i < 15; i++) {
            C.accelerate();
        }

        for (int i = 0; i < 20; i++) {
            C.brake();
        }

        C.turnAngleOfWheels(20);
        C.turnAngleOfWheels(50);

        C.setReverse(true);
        C.accelerate();
        C.setReverse(true);

        C.showDetails();

    }
}