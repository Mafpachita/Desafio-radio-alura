package com.aluracursos.radiobhz.modelos;

public class MisFavoritos {
   public void adiciona(Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Sigue en la lista de popularidad");
        }
    }
}
