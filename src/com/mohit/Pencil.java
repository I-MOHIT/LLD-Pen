package com.mohit;

import java.util.UUID;

public class Pencil implements Writable{
    private String Id;
    private Double thickness;

    public Pencil(Double thickness) {
        Id = UUID.randomUUID().toString();
        this.thickness = thickness;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    public void write(){
        System.out.println("Written by a pencil with Id " + this.Id + " and has thickness " + this.thickness + "\n");
    }
}
