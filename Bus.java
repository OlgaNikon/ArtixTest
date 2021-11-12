package ru.nikonova.artix;

public class Bus implements Transport {
    private String name = "автобус";
    private int maxCountWheels = 6;
    private double maxSpeed = 100.0;

    @Override
    public void getParameters() {
        System.out.println("Наименование транспорта: " + name + "\nКол-во колес: " + maxCountWheels +
                "\nМаксимальная скорость: " + maxSpeed);
    }

}
