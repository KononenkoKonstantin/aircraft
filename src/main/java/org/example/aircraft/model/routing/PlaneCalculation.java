package org.example.aircraft.model.routing;

import org.example.aircraft.model.Airplane;
import org.example.aircraft.model.AirplaneCharacteristics;
import org.example.aircraft.model.TemporaryPoint;
import org.example.aircraft.model.WayPoint;

import java.util.List;

public interface PlaneCalculation {
    List<TemporaryPoint> calculateRoute(AirplaneCharacteristics characteristics, List<WayPoint> wayPoints);
}
