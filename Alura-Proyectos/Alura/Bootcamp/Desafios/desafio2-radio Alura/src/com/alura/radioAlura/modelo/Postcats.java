package com.alura.radioAlura.modelo;

public class Postcats extends Audio{

    private String presentador;

    private  String participante;

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >= 5000){
            return 9;
        }else {
            return 4;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }
}
