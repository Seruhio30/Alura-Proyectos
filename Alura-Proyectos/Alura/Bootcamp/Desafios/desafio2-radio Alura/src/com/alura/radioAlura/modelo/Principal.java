package com.alura.radioAlura.modelo;

public class Principal  {

    public static void main(String[] args) {

        Cancion cancion = new Cancion();
        cancion.setTitulo("forever");
        cancion.setCantante("KISS");
        cancion.setAlbum("KISS");
        cancion.setGenero("Rock");

        Postcats mipostcats = new Postcats();
        mipostcats.setTitulo("cafeteando");
        mipostcats.setPresentador("Sergio");
        mipostcats.setParticipante("cafe tacuba");

        for (int i = 0; i < 300; i++) {
            mipostcats.reproducir();
        }

        for (int i = 0; i < 8000; i++) {
            mipostcats.meGusta();

        }

        for (int i = 0; i < 300; i++) {
            cancion.reproducir();
        }

        for (int i = 0; i < 5000; i++) {
            cancion.meGusta();

        }

        System.out.println("Total de reproducciones " +cancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta "+cancion.getTotalDeMegusta());
        System.out.println("--------------------------------");

        Misfavoritos misfavoritos = new Misfavoritos();
        misfavoritos.adicione(mipostcats);
        misfavoritos.adicione(cancion);


    }
}
