package org.example.aircraft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Document(collection = "airplaneCharacteristics")
public class AirplaneCharacteristics {
    private int maxSpeed;
    private int maxAcceleration;
    private int rateOfAltitudeChange;
    private int rateOfCourseChange;
}
