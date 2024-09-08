package Viikko3v2.Model;

import java.util.Random;

public class WeatherStation extends Observable implements Runnable {


    int temperature;
    int minTemperature = -20;
    int maxTemperature = 40;
    Random rand = new Random();

    public WeatherStation() {
        temperature = rand.nextInt(30);
    }

    void changeTemperature() {

        int change = rand.nextBoolean() ? 1 : -1;

        temperature = Math.max(minTemperature, Math.min(maxTemperature, temperature + change));
        System.out.println("WeatherStation: Temperature changed to " + temperature + "°C");

        notifyObservers(temperature);
    }

    public void run(){
        try {
            while (true) {
                Thread.sleep((rand.nextInt(5) + 1) * 1000);  // Sleep for 1-5 seconds
                changeTemperature();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
