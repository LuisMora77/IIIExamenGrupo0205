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
public class CicloAlgodon extends MediadorCiclo{    

    public CicloAlgodon() {
        this.boton = new BotonLavadora(this);
        this.tambor = new TamborLavadora(this);
        this.calentador = new CalentadorLavadora(this);
        this.motor = new MotorLavadora(this);
        this.eliResiduo = new EliResiduoLavadora(this);
        this.detergente = new DetergenteLavadora(this);
        this.suavizante = new SuavizanteLavadora(this);
        this.valvula = new ValvulaLavadora(this);
    }
    
    
    @Override
    public void inicio() {
        tambor.inicio();
    }

    @Override
    public void abrir() {
        valvula.abrir();
    }

    @Override
    public void cerrar() {
        valvula.cerrar();
    }

    @Override
    public void encendido() {
        calentador.encendido(40);
    }

    @Override
    public void apagado() {
        calentador.apagado();
    }

    
    @Override
    public boolean verTemp(int temp) {
        return calentador.veriTemp(temp);
    }

    @Override
    public void cantidadRes() {
        eliResiduo.poco();
    }
    
    @Override
    public void cantidadDet() {
        detergente.poco();
    }

    @Override
    public void cantidadSuav() {
        suavizante.poco();
    }
    
    @Override
    public void lavar() {
        motor.iniciarMotor();
    }

    @Override
    public void termina() {
        System.out.println("El proceso de lavado de ropa ha finalizado");
    }
}
