/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.proyecto_tarea.Modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jf001
 */
public class ColaTarea<T> {
    
    private Queue<Tarea<T>> ColaTareas;

    public ColaTarea() {
        ColaTareas = new LinkedList();
    }
    
    
public void  agregarTarea(Tarea<T> tarea){
    ColaTareas.offer(tarea);
}    
public Tarea<T> procesarTarea(){
    Tarea<T>tareaProcedada = ColaTareas.poll();
    return tareaProcedada;
}

public boolean estaVacia(){
   return ColaTareas.isEmpty();
    
}
    
    
    
    
}
