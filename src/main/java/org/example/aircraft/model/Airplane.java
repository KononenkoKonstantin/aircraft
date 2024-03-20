package org.example.aircraft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.aircraft.model.routing.PlaneCalculation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Document(collection = "airplane")
public class Airplane {
    @Id
    private Long id;
    private AirplaneCharacteristics airplaneCharacteristics;
    private TemporaryPoint position;
    private List<Flight> flights;
}
