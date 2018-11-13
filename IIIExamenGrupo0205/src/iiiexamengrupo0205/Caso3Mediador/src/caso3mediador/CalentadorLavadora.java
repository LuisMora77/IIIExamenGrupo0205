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
public class CalentadorLavadora extends Lavadora {

    public CalentadorLavadora(MediadorCiclo ciclo) {
        super(ciclo);
    }

    public void encendido(int temp){
        System.out.println("El calentador ha sido encendido");
        if(ciclo.verTemp(temp)){
            System.out.println("La temperatura establecida para el ciclo es:  "+temp);
            ciclo.apagado();
	}
    }

    public void apagado(){
        System.out.println("El calentador ha sido apagado");
        ciclo.cantidadRes();
    }
    
    
    public boolean veriTemp(int temperatura){
        System.out.println("La temperatura es: "+temperatura+" *C");
        return true;
    }
    
    
}
