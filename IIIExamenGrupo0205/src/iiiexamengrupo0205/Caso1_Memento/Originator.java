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
    private int contador; // Este contador almacena el numero de savepoints que ha registrado el sistema. Se inicializa en 1.
    private int ultimoSavePoint; // este se utiliza en la funcion deshacerUnPaso
    
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
    
    public Originator(Caretaker caretaker) {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.contador = 1;
        this.calcuCaretaker = caretaker;
        System.out.println("Calculadora iniciada, valores iniciales de las variables x, y, z = " + getX() + ", " + getY() +", " + getZ() + " respectivamente");
    }
    
    
    
    public void generarSavepoint(){ // Guarda en la lista del caretaker una "foto" del estado actual de la calcu.
    System.out.println("\nFuncion generarSavepoint:");
    System.out.println("Generando el savepoint numero " + getContador() + " con el estado actual de la calculadora...");
    calcuCaretaker.addMemento(new CalcuMemento(getX(),getY(),getZ(),getContador()));
    System.out.println("SAVEPOINT " + getContador() + " " + valoresActuales());
    ultimoSavePoint = contador;
    contador++;
    }
    
    
    public void deshacerUnPaso(){ //  Revierte el estado de la calculadora al estado anterior ARREGLAR
        System.out.println("\nFuncion deshacerUnPaso:");
        System.out.println("Revirtiendo calculadora a estado anterior...");
        if (calcuCaretaker.mementos.size() == 0){
            System.out.println("No hay SAVEPOINTS guardados aun. No es posible devolverse.");
        }
        else if(calcuCaretaker.mementos.size() == 1){
            System.out.println("Solo hay un SAVEPOINT guardado, por lo que no se puede revertir");
        }
        else{
            try{
        CalcuMemento pasoAnterior = calcuCaretaker.getMemento(ultimoSavePoint-2);//-2 ya que en la lista de mementos el indice inicia en 0 y se requiere el valor anterior al ultimo elemento del array.
        this.x = pasoAnterior.getX();
        this.y = pasoAnterior.getY();
        this.z = pasoAnterior.getZ();
        System.out.println("Pasos revertidos con exito " + valoresActuales());
        ultimoSavePoint--;
            }
            catch(IndexOutOfBoundsException io){
                System.out.println("Error. No hay mas SAVEPONITS guardados antes del actual.");
            
            }
                
            }
        
        }
    
    
    public void deshacerARequerido(int savepoint){ // Revierte al SAVEPOINT que el usuario desee
        System.out.println("\nFuncion deshacerARequerido:");
        System.out.println("Deshaciendo operaciones hasta el SAVEPOINT numero " + (savepoint) + "...");
        if (calcuCaretaker.mementos.size() == 0){
            System.out.println("No hay SAVEPOINTS guardados aun. No es posible devolverse.");
        }
        else if( savepoint > calcuCaretaker.mementos.size()){
            System.out.println("El numero de SAVEPOINT ingresado no es valido, por el momento hay " + calcuCaretaker.mementos.size() + " SAVEPOINTS registrados");
        }
        else{
        CalcuMemento pasoRequerido = calcuCaretaker.getMemento(savepoint-1); // savepoint-1 ya que para el usuario el SAVEPOINT 1 viene siendo el indice 0 del array.
        this.x = pasoRequerido.getX();
        this.y = pasoRequerido.getY();
        this.z = pasoRequerido.getZ();
        System.out.println("Pasos revertidos con exito " + valoresActuales());
        }
    }
    
    public void deshacerTodo(){ // Vuelve 0 todos los valores de las variables, sin tocar el contador.
    System.out.println("\nFuncion deshacerTodo:");
    System.out.println("Deshaciendo todos los calculos realizados...");
    this.x = 0;
    this.y = 0;
    this.z = 0;
    System.out.println(valoresActuales());
    }
    
    public String valoresActuales(){
        return("Valores actuales de x, y, z = " + getX() + ", " + getY() +", " + getZ() + " respectivamente");
    }
    
    
    
    
    
    
}
