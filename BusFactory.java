package ru.nikonova.artix;

public class BusFactory implements Factory {

    @Override
    public Transport createTransport() {
        return new Bus();
    }

}
