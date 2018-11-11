/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0205.Caso1_Memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Caretaker {
    
    final List<CalcuMemento> mementos = new ArrayList<CalcuMemento>();
    
    public CalcuMemento getMemento(int index) //  este obtiene los mementos segun un indice
    {
        return mementos.get(index);
    }
    
    public void addMemento(CalcuMemento memento)
    {
        mementos.add(memento);
    }
}
