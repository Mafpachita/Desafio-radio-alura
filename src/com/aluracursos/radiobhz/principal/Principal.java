package com.aluracursos.radiobhz.principal;

import com.aluracursos.radiobhz.modelos.Cancion;
import com.aluracursos.radiobhz.modelos.MisFavoritos;
import com.aluracursos.radiobhz.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Tú");
        miCancion.setArtista("Kudai");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Maffpachita");
        miPodcast.setTitulo("Cafe.Mafe");

        // Canción
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();

        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();

        }
        // podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();

        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();

        }

        System.out.println("Total reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: "+ miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miPodcast);
        favoritos.adiciona(miCancion);
    }
}
