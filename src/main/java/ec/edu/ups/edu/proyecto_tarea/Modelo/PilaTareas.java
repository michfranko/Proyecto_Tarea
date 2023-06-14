/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.proyecto_tarea.Modelo;

import java.util.Stack;

/**
 *
 * @author jf001
 */
public class PilaTareas <T> {
    
    private Stack<Tarea<T>> pilaTareas;

    public PilaTareas() {
        pilaTareas = new Stack<>();
    }
public void  agregarTarea(Tarea<T> tarea){
    pilaTareas.push(tarea);
}    
public Tarea<T> procesarTarea(){
    Tarea<T>tareaProcedada = pilaTareas.pop();
    return tareaProcedada;
}

public boolean estaVacia(){
   return pilaTareas.isEmpty();
    
}
    
    
    
}
