package fr.lernejo.prediction;

import java.util.ArrayList;

public class Temperature {
    public final String country;
    public final ArrayList<Temperatureday> temperature;


    public Temperature(String country) {
        this.country = country;
        this.temperature = new ArrayList<>();
    }

}
