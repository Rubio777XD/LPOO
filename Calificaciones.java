
import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
// Variables
        String nombre = "";
        float[] calificaciones = new float[5];
        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Nombre y calificaciones.");
            System.out.println("2. Ver calificaciones y promedio.");
            System.out.println("3. ver calificaciones y calificacion más baja.");

            System.out.println("4. Ver calificaciones y calificacion más alta.");

            System.out.println("5. Salir.");
            System.out.print("Selecciona una opción: ");
            opcion = leerDatos.nextInt();
            leerDatos.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = leerDatos.nextLine();
                    for (int i = 0; i < calificaciones.length; i++) {
                        System.out.print("Calificación #" + (i + 1) + ": ");

                        while (!leerDatos.hasNextFloat()) {
                            System.out.println("Error");

                            leerDatos.next();
                        }
                        calificaciones[i] = leerDatos.nextFloat();
                    }

                    leerDatos.nextLine();
                    break;
                case 2:
                    float suma = 0;
                    System.out.println("Calificaciones de " + nombre
                            + ":");

                    for (float calificacion : calificaciones) {
                        System.out.println(calificacion);
                        suma += calificacion;
                    }
                    float promedio = suma / calificaciones.length;
                    System.out.println("Promedio: " + promedio);
                    break;
                case 3:
                    float min = calificaciones[0];
                    System.out.println("Calificaciones de " + nombre
                            + ":");

                    for (float calificacion : calificaciones) {
                        System.out.println(calificacion);
                        if (calificacion < min) {
                            min = calificacion;
                        }
                    }
                    System.out.println("Calificacion mas baja: "
                            + min);

                    break;
                case 4:
                    float max = calificaciones[0];
                    System.out.println("Calificaciones de " + nombre
                            + ":");

                    for (float calificacion : calificaciones) {
                        System.out.println(calificacion);
                        if (calificacion > max) {
                            max = calificacion;
                        }
                    }
                    System.out.println("Calificacion mas alta: "
                            + max);

                    break;

                case 5:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Elige opcion valida");
                    break;
            }
        }
        leerDatos.close();
    }
}
