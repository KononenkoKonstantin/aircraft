package org.example.aircraft.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "temporaryPoint")
public class TemporaryPoint extends WayPoint {
    private double courseInDegrees;
    public TemporaryPoint(double latitude, double longitude, double flightAltitude,
                          double flightSpeed, double courseInDegrees) {
        super(latitude, longitude, flightAltitude, flightSpeed);
        this.courseInDegrees = courseInDegrees;
    }

}
