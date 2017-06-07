package com.crcr.listagatos.pojo;

/**
 * Created by Criro on 27/05/2017.
 */

public class Gato {

    private String nombre;
    private int foto;
    private String puntuacion;

    public Gato(int foto, String nombre, String puntuacion){

        this.foto = foto;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }
}
