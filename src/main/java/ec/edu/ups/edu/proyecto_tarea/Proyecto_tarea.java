/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.edu.proyecto_tarea;

import ec.edu.ups.edu.proyecto_tarea.Modelo.ColaTarea;
import ec.edu.ups.edu.proyecto_tarea.Modelo.PilaTareas;
import ec.edu.ups.edu.proyecto_tarea.Modelo.Tarea;

/**
 *
 * @author jf001
 */
public class Proyecto_tarea {

    public static void main(String[] args) {
        System.out.println("colas y pilas implementacion generica");
        
        
        ColaTarea<String> colaTareas = new ColaTarea<>();
        colaTareas.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTareas.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTareas.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTareas.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTareas.agregarTarea(new Tarea(5, "Tarea 5"));
        
        while(!colaTareas.estaVacia()){
        Tarea<String> tareaProcesadda = colaTareas.procesarTarea();
        System.out.println("proceso tarea de la cola: \n\t Sale->"+tareaProcesadda.getId());           
        }
         
        System.out.println("________________________________________________");
        
        ColaTarea<Integer> colaTareaInt = new ColaTarea<>();
        colaTareaInt.agregarTarea(new Tarea(10,10));
        colaTareaInt.agregarTarea(new Tarea(11,11));
        colaTareaInt.agregarTarea(new Tarea(12,12));
        
        while(!colaTareaInt.estaVacia()){
        Tarea<Integer> tareaProcesadda = colaTareaInt.procesarTarea();
        System.out.println("proceso tarea de la cola en int: \n\t Sale->"+tareaProcesadda.getId());           
        }
         
        System.out.println("_________________________________________________");
        ColaTarea<int[]>colaTareaArregloEnteros = new ColaTarea<>();
        Tarea<int[]> t2= new Tarea(29,new int[]{212,21,});
        colaTareaArregloEnteros.agregarTarea(t2);
        colaTareaArregloEnteros.agregarTarea(new Tarea(28,new int[]{215,25,}));
        colaTareaArregloEnteros.agregarTarea(new Tarea(23,new int[]{314,35}));
        
        while(!colaTareaArregloEnteros.estaVacia()){
        Tarea<int[]> tareaProcesadda = colaTareaArregloEnteros.procesarTarea();
        System.out.println("proceso tarea de la cola en int[]: \n\t Sale->"+tareaProcesadda.getId());           
        }
        
        System.out.println("______________________________________________________");
        ColaTarea<String[]>ColaTareaArregloString = new ColaTarea<>();
        ColaTareaArregloString.agregarTarea(new Tarea(10,"Tarea 45"));
        ColaTareaArregloString.agregarTarea(new Tarea(11,"Tarea 46"));
        ColaTareaArregloString.agregarTarea(new Tarea(12,"Tarea 47"));
       
 
        while(!ColaTareaArregloString.estaVacia()){
            Tarea<String[]> tareaProcesadda = ColaTareaArregloString.procesarTarea();
            System.out.println("proceso tarea de la cola en String: \n\t Sale->"+tareaProcesadda.getAtributo());           
        }
        
        
         
        System.out.println("_________________________________________________");
        
       PilaTareas<Integer> pilaTareas = new PilaTareas<>();
        pilaTareas.agregarTarea(new Tarea(6, 6));
        pilaTareas.agregarTarea(new Tarea(7, 7));
        pilaTareas.agregarTarea(new Tarea(8, 8));
        pilaTareas.agregarTarea(new Tarea(9, 9));
        
        
        while(!pilaTareas.estaVacia()){
        Tarea<Integer> tareaProcesadda = pilaTareas.procesarTarea();
        System.out.println("proceso tarea de la pila: \n\t Sale->"+tareaProcesadda.getId());           
        }

        System.out.println("__________________________________________________");
        PilaTareas<ColaTarea>pilaTareaDeColas = new PilaTareas<>();
        
        pilaTareaDeColas.agregarTarea(new Tarea(8,colaTareas));
        pilaTareaDeColas.agregarTarea(new Tarea(8, colaTareaArregloEnteros));
                  
        while(!pilaTareaDeColas.estaVacia()){
        Tarea<ColaTarea> tareaProcesadda = pilaTareaDeColas.procesarTarea();
        System.out.println("proceso tarea de la pila: \n\t Sale->"+tareaProcesadda.getAtributo());           
        }

    }
}
