package com.example.solid.dip;

public class MySQLDatabase implements Database {
    public void saveOrder() {
        System.out.println("Guardando pedido en MySQL...");
    }
}
