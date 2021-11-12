package ru.nikonova.artix;

public class MotorcycleFactory implements Factory {

    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }

}
