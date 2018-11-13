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
public abstract class Lavadora {
    protected MediadorCiclo ciclo;

    public Lavadora(MediadorCiclo ciclo) {
        this.ciclo = ciclo;
    }

    public MediadorCiclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(MediadorCiclo ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
