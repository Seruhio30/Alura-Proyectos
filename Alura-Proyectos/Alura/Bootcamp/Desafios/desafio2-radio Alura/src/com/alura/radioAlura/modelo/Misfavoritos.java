package com.alura.radioAlura.modelo;

public class Misfavoritos {

    public void adicione(Audio audio){
        if (audio.getClasificacion() >=8){
            System.out.println(audio.getTitulo()+" Lo mejor del momento");

        }else {
            System.out.println(audio.getTitulo()+" Esta despegando hacia el exito de la semana.");
        }
    }
}
