package ru.nikonova.artix;

public class Scooter implements Transport {
    private String name = "самокат";
    private int maxCountWheels = 2;
    private double maxSpeed = 30.0;

    @Override
    public void getParameters() {
        System.out.println("Наименование транспорта: " + name + "\nКол-во колес: " + maxCountWheels +
                "\nМаксимальная скорость: " + maxSpeed);
    }

}
