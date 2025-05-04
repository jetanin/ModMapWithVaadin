package com.fastandfurious.reindeer.DijkstraAlg.service;

import com.fastandfurious.reindeer.DijkstraAlg.dto.PathHistoryDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {
    private final List<PathHistoryDTO> historyList = new ArrayList<>();
    private long counter = 1;

    public void saveHistory(String start, List<String> destinations, int distance) {
        PathHistoryDTO dto = new PathHistoryDTO();
        dto.setId(counter++);
        dto.setStartPoint(start);
        dto.setDestinations(destinations);
        dto.setTotalDistance(distance);
        dto.setTimestamp(LocalDateTime.now());
        historyList.add(dto);
    }

    public List<PathHistoryDTO> getAllHistory() {
        return historyList;
    }
}
