/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magic
 */
public class Impresora extends Periferico implements DispositivoSalida {
    private static int id = 0;

    public Impresora(String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        id++;
    }
    

}
