package org.example.vehicle;

import lombok.Data;

import java.util.Locale;

@Data
public class Engine {

    private final String code;
    private final int power;
    private final double volume;

    private int timeToMaintenance;
    private String status;

    public boolean isWorking(){
        return timeToMaintenance > 0;
    }

    public String run(String command){
        if(isWorking()){
            return command.toUpperCase() + "_START";
        } else{
            return  "Maintenance";
        }
    }
}
