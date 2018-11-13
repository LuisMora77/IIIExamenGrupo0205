/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso3mediador;

/**
 *
 * @author Monserrath
 */
public class BotonLavadora extends Lavadora {

    public BotonLavadora(MediadorCiclo ciclo) {
        super(ciclo);
    }
    
    public void press(){
        System.out.println("El boton ha sido presionado.");
        ciclo.inicio();
    }
    
}
