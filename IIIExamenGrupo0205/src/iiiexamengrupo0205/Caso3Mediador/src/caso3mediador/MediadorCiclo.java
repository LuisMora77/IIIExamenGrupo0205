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
public abstract class MediadorCiclo {
    protected BotonLavadora boton;
    protected CalentadorLavadora calentador;
    protected DetergenteLavadora detergente;
    protected EliResiduoLavadora eliResiduo;
    protected MotorLavadora motor;
    protected SuavizanteLavadora suavizante;
    protected TamborLavadora tambor;
    protected ValvulaLavadora valvula;

    public MediadorCiclo() {
    }

    public BotonLavadora getBoton() {
        return boton;
    }

    public CalentadorLavadora getCalentador() {
        return calentador;
    }

    public DetergenteLavadora getDetergente() {
        return detergente;
    }

    public EliResiduoLavadora getEliResiduo() {
        return eliResiduo;
    }

    public SuavizanteLavadora getSuavizante() {
        return suavizante;
    }

    public TamborLavadora getTambor() {
        return tambor;
    }

    public ValvulaLavadora getValvula() {
        return valvula;
    }

    public void setBoton(BotonLavadora boton) {
        this.boton = boton;
    }

    public void setCalentador(CalentadorLavadora calentador) {
        this.calentador = calentador;
    }

    public void setDetergente(DetergenteLavadora detergente) {
        this.detergente = detergente;
    }

    public void setEliResiduo(EliResiduoLavadora eliResiduo) {
        this.eliResiduo = eliResiduo;
    }

    public void setSuavizante(SuavizanteLavadora suavizante) {
        this.suavizante = suavizante;
    }

    public void setTambor(TamborLavadora tambor) {
        this.tambor = tambor;
    }

    public void setValvula(ValvulaLavadora valvula) {
        this.valvula = valvula;
    }
    
    
    public abstract void inicio();
    public abstract void lavar();
    public abstract void abrir();
    public abstract void cerrar();
    public abstract void encendido();
    public abstract void apagado();
    public abstract void cantidadRes();
    public abstract void cantidadDet();
    public abstract void cantidadSuav();
    public abstract void termina();
    public abstract boolean verTemp(int temp);
    
}
