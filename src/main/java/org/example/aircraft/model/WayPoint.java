package org.example.aircraft.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "wayPoint")
public class WayPoint {
    private double latitude;
    private double longitude;
    private double flightAltitude;
    private double flightSpeed;
}
