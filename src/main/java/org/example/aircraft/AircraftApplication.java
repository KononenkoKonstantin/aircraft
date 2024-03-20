package org.example.aircraft;

import org.example.aircraft.model.Airplane;
import org.example.aircraft.model.AirplaneCharacteristics;
import org.example.aircraft.model.Flight;
import org.example.aircraft.model.TemporaryPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class AircraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(AircraftApplication.class, args);
    }

}
