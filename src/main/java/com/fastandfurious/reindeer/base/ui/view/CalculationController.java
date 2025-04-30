package com.fastandfurious.reindeer.base.ui.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculationController {

    public static class RequestData {
        public List<String> selectedValues;
        public int userInput;
    }

    @PostMapping("/calculate")
    public Map<String, Object> calculate(@RequestBody RequestData request) {
        int result = request.userInput * request.selectedValues.size();
        Map<String, Object> response = new HashMap<>();
        response.put("result", result);
        return response;
    }
}
