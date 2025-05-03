// package com.fastandfurious.reindeer.base.ui.view;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Map;
// import java.util.PriorityQueue;
// import java.util.Set;

// import com.fastandfurious.reindeer.DijkstraAlg.util.Graph;

// public class Dijkstra {
//     public static Map<String, Integer> findShortestDistances(Graph graph,String start,Map<String,String> previous){
//        Map<String, Integer> distances = new HashMap<>();
//        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.distance));
//        Set<String> visited = new HashSet<>();

//        for (String node : graph.getAdjList().keySet()){
//             distances.put(node,Integer.MAX_VALUE);
//        }
//        distances.put(start, 0);
//        queue.add(new Node(start,0));

//        while(!queue.isEmpty()) {
//         Node current = queue.poll();
//         if(visited.contains(current.name)) continue;
//         visited.add(current.name);

//         for (Graph.Edge edge : graph.getAdjList().get(current.name)) {
//             int newDist = distances.get(current.name) + edge.weight;
//             if (newDist < distances.get(edge.to)){
//                 distances.put(edge.to,newDist);
//                 previous.put(edge.to, current.name);
//                 queue.add(new Node(edge.to, newDist));
//             }
//         }
//        }
//        return distances;
//     }
//     public static List<String> getPath(Map<String,String> previous,String target){
//         List<String> path = new ArrayList<>();
//         for(String at = target; at != null; at = previous.get(at)){
//             path.add(at);
//         }
//         Collections.reverse(path);
//         return path;
//     }
//     static class Node{
//         String name;
//         int distance;

//         Node(String name,int distance){
//             this.name = name;
//             this.distance =distance;
//         }
//     }
// }
