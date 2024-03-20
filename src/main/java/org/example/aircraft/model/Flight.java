package org.example.aircraft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Document(collection = "flight")
public class Flight {
    @Id
    private Long number;
    private List<WayPoint> wayPoints;
    private List<TemporaryPoint> passedPoints;
}
