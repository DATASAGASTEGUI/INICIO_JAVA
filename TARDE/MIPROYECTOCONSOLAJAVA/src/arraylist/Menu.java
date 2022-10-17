package arraylist;

import static entrada.Metodos.validarEntradaEntero;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    //BASE DE DATOS
    static List<Alumno> alumnos_al = new ArrayList<>();

    public static void main(String[] args) {

        alumnos_al.add(new Alumno("A1", "Luis", 16, 1.72));//0
        alumnos_al.add(new Alumno("A2", "Miguel", 21, 1.70));//1
        alumnos_al.add(new Alumno("A3", "Carlos", 20, 1.59));//2
        alumnos_al.add(new Alumno("A4", "María", 17, 1.71));//3

        do {

            cls();
            System.out.println("1. Mostrar");
            System.out.println("2. Buscar por su id");
            System.out.println("3. Eliminar por su id");
            System.out.println("4. Actualizar");
            System.out.println("0. Salir");

            int opcion = validarEntradaEntero("Ingrese opción? ");

            switch (opcion) {
                case 1:
                    mostrar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    actualizar();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static void mostrar() {
        cls();
        System.out.println("1. MOSTRAR");
        System.out.println("----------");
        Alumno.cabecera();
        for (Alumno a : alumnos_al) {
            a.cuerpo();
        }
        pause();
    }

    public static void buscar() {
        cls();
        System.out.println("2. BUSCAR");
        System.out.println("---------");
        Scanner sc = new Scanner(System.in);
        boolean bandera = false;
        System.out.print("Ingrese Id Alumno? ");
        String id = sc.next();
        for (Alumno a : alumnos_al) {
            if (a.getIdAlumno().equalsIgnoreCase(id)) {
                Alumno.cabecera();
                a.cuerpo();
                bandera = true;
            }
        }
        if (!bandera) {
            System.out.println("\nNo existe alumno con dicho id");
        }
        pause();
    }

    public static void eliminar() {
        cls();
        System.out.println("3. ELIMINAR");
        Scanner sc = new Scanner(System.in);
        boolean bandera = false;
        System.out.print("Ingrese Id Alumno? ");
        String id = sc.next();
        for(int i=0; i<alumnos_al.size(); i++) {
            Alumno a = alumnos_al.get(i);
            if(a.getIdAlumno().equalsIgnoreCase(id)) {
               alumnos_al.remove(i);
               System.out.println("\nAlumno eliminado");
               bandera = true;
            }
        }
        if(!bandera) {
           System.out.println("\nAlumno no existe con ese id");
        }
        pause();
    }

    public static void actualizar() {
        cls();
        System.out.println("1. ACTUALIZAR");
        pause();
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
