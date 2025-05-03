package com.fastandfurious.reindeer.DijkstraAlg.dto;

import java.util.List;

public class RequestData {
    private String selectedStartPoint;
    private List<String> selectedValues;

    public String getSelectedStartPoint() {
        return selectedStartPoint;
    }

    public void setSelectedStartPoint(String selectedStartPoint) {
        this.selectedStartPoint = selectedStartPoint;
    }

    public List<String> getSelectedValues() {
        return selectedValues;
    }

    public void setSelectedValues(List<String> selectedValues) {
        this.selectedValues = selectedValues;
    }
}
