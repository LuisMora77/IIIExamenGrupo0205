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
public class MotorLavadora extends Lavadora{

    public MotorLavadora(MediadorCiclo ciclo) {
        super(ciclo);
    }
    
    public void iniciarMotor(){
        System.out.println("El motor va a comentar a funcionar");
        ciclo.termina();
    }
}
