package com.example.solid.isp;

public class OfficeWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Trabajando en oficina...");
    }

    public void eat() {
        System.out.println("Hora de almuerzo...");
    }
}