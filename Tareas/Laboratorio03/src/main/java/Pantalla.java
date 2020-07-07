/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magic
 */
public class Pantalla extends Periferico implements  DispositivoSalida {
     private int id = 0;
    public Pantalla(String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        id++;
    }
   
}
