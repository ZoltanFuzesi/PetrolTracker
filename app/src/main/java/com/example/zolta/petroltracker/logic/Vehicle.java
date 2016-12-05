package com.example.zolta.petroltracker.logic;

import com.example.zolta.petroltracker.services.Gps;

/**
 * Created by zolta on 29/11/2016.
 */

public class Vehicle {

    private Gps vgps;
    public Vehicle()
    {
        vgps = new Gps();
    }

    public String askGps()
    {
        return vgps.gpsLocation();
    }
}
