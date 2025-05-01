package com.fastandfurious.reindeer.base.ui.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final Map<String,List<Edge>> adjList = new HashMap();
    
    public void addNode(String name){
        adjList.putIfAbsent(name, new ArrayList<>()); //เพิ่มNode ตัวที่ไม่ซั้า
    }

    public void addEdge(String from,String to,int weight){
        adjList.get(from).add(new Edge(to,weight)); //เพิ่มเส้นทางจากจุดเริ่มถึงจุดหมายเเละใส่ระยะทาง
    }

    public Map<String,List<Edge>> getAdjList() {
        return adjList;
    }

    public static class Edge{
        String to;
        int weight;

        public Edge(String to ,int weight){
            this.to = to;
            this.weight = weight;
        }
    }
}
