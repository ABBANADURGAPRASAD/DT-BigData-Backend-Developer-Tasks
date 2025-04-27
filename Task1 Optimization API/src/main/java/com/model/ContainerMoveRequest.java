package com.model;

public class ContainerMoveRequest {
    private String sourceLocation;
    private String destinationLocation;

    // Getters and Setters
    public String getSourceLocation() {
        return sourceLocation;
    }
    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }
    public String getDestinationLocation() {
        return destinationLocation;
    }
    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
}
