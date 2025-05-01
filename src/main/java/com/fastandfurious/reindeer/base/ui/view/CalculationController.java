package com.fastandfurious.reindeer.base.ui.view;

import java.util.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class CalculationController {

    public static class RequestData {
        // public String selectedStartPoint;
        public List<String> selectedValues;
    }

    @PostMapping("/calculate")
    public Map<String, Object> calculate(@RequestBody RequestData request) {
        Map<String, Object> response = new HashMap<>();
        try {
            int numVertices;
            numVertices = request.selectedValues.size() + 1;
            response.put("result", numVertices);
            response.put("status", "success");
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "An error occurred while processing the request.");
        }
        return response;
    }
}
