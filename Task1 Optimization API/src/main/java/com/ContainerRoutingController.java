package com;

import com.model.ContainerMoveRequest;
import com.model.ContainerMoveResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/containers")
public class ContainerRoutingController {

    @PostMapping("/move")
    public ContainerMoveResponse moveContainer(@RequestBody ContainerMoveRequest request) {
        String source = request.getSourceLocation();
        String destination = request.getDestinationLocation();

        // Dummy logic (you can call OptimizationService here if you want)
        String message = "Container moved from " + source + " to " + destination;

        return new ContainerMoveResponse(true, message);
    }
}
