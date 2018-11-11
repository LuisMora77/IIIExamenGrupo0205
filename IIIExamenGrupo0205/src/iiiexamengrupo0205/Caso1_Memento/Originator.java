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
public class Originator {
    
    private double x;
    private double y;
    private double z;
    Caretaker calcuCaretaker;
    private int contador;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public void setContador(int contador){
        this.contador = contador;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    public int getContador(){
        return contador;
    }
    
    public Originator(double x, double y, double z, Caretaker calcuCaretaker) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.calcuCaretaker = calcuCaretaker;
    }
    
    
    public void deshacerTodo(){ // borra todos los mementos almacenados 
    calcuCaretaker.mementos.clear();
    System.out.println("Se han eliminado todos los SAVEPOINTS del sistema");
    }
    
    public void deshacerUnPaso(){
    
    }
    
    public void generarSavepoint(){ // Guarda en la lista del caretaker una "foto" del estado actual de la calcu.
    calcuCaretaker.addMemento(new CalcuMemento(this.x,this.y,this.z, this.contador ));
    System.out.println("Guardado el estado actual de la calculadora ");
    
    }
    
}
