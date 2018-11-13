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
public class ValvulaLavadora extends Lavadora {

    public ValvulaLavadora(MediadorCiclo ciclo) {
        super(ciclo);
    }
    
    public void abrir(){
        System.out.println("La valvula para la entrada de agua, ha sido abierta");
	System.out.println("Llenando tambor");
        ciclo.cerrar();
        
    }
    
    public void cerrar(){
        System.out.println("La valvula para la entrada de agua, ha sido cerrada");
        ciclo.encendido();
    }
    
}
