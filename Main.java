package ru.nikonova.artix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int type = Integer.parseInt(bufferedReader.readLine());
        Transport transport;
        switch (type) {
            case 0: transport = new MotorcycleFactory().createTransport(); break;
            case 1: transport = new ScooterFactory().createTransport(); break;
            case 2: transport = new CarFactory().createTransport(); break;
            case 3: transport = new BusFactory().createTransport(); break;
            default:
                transport = null;
        }
        if (transport != null) {
            transport.getParameters();
        } else {
            System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
        }
    }

}
