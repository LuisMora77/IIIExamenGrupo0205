/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0205.Caso1_Memento;

/**
 *
 * @author Luis
 */
public class CalcuMemento {
    private double x;
    private double y;
    private double z;
    private int contador;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public int getContador() {
        return contador;
    }
    
    public CalcuMemento(double x, double y, double z, int contador) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.contador = contador;
    }
    
           
}
