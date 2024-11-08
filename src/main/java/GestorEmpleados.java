/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DPLPT90
 */
import java.util.ArrayList;

public class GestorEmpleados {
    // Lista para almacenar objetos de tipo Empleado
    private final ArrayList<Empleado> listaEmpleados;

    // Constructor
    public GestorEmpleados() {
        listaEmpleados = new ArrayList<>();
    }

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    // Método para mostrar los detalles de todos los empleados
    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : listaEmpleados) {
                empleado.mostrarInformacion();
            }
        }
    }
}
