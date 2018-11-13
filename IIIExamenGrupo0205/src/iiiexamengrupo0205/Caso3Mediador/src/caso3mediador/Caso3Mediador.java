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
public class Caso3Mediador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MediadorCiclo algodon = new CicloAlgodon();
        System.out.println("Ciclo de Ropa de algodon");
        algodon.getBoton().press();
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Ciclo de Jeans");
        MediadorCiclo jean = new CicloJean();
        jean.getBoton().press();
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Ciclo de ropa de Seda");
        MediadorCiclo seda = new CicloSeda();
        seda.getBoton().press();
    }
    
}
