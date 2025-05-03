package com.fastandfurious.reindeer.DijkstraAlg.controller;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fastandfurious.reindeer.DijkstraAlg.util.Graph;
import com.fastandfurious.reindeer.base.domain.SearchHistory;

@RestController
@RequestMapping("/api")
public class PathFinder {

    public static class RequestData {
        public String selectedStartPoint;
        public List<String> selectedValues;
    }

    private final Graph graph;
    private final List<SearchHistory> historyList = new ArrayList<>();

    public PathFinder() {
        this.graph = new Graph();
        // Add nodes
        for (String node : List.of(
                "N1", "N2", "N3", "N4", "N5", "N6", "N7", "N8", "N9", "N10",
                "N11", "N12", "N13", "N14", "N15", "N16", "N17", "N18", "N19", "N20",
                "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10",
                "S11", "S12", "S13", "S14", "S15")) {
            graph.addNode(node);
        }
        graph.addEdge("S6", "S7", 30);
        graph.addEdge("S6", "S5", 20);
        graph.addEdge("S7", "S5", 30);
        graph.addEdge("S7", "S4", 70);
        graph.addEdge("S5", "S4", 50);
        graph.addEdge("S7", "S8", 50);
        graph.addEdge("S8", "S4", 100);
        graph.addEdge("S8", "S10", 50);
        graph.addEdge("S10", "S4", 40);
        graph.addEdge("S8", "S9", 50);
        graph.addEdge("S10", "S11", 50);
        graph.addEdge("S9", "s11", 40);
        graph.addEdge("S4", "S11", 50);
        graph.addEdge("S11", "S15", 20);
        graph.addEdge("S4", "S15", 60);
        graph.addEdge("S9", "S12", 50);
        graph.addEdge("S11", "S12", 30);
        graph.addEdge("S15", "S12", 60);
        graph.addEdge("S13", "S12", 50);
        graph.addEdge("S13", "S14", 30);
        graph.addEdge("S5", "S3", 90);
        graph.addEdge("S4", "S3", 110);
        graph.addEdge("S3", "S2", 50);
        graph.addEdge("S2", "S1", 20);
        graph.addEdge("S4", "S1", 30);
        graph.addEdge("S14", "N14", 120);
        graph.addEdge("N14", "N13", 30);
        graph.addEdge("N14", "N12", 30);
        graph.addEdge("N15", "N13", 30);
        graph.addEdge("N15", "N12", 30);
        graph.addEdge("N14", "N15", 50);
        graph.addEdge("N15", "N20", 40);
        graph.addEdge("N19", "N20", 30);
        graph.addEdge("S14", "N20", 160);
        graph.addEdge("S15", "N19", 100);
        graph.addEdge("N18", "N19", 20);
        graph.addEdge("N18", "N20", 20);
        graph.addEdge("N20", "N17", 20);
        graph.addEdge("N15", "N17", 30);
        graph.addEdge("N18", "N17", 20);
        graph.addEdge("S4", "N18", 90);
        graph.addEdge("S4", "N17", 80);
        graph.addEdge("N17", "N16", 20);
        graph.addEdge("N16", "N15", 40);
        graph.addEdge("N16", "N11", 40);
        graph.addEdge("N11", "N15", 60);
        graph.addEdge("N11", "N13", 70);
        graph.addEdge("N11", "N12", 70);
        graph.addEdge("N11", "N10", 10);
        graph.addEdge("N16", "N10", 50);
        graph.addEdge("N4", "N10", 30);
        graph.addEdge("N10", "N5", 60);
        graph.addEdge("N4", "N5", 20);
        graph.addEdge("N5", "N6", 20);
        graph.addEdge("N6", "N7", 40);
        graph.addEdge("N4", "N7", 70);
        graph.addEdge("N3", "N7", 50);
        graph.addEdge("N3", "N4", 20);
        graph.addEdge("N16", "N2", 70);
        graph.addEdge("N2", "N4", 60);
        graph.addEdge("N2", "N3", 50);
        graph.addEdge("N2", "N1", 50);
        graph.addEdge("N1", "S1", 90);
        graph.addEdge("N1", "S4", 120);
        graph.addEdge("N5", "N9", 150);
        graph.addEdge("N7", "N9", 80);
        graph.addEdge("N7", "N8", 20);
        graph.addEdge("N8", "N9", 100);

        graph.addEdge("S7", "S6", 30);
        graph.addEdge("S5", "S6", 20);
        graph.addEdge("S5", "S7", 30);
        graph.addEdge("S4", "S7", 70);
        graph.addEdge("S4", "S5", 50);
        graph.addEdge("S8", "S7", 50);
        graph.addEdge("S4", "S8", 100);
        graph.addEdge("S10", "S8", 50);
        graph.addEdge("S4", "S10", 40);
        graph.addEdge("S9", "S8", 50);
        graph.addEdge("S11", "S10", 50);
        graph.addEdge("s11", "S9", 40);
        graph.addEdge("S11", "S4", 50);
        graph.addEdge("S15", "S11", 20);
        graph.addEdge("S15", "S4", 60);
        graph.addEdge("S12", "S9", 50);
        graph.addEdge("S12", "S11", 30);
        graph.addEdge("S12", "S15", 60);
        graph.addEdge("S12", "S13", 50);
        graph.addEdge("S14", "S13", 30);
        graph.addEdge("S3", "S5", 90);
        graph.addEdge("S3", "S4", 110);
        graph.addEdge("S2", "S3", 50);
        graph.addEdge("S1", "S2", 20);
        graph.addEdge("S1", "S4", 30);
        graph.addEdge("N14", "S14", 120);
        graph.addEdge("N13", "N14", 30);
        graph.addEdge("N12", "N14", 30);
        graph.addEdge("N13", "N15", 30);
        graph.addEdge("N12", "N15", 30);
        graph.addEdge("N15", "N14", 50);
        graph.addEdge("N20", "N15", 40);
        graph.addEdge("N20", "N19", 30);
        graph.addEdge("N20", "S14", 160);
        graph.addEdge("N19", "S15", 100);
        graph.addEdge("N18", "N19", 20);
        graph.addEdge("N20", "N18", 20);
        graph.addEdge("N17", "N20", 20);
        graph.addEdge("N17", "N15", 30);
        graph.addEdge("N17", "N18", 20);
        graph.addEdge("N18", "S4", 90);
        graph.addEdge("N17", "S4", 80);
        graph.addEdge("N16", "N17", 20);
        graph.addEdge("N15", "N16", 40);
        graph.addEdge("N11", "N16", 40);
        graph.addEdge("N15", "N11", 60);
        graph.addEdge("N13", "N11", 70);
        graph.addEdge("N12", "N11", 70);
        graph.addEdge("N10", "N11", 10);
        graph.addEdge("N10", "N16", 50);
        graph.addEdge("N10", "N4", 30);
        graph.addEdge("N5", "N10", 60);
        graph.addEdge("N5", "N4", 20);
        graph.addEdge("N6", "N5", 20);
        graph.addEdge("N7", "N6", 40);
        graph.addEdge("N7", "N4", 70);
        graph.addEdge("N7", "N3", 50);
        graph.addEdge("N4", "N3", 20);
        graph.addEdge("N2", "N16", 70);
        graph.addEdge("N4", "N2", 60);
        graph.addEdge("N3", "N2", 50);
        graph.addEdge("N1", "N2", 50);
        graph.addEdge("S1", "N1", 90);
        graph.addEdge("S4", "N1", 120);
        graph.addEdge("N9", "N5", 150);
        graph.addEdge("N9", "N7", 80);

    }

    // @PostMapping("/PathFinder")
    // public ResponseEntity<Map<String, Object>> calculate(@RequestBody RequestData request) {
    //     Map<String, Object> response = new HashMap<>();
    //     String start = request.selectedStartPoint;
    //     String end = request.selectedStartPoint;
    //     List<String> waypoints = request.selectedValues;

    //     try {
    //         RouteFinder.Result result = RouteFinder.findRoute(graph, start, waypoints, end);
    //         SearchHistory history = new SearchHistory(start, waypoints, result.totalDistance, result.path);
    //         historyList.add(history);

    //         response.put("status", "success");
    //         response.put("numVertices", result.path.size());
    //         response.put("totalDistance", result.totalDistance);
    //         response.put("path", result.path);
    //         return ResponseEntity.ok(response);
    //     } catch (Exception e) {
    //         response.put("status", "error");
    //         response.put("message", e.getMessage());
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    //     }
    // }
    @PostMapping("/PathFinder")
    public ResponseEntity<Map<String, Object>> calculate(@RequestBody RequestData request) {
        Map<String, Object> response = new HashMap<>();
        String start = request.selectedStartPoint;
        List<String> waypoints = request.selectedValues;
        String end = waypoints.get(waypoints.size() - 1);
        waypoints = waypoints.subList(0, waypoints.size() - 1);
    
        try {
            RouteFinder.Result result = RouteFinder.findRoute(graph, start, waypoints, end);
            SearchHistory history = new SearchHistory(start, waypoints, result.totalDistance, result.path);
            historyList.add(history);
        
            response.put("status", "success");
            response.put("numVertices", result.path.size());
            response.put("totalDistance", result.totalDistance);
            response.put("path", result.path);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/history")
    public List<SearchHistory> getHistory() {
        return historyList;
    }

    // =====================================
    // Dijkstra Algorithm Implementation
    // =====================================
    public static class Dijkstra {

        public static Map<String, Integer> findShortestDistances(Graph graph, String start, Map<String, String> previous) {
            Map<String, Integer> distances = new HashMap<>();
            PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.distance));
            Set<String> visited = new HashSet<>();

            for (String node : graph.getAdjList().keySet()) {
                distances.put(node, Integer.MAX_VALUE);
            }
            distances.put(start, 0);
            queue.add(new Node(start, 0));

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                if (visited.contains(current.name)) continue;
                visited.add(current.name);

                for (Graph.Edge edge : graph.getAdjList().get(current.name)) {
                    int newDist = distances.get(current.name) + edge.getWeight();
                    String destination = edge.getTo();
                    if (newDist < distances.get(destination)) {
                        distances.put(destination, newDist);
                        previous.put(destination, current.name);
                        queue.add(new Node(destination, newDist));
                    }

                }
            }
            return distances;
        }

        public static List<String> getPath(Map<String, String> previous, String target) {
            List<String> path = new ArrayList<>();
            for (String at = target; at != null; at = previous.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            return path;
        }

        static class Node {
            String name;
            int distance;

            Node(String name, int distance) {
                this.name = name;
                this.distance = distance;
            }
        }
    }

    // =====================================
    // RouteFinder Logic
    // =====================================
    public static class RouteFinder {
        public static class Result {
            public final List<String> path;
            public final int totalDistance;

            public Result(List<String> path, int totalDistance) {
                this.path = path;
                this.totalDistance = totalDistance;
            }
        }

        public static Result findRoute(Graph graph, String start, List<String> waypoints, String end) {
            List<String> allPoints = new ArrayList<>();
            allPoints.add(start);
            allPoints.addAll(waypoints);
            allPoints.add(end);

            List<String> fullPath = new ArrayList<>();
            int totalDistance = 0;

            for (int i = 0; i < allPoints.size() - 1; i++) {
                String from = allPoints.get(i);
                String to = allPoints.get(i + 1);
                Map<String, String> previous = new HashMap<>();
                Map<String, Integer> distances = Dijkstra.findShortestDistances(graph, from, previous);
                List<String> segment = Dijkstra.getPath(previous, to);

                if (segment.isEmpty()) {
                    throw new RuntimeException("No path found from " + from + " to " + to);
                }

                if (i > 0) segment.remove(0); // avoid duplicating nodes
                fullPath.addAll(segment);
                totalDistance += distances.get(to);
            }

            return new Result(fullPath, totalDistance);
        }
    }
}
