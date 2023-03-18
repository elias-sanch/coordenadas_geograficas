package com.example.coordenadas;

public class GeoPunto {
    private double longitud;
    private double latitud;

    public GeoPunto (double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    /**
     * Transcribe el GeoPunto a String
     * @return Un string con la longitud y latitud de un GeoPunto
     */
    public String toString () {
        return this.longitud + ", "  + this.latitud;
    }

    /**
     * Calcula la distancia geografica, en metros, a un punto indicado
     * @param punto El punto al cual se calcula la distancia
     */
    public double distancia (GeoPunto punto) {
        final double RADIO_TIERRA = 6371000; //En metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLog = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);

        double a = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.sin(dLog/2) * Math.sin(dLog/2) *
                Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        return c * RADIO_TIERRA;
    }

}
