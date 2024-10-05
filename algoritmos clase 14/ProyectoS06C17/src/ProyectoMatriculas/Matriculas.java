package ProyectoMatriculas;

import java.util.Scanner;

public class Matriculas {
    // Arreglos para almacenar nombres y edades de los estudiantes
    static String[] nombresInicial = new String[10];
    static int[] edadesInicial = new int[10];
    static int countInicial = 0; // Cuántos estudiantes hay en Inicial

    static String[] nombresPrimaria = new String[10];
    static int[] edadesPrimaria = new int[10];
    static int countPrimaria = 0; // Cuántos estudiantes hay en Primaria

    static String[] nombresSecundaria = new String[10];
    static int[] edadesSecundaria = new int[10];
    static int countSecundaria = 0; // Cuántos estudiantes hay en Secundaria

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        // Repetir hasta que el usuario elija salir
        while (opcion != 6) {
            mostrarMenu();
            opcion = leer.nextInt(); // Leer la opción del usuario

            // Llamar a la función según la opción elegida
            switch (opcion) {
                case 1:
                    matricularInicial(leer); // Matricular en Inicial
                    break;
                case 2:
                    matricularPrimaria(leer); // Matricular en Primaria
                    break;
                case 3:
                    matricularSecundaria(leer); // Matricular en Secundaria
                    break;
                case 4:
                    mostrarReporteGeneral(); // Mostrar todos los estudiantes
                    break;
                case 5:
                    mostrarReportePorNivel(leer); // Mostrar estudiantes por nivel
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        leer.close(); // Cerrar el Scanner cuando ya no se necesite
    }

    // Función que muestra el menú de opciones
    private static void mostrarMenu() {
        System.out.println("Colegio Certus");
        System.out.println("----------------");
        System.out.println("[1]: Matricular en Inicial");
        System.out.println("[2]: Matricular en Primaria");
        System.out.println("[3]: Matricular en Secundaria");
        System.out.println("[4]: Ver Reporte General");
        System.out.println("[5]: Ver Reporte por Nivel");
        System.out.println("[6]: Salir");
        System.out.print("Elige una opcion: ");
    }

    // Función para matricular estudiantes en Inicial
    private static void matricularInicial(Scanner leer) {
        if (countInicial < 10) { // Solo permitir hasta 10 estudiantes
            System.out.println("Matriculando en Inicial...");
            System.out.print("Ingresa el nombre del estudiante: ");
            nombresInicial[countInicial] = leer.next();
            System.out.print("Ingresa la edad del estudiante (3-5): ");
            edadesInicial[countInicial] = leer.nextInt();
            System.out.println("Estudiante matriculado en Inicial con éxito.");
            countInicial++; // Aumentar el contador de estudiantes
        } else {
            System.out.println("No hay más espacio en Inicial.");
        }
    }

    // Función para matricular estudiantes en Primaria
    private static void matricularPrimaria(Scanner leer) {
        if (countPrimaria < 10) { // Solo permitir hasta 10 estudiantes
            System.out.println("Matriculando en Primaria...");
            System.out.print("Ingresa el nombre del estudiante: ");
            nombresPrimaria[countPrimaria] = leer.next();
            System.out.print("Ingresa la edad del estudiante (6-12): ");
            edadesPrimaria[countPrimaria] = leer.nextInt();
            System.out.println("Estudiante matriculado en Primaria con éxito.");
            countPrimaria++; // Aumentar el contador de estudiantes
        } else {
            System.out.println("No hay más espacio en Primaria.");
        }
    }

    // Función para matricular estudiantes en Secundaria
    private static void matricularSecundaria(Scanner leer) {
        if (countSecundaria < 10) { // Solo permitir hasta 10 estudiantes
            System.out.println("Matriculando en Secundaria...");
            System.out.print("Ingresa el nombre del estudiante: ");
            nombresSecundaria[countSecundaria] = leer.next();
            System.out.print("Ingresa la edad del estudiante (13-17): ");
            edadesSecundaria[countSecundaria] = leer.nextInt();
            System.out.println("Estudiante matriculado en Secundaria con éxito.");
            countSecundaria++; // Aumentar el contador de estudiantes
        } else {
            System.out.println("No hay más espacio en Secundaria.");
        }
    }

    // Función para mostrar el reporte general de todos los niveles
    private static void mostrarReporteGeneral() {
        System.out.println("Reporte General de Matriculados");
        System.out.println("Nivel Inicial:");
        mostrarEstudiantes(nombresInicial, edadesInicial, countInicial);
        System.out.println("Nivel Primaria:");
        mostrarEstudiantes(nombresPrimaria, edadesPrimaria, countPrimaria);
        System.out.println("Nivel Secundaria:");
        mostrarEstudiantes(nombresSecundaria, edadesSecundaria, countSecundaria);
    }

    // Función para mostrar el reporte por nivel
    private static void mostrarReportePorNivel(Scanner leer) {
        System.out.println("Elige el nivel para ver el reporte:");
        System.out.println("[1]: Inicial");
        System.out.println("[2]: Primaria");
        System.out.println("[3]: Secundaria");
        int nivel = leer.nextInt();

        switch (nivel) {
            case 1:
                System.out.println("Reporte de Nivel Inicial");
                mostrarEstudiantes(nombresInicial, edadesInicial, countInicial);
                break;
            case 2:
                System.out.println("Reporte de Nivel Primaria");
                mostrarEstudiantes(nombresPrimaria, edadesPrimaria, countPrimaria);
                break;
            case 3:
                System.out.println("Reporte de Nivel Secundaria");
                mostrarEstudiantes(nombresSecundaria, edadesSecundaria, countSecundaria);
                break;
            default:
                System.out.println("Nivel no válido.");
        }
    }

    // Función que muestra los estudiantes de un nivel
    private static void mostrarEstudiantes(String[] nombres, int[] edades, int count) {
        if (count == 0) {
            System.out.println("No hay estudiantes matriculados.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + nombres[i] + " - " + edades[i] + " años");
            }
        }
    }
}
