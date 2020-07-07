/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magic
 */
public class Teclado extends Periferico implements DispositivoEntrada {
    
    private static int id = 0;    
    

    public Teclado(String marca,String modelo, float precio) {
        super(marca,modelo,precio);
        id ++;
    }    

}
