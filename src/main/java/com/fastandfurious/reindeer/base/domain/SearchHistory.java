package com.fastandfurious.reindeer.base.domain;

// import java.time.LocalDateTime;
import java.util.List;

public class SearchHistory {
    private String startPoint;
    private List<String> waypointList;
    private int totalDistance;
    private List<String> path;
    // private LocalDateTime timestamp;

    public SearchHistory(String startPoint, List<String> waypointList, int totalDistance, List<String> path) {
        this.startPoint = startPoint;
        this.waypointList = waypointList;
        this.totalDistance = totalDistance;
        this.path = path;
    }

    public String getStart() { return startPoint; }
    public List<String> getWaypoints() { return waypointList; }
    public int getTotalDistance() { return totalDistance; }
    public List<String> getFullPath() { return path; }
    // public LocalDateTime getTimestamp() { return timestamp; }
}
