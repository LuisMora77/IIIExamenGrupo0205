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
public class TamborLavadora extends Lavadora {

    public TamborLavadora(MediadorCiclo ciclo) {
        super(ciclo);
    }
    
    public void inicio(){
        ciclo.abrir();
    }
     
    public void lavar(){
         ciclo.lavar();
    }
    
}
