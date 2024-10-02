/*
* File: Main.java
* Author: Ritzl Bence
* Copyright: 2024, Ritzl Bence
* Group: Szoft II/1/N
* Date: 2024-10-02
* Github: https://github.com/BenceRitzl99/
* Licenc: GNU GPL
*/


package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hálózat elérése");

        Network network = new Network();
        network.connectToNetwork("Hálózat");
        network.disconnectFromNetwork();
        
        
        
    }
}