/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magic
 */
public class UnidadCentral {
    private static int id=0;
    private String marca;
    private String modelo;
    private float precio;

    public UnidadCentral(String marca,String modelo, float precio) {
        id ++;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
        
}
