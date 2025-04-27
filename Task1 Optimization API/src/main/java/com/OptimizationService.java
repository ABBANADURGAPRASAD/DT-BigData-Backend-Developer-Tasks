package com;

import org.springframework.stereotype.Service;

@Service
public class OptimizationService {

    public String optimizeRoute(String source, String destination) {
        // Dummy optimization logic
        return "Optimized route from " + source + " to " + destination;
    }
}
