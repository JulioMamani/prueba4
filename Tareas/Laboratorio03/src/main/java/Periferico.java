/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magic
 */
public abstract class Periferico {

    private float precio;
    private String marca;
    private String modelo;

    public Periferico( String marca, String modelo,float precio) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }


    public float getPrice() {
        return precio;
    }
}
