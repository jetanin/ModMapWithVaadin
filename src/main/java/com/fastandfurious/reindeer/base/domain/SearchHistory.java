package com.fastandfurious.reindeer.base.domain;

import java.time.LocalDateTime;
import java.util.List;

public class SearchHistory {
    private String start;
    private List<String> waypoints;
    private int totalDistance;
    private List<String> fullPath;
    private LocalDateTime timestamp;

    public SearchHistory(String start, List<String> waypoints, int totalDistance, List<String> fullPath) {
        this.start = start;
        this.waypoints = waypoints;
        this.totalDistance = totalDistance;
        this.fullPath = fullPath;
        this.timestamp = LocalDateTime.now();
    }

    public String getStart() { return start; }
    public List<String> getWaypoints() { return waypoints; }
    public int getTotalDistance() { return totalDistance; }
    public List<String> getFullPath() { return fullPath; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
