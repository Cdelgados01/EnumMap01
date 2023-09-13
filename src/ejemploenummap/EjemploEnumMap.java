
package ejemploenummap;

import java.util.EnumMap;
import java.util.Map;

// Enum para representar los días de la semana
enum DiaSemana {
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
}

public class EjemploEnumMap {
    public static void main(String[] args) {
        // EnumMap para almacenar tareas diarias
        EnumMap<DiaSemana, String> tareasDiarias = new EnumMap<>(DiaSemana.class);

        // Agregar tareas/valores
        tareasDiarias.put(DiaSemana.LUNES, "Hacer compras");
        tareasDiarias.put(DiaSemana.MARTES, "Reunión de trabajo");
        tareasDiarias.put(DiaSemana.MIÉRCOLES, "Ir al gimnasio");

        // EnumMap con tareas para otros días
        EnumMap<DiaSemana, String> tareasnuevas = new EnumMap<>(DiaSemana.class);
        tareasnuevas.put(DiaSemana.JUEVES, "Estudiar");
        tareasnuevas.put(DiaSemana.VIERNES, "Lavar el auto");

       
        // EnumMap1
        System.out.println("EnumMap Tareas1:" + tareasDiarias);
        System.out.println("EnumMap Tareas2:" + tareasnuevas);
        
        // putAll para combinar los dos EnumMaps
        tareasDiarias.putAll(tareasnuevas);

        
        // Conjunto de entradas (entrySet) y mostrar las tareas
        System.out.println("\nTareas diarias:");
        for (Map.Entry<DiaSemana, String> entrada : tareasDiarias.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        
        
        /*
        // Obtener un conjunto de claves (keySet) y mostrar los días de la semana
        System.out.println("\nDías de la semana con tareas:");
        for (DiaSemana dia : tareasDiarias.keySet()) {
            System.out.println(dia);
        }

        // Obtener una colección de valores (values) y mostrar las tareas
        System.out.println("\nTareas:");
        for (String tarea : tareasDiarias.values()) {
            System.out.println(tarea);
        }

        // Obtener una tarea específica (get) para un día
        DiaSemana diaBuscado = DiaSemana.MIÉRCOLES;
        System.out.println("\nTarea para " + diaBuscado + ": " + tareasDiarias.get(diaBuscado));

        // Eliminar una tarea (remove) para un día
        DiaSemana diaEliminar = DiaSemana.JUEVES;
        tareasDiarias.remove(diaEliminar);
        System.out.println("\nTarea para " + diaEliminar + " eliminada.");

        // Reemplazar una tarea (replace) para un día
        DiaSemana diaReemplazar = DiaSemana.MIÉRCOLES;
        String nuevaTarea = "Ir al cine";
        tareasDiarias.replace(diaReemplazar, nuevaTarea);
        System.out.println("\nNueva tarea para " + diaReemplazar + ": " + tareasDiarias.get(diaReemplazar));
        /*
        /*
        System.out.println("\nTareas diarias:");
            for (Map.Entry<DiaSemana, String> entrada : tareasDiarias.entrySet()) {
        System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }*/
        /*tareasDiarias.clear();
        // Mostrar las tareas después de borrar
        System.out.println("\nTareas diarias después de borrar:");
            for (Map.Entry<DiaSemana, String> entrada : tareasDiarias.entrySet()) {
        System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        System.out.println("Tamaño del EnumMap: " + tareasDiarias.size());*/
        
    }
    
}
