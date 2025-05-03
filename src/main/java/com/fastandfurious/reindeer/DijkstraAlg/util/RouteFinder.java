// package com.fastandfurious.reindeer.DijkstraAlg.util;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// import com.fastandfurious.reindeer.DijkstraAlg.controller.PathFinderController;

// public class RouteFinder {
//     //keep result
//     public static class Result {
//         public List<String> path;
//         public int totalDistance;
//         public Result(List<String> path, int totalDistance){
//             this.path =path;
//             this.totalDistance = totalDistance;
//         }
//     }
//     public static Result findRoute(Graph graph,String start,List<String> waypoints, String end){
//         List<String> fullpath = new ArrayList<>();
//         int total = 0;
//         String current = start;
//         fullpath.add(current);

//         for (String wp : waypoints){
//             Map<String, String> previous = new HashMap<>();
//             Map<String, Integer> dist = PathFinderController.findShortestDistances(graph,current,previous);
//             List<String> partialPath = PathFinderController.getPath(previous, wp);

//             if(partialPath.size() > 1){
//                 partialPath.remove(0);
//                 fullpath.addAll(partialPath);
//             }
//             total += dist.getOrDefault(wp,Integer.MAX_VALUE);
//             current = wp;
//         }
//         Map<String,String> previous = new HashMap<>();
//         Map<String, Integer> finalDist = PathFinderController.findShortestDistances(graph,current,previous);
//         List<String> partialPath = PathFinderController.getPath(previous, end);

//         if(partialPath.size() > 1){
//             partialPath.remove(0);
//             fullpath.addAll(partialPath);
//         }
//         total += finalDist.getOrDefault(end,Integer.MAX_VALUE);

//         return new Result(fullpath,total);
//     }
// }
