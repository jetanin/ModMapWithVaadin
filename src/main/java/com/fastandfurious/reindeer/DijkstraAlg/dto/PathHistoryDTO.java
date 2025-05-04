package com.fastandfurious.reindeer.DijkstraAlg.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PathHistoryDTO {
    private Long id;
    private String startPoint;
    private List<String> destinations;
    private int totalDistance;
    private LocalDateTime timestamp;

    private List<String> waypointList;
    private List<String> path;          

    // Constructors
    public PathHistoryDTO() {}

    public PathHistoryDTO(Long id, String startPoint, List<String> destinations, int totalDistance, LocalDateTime timestamp) {
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

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<String> getWaypointList() {
        return waypointList;
    }

    public void setWaypointList(List<String> waypointList) {
        this.waypointList = waypointList;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }
}