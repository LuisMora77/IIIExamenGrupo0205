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
public abstract class GestorAlmacenamiento {
    
    protected GestorAlmacenamiento siguienteGestor;
    protected String nombreGestor;

    public GestorAlmacenamiento() {

    }

    
    
    /*
    public GestorAlmacenamiento(String nombreGestor) {
        this.nombreGestor = nombreGestor;
    }

    public void setSiguienteGestor(GestorAlmacenamiento siguienteGestor) {
        this.siguienteGestor = siguienteGestor;
    }
    */
    
    public abstract void procesarArchivo(Archivo archivo);
    
}
