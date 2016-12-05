package com.example.zolta.petroltracker.logic;

import com.example.zolta.petroltracker.services.Gps;

/**
 * Created by zolta on 29/11/2016.
 */

public class PetrolTracker {
    static private final PetrolTracker petroltracker = new PetrolTracker();
    private FillUp fill;
    private Driver drv;
    private Gps gps;
    private PetrolTracker()
    {
        fill = new FillUp();
        drv = new Driver();
        gps = new Gps();
    }
    public static PetrolTracker getInstance()
    {
        return petroltracker;
    }
    public String ans()
    {
        return "Ans from petrol tracker";
    }

    public String askDriver()
    {
        return drv.anskDriver();
    }

    public String askFill()
    {
        return fill.ansFromFill();
    }
     public String askGps()
     {
         return gps.gpsLocation();
     }
}
