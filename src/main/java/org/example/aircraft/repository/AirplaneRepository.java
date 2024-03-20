package org.example.aircraft.repository;

import org.example.aircraft.model.Airplane;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirplaneRepository extends MongoRepository<Airplane, Long> {
}
