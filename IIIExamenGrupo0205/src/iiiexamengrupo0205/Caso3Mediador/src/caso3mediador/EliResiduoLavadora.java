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
public class EliResiduoLavadora extends Lavadora{

    public EliResiduoLavadora(MediadorCiclo ciclo) {
        super(ciclo);
    }
    
    public void fuerte(){
        System.out.println("Para este ciclo se tratara la ropa de manera agresiva");
        ciclo.cantidadDet();
    }
	     
    public void normal(){
        System.out.println("Para este ciclo se tratara la ropa de una manera normal");
        ciclo.cantidadDet();
    }
	   
    public void poco(){
        System.out.println("Para este ciclo se tratara la ropa de una manera suave");
        ciclo.cantidadDet();
    }
}
