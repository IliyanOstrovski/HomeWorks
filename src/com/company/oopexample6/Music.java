package com.company.oopexample6;

import java.util.ArrayList;

public class Music {

    public static void main(String[] args) {
        ArrayList<Instrument> list = new ArrayList<>();

        Stringed stringed =  new Stringed();
        Wind wind = new Wind();
        WoodWind woodWind = new WoodWind();
        list.add(stringed);
        list.add(wind);
        list.add(woodWind);
        tuneAll(list);
    }


    public static void tune(Instrument instrument) {
        instrument.play();
    }

    public static void tuneAll(ArrayList<Instrument> instruments) {
       for (Instrument instrument : instruments) {
           tune(instrument);
       }
    }
}
