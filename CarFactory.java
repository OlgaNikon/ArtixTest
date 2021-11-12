package ru.nikonova.artix;

public class CarFactory implements Factory {

    @Override
    public Transport createTransport() {
        return new Car();
    }

}
