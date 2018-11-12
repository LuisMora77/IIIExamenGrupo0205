/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso4chainofresponsabilities;

/**
 *
 * @author Monserrath
 */
public class Archivo {
       private  String nombre;
       private  String tipo;
       private  String ruta;

    public Archivo(String nombre, String tipo, String ruta) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
       
       
}
