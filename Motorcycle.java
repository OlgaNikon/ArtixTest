package ru.nikonova.artix;

public class Motorcycle implements Transport {
    private String name = "мотоцикл";
    private int maxCountWheels = 2;
    private double maxSpeed = 200.0;

    @Override
    public void getParameters() {
        System.out.println("Наименование транспорта: " + name + "\nКол-во колес: " + maxCountWheels +
                "\nМаксимальная скорость: " + maxSpeed);
    }

}
