package com.example.vehicles.exeptions;

import jakarta.xml.ws.WebFault;

@WebFault(name = "storageServiceRequestFailed")
public class MySoapExeption extends Exception {
    public MySoapExeption(String message) {
        super(message);
    }

    public MySoapExeption() {
        super("MySOAPExep403");
    }

    @Override
    public String toString() {
        return "StorageServiceRequestException;" + getMessage();
    }
}