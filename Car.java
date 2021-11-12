package ru.nikonova.artix;

public class Car implements Transport {
    private String name = "автомобиль";
    private int maxCountWheels = 4;
    private double maxSpeed = 150.0;

    @Override
    public void getParameters() {
        System.out.println("Наименование транспорта: " + name + "\nКол-во колес: " + maxCountWheels +
                "\nМаксимальная скорость: " + maxSpeed);
    }

}
