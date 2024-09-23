package com.alura.radioAlura.modelo;

public class Cancion extends Audio{

    private String album;

    private String  cantante;

    private String genero;

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() > 2000){
            return  9;
        }else {
            return 2;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
