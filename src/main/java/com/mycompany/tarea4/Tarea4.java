/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea4;

/**
 *
 * @author DPLPT90
 */
import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GestorEmpleados gestor = new GestorEmpleados();
            
            boolean continuar = true;
            while (continuar) {
                System.out.println("1. Agregar empleado");
                System.out.println("2. Mostrar empleados");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                
                switch (opcion) {
                    case 1 -> {
                        // Agregar un nuevo empleado
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Edad: ");
                        int edad = scanner.nextInt();
                        System.out.print("Salario: ");
                        double salario = scanner.nextDouble();
                        
                        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
                        gestor.agregarEmpleado(nuevoEmpleado);
                    }
                    case 2 -> // Mostrar empleados
                        gestor.mostrarEmpleados();
                    case 3 -> // Salir del programa
                        continuar = false;
                    default -> System.out.println("Opcion no valida.");
                }
            }
        }
    }
}

