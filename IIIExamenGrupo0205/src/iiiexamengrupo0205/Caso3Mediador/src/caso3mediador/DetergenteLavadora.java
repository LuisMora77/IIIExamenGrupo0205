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

public class DetergenteLavadora extends Lavadora{

    public DetergenteLavadora(MediadorCiclo ciclo) {
        super(ciclo);
    }
    
    public void bastante(){
        System.out.println("Para este ciclo se utilizara bastante detergente");
        ciclo.cantidadSuav();
    }
	     
    public void normal(){
        System.out.println("Para este ciclo se utilizara una cantidad normal de detergente");
        ciclo.cantidadSuav();
    }
	   
    public void poco(){
        System.out.println("Para este ciclo se utilizara poca cantidad de detergente");
        ciclo.cantidadSuav();
    }
}
