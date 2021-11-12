package ru.nikonova.artix;

public class ScooterFactory implements Factory {

    @Override
    public Transport createTransport() {
        return new Scooter();
    }

}
