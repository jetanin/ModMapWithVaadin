package com.fastandfurious.reindeer.DijkstraAlg.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PathHistoryDTO {
    private Long id;
    private String startPoint;
    private List<String> destinations;
    private double totalDistance;
    private LocalDateTime timestamp;

    // Constructors
    public PathHistoryDTO() {}

    public PathHistoryDTO(Long id, String startPoint, List<String> destinations, double totalDistance, LocalDateTime timestamp) {
        this.id = id;
        this.startPoint = startPoint;
        this.destinations = destinations;
        this.totalDistance = totalDistance;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public List<String> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<String> destinations) {
        this.destinations = destinations;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}