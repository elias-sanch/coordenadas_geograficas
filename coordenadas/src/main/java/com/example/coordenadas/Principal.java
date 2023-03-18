package com.example.coordenadas;

public class Principal {
    public static void main (String[] argv) {
        GeoPunto p1, p2;
        p1 = new GeoPunto(-65.75306, -19.58361);
        p2 = new GeoPunto(-65.26274, -19.03332);

        System.out.println("Distancia entre p1 y p2: " + p1.distancia(p2));
    }
}
