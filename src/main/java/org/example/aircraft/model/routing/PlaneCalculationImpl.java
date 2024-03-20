package org.example.aircraft.model.routing;

import org.example.aircraft.model.Airplane;
import org.example.aircraft.model.AirplaneCharacteristics;
import org.example.aircraft.model.TemporaryPoint;
import org.example.aircraft.model.WayPoint;

import java.util.ArrayList;
import java.util.List;

public class PlaneCalculationImpl implements PlaneCalculation{
    @Override
    public List<TemporaryPoint> calculateRoute(AirplaneCharacteristics characteristics, List<WayPoint> wayPoints) {
        List<TemporaryPoint> flightRoute = new ArrayList<>();

        for (int i = 1; i < wayPoints.size() - 1; i++) {
            WayPoint currentWaypoint = wayPoints.get(i);
            WayPoint nextWaypoint = wayPoints.get(i + 1);

            double distance = calculateDistance(currentWaypoint, nextWaypoint);

            // Calculate the number of TemporaryPoints based on the speed and distance between points
            int numberOfPoints = calculateNumberOfPoints(distance, characteristics.getMaxSpeed());

            // Calculate the parameters for each TemporaryPoint and add it to the flightRoute
            for (int j = 0; j < numberOfPoints; j++) {
                double ratio = (double) (j + 1) / numberOfPoints;
                TemporaryPoint temporaryPoint = calculateTemporaryPoint(currentWaypoint, nextWaypoint, ratio);
                flightRoute.add(temporaryPoint);
            }
        }

        return flightRoute;
    }

    private double calculateDistance(WayPoint point1, WayPoint point2) {
        return Math.sqrt(Math.pow(point1.getLatitude() - point2.getLatitude(), 2) +
                Math.pow(point2.getLongitude() - point1.getLongitude(), 2) +
                Math.pow(point2.getFlightAltitude() - point1.getFlightAltitude(), 2));
    }

    private int calculateNumberOfPoints(double distance, int maxSpeed) {
        return (int) distance / maxSpeed;
    }

    private TemporaryPoint calculateTemporaryPoint(WayPoint point1, WayPoint point2, double ratio) {
        TemporaryPoint temporaryPoint = new TemporaryPoint();

        double latitude = (1 - ratio) * point1.getLatitude() + ratio * point2.getLatitude();
        double longitude = (1 - ratio) * point1.getLongitude() + ratio * point2.getLongitude();
        double flightAltitude = (1 - ratio) * point1.getFlightAltitude() + ratio * point2.getFlightAltitude();
        double flightSpeed = (1 - ratio) * point1.getFlightSpeed() + ratio * point2.getFlightSpeed();

        temporaryPoint.setLatitude(latitude);
        temporaryPoint.setLongitude(longitude);
        temporaryPoint.setFlightAltitude(flightAltitude);
        temporaryPoint.setFlightSpeed(flightSpeed);

        double courseInDegrees = calculateCourseInDegrees(point1, point2);
        temporaryPoint.setCourseInDegrees(courseInDegrees);

        return temporaryPoint;
    }

    private double calculateCourseInDegrees(WayPoint point1, WayPoint point2) {
        // TODO Add implementation to calculation course

        return 0.0;
    }
}
