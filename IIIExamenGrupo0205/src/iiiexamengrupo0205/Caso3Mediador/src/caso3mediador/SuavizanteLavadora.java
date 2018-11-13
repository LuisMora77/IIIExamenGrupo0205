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
public class SuavizanteLavadora extends Lavadora {

    public SuavizanteLavadora(MediadorCiclo ciclo) {
        super(ciclo);
    }
    
     public void bastante(){
        System.out.println("Para este ciclo se utilizara una canitdad considerable de suavizante");
        ciclo.lavar();
    }
	     
    public void normal(){
        System.out.println("Para este ciclo se utilizara una cantidad normal de suavizante");
        ciclo.lavar();
    }
	   
    public void poco(){
        System.out.println("Para este ciclo se utilizara poca cantidad de suavizante");
        ciclo.lavar();
    }
    
}
