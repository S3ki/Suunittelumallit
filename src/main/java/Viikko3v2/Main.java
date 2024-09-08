package Viikko3v2;

import Viikko3v2.Model.Display;
import Viikko3v2.Model.Observer;
import Viikko3v2.Model.WeatherStation;

public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Observer simpleDisplay = new Display("simple");
        Observer detailedDisplay = new Display("detailed");
        Observer alertDisplay = new Display("alert");

        weatherStation.addObserver(simpleDisplay);
        weatherStation.addObserver(detailedDisplay);
        weatherStation.addObserver(alertDisplay);

        Thread weatherStationThread = new Thread(weatherStation);
        weatherStationThread.start();

        try {
            Thread.sleep(15000);
            System.out.println("\nRemoving the Alert Display...\n");
            weatherStation.removeObserver(alertDisplay);


            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
