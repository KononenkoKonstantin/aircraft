package org.example.aircraft.service;

import org.example.aircraft.model.Airplane;
import org.example.aircraft.repository.AirplaneRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlightRouteService {
    private final AirplaneRepository airplaneRepository;

    public FlightRouteService(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    public void save(Airplane airplane) {
        airplaneRepository.save(airplane);
    }
    public Airplane getById(Long id) {
        return airplaneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Can not find Airplane with id: " + id));
    }
}
