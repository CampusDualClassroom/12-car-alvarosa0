package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
        this.brand = "Citroën";
        this.model = "Xsara";
        this.fuel = "Diesel";
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("Vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo. Primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED;
            }
            System.out.println("Velocidad: " + this.speedometer + " km/h");
        } else {
            System.out.println("No se puede superar la velocidad maxima: " + MAX_SPEED + " km/h");
        }
    }


    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
            System.out.println("Velocidad : " + this.speedometer + " km/h");
        } else {
            System.out.println("El coche ya está detenido");
        }
    }

    public void turnAngleOfWheels(int angle) {
            if (angle > 45) {
                this.wheelsAngle = 45;
            } else if (angle < -45) {
                this.wheelsAngle = -45;
            } else {
                this.wheelsAngle = angle;
            }
            System.out.println("Ángulo del volante: " + this.wheelsAngle + "º");
        }



    public String showSteeringWheelDetail() {
        return "Volante en " + this.wheelsAngle + " grados";
    }


    public boolean isReverse() {
        return this.reverse;
    }


    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";
                System.out.println("Coche en marcha atrás");
            } else {
                this.gear = "N";
                System.out.println("Coche en posición neutra");
            }
        } else {
            System.out.println("No se puede poner marcha atrás cuando el coche está en movimiento");
        }
    }


    public void showDetails() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Combustible: " + fuel);
        System.out.println("Velocidad: " + speedometer + " km/h");
        System.out.println("Tacometro: " + tachometer);
        System.out.println("Marcha: " + gear);
        System.out.println("Volante: " + wheelsAngle + "º");
        System.out.println("Reversa: " + reverse);
    }


    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }


    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }
    }
