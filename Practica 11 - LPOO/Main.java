import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {

            String archivoCSV = "C:\\Users\\pc gamer\\Desktop\\Practica 11 - LPOO\\proyecto.csv";
            List<String[]> datos = leerArchivoCSV(archivoCSV);
            

            Alumno alumno1 = new Alumno("Alumno 1", "A001");
            Alumno alumno2 = new Alumno("Alumno 2", "A002");
            Alumno alumno3 = new Alumno("Alumno 3", "A003");

            alumno1.setCalificaciones(convertirAEnteros(datos.get(0)));
            alumno2.setCalificaciones(convertirAEnteros(datos.get(1)));
            alumno3.setCalificaciones(convertirAEnteros(datos.get(2)));

            alumno1.calcularPromedio();
            alumno2.calcularPromedio();
            alumno3.calcularPromedio();


            mostrarDatosAlumno(alumno1);
            mostrarDatosAlumno(alumno2);
            mostrarDatosAlumno(alumno3);


            guardarDatosEnArchivo(alumno1);
            guardarDatosEnArchivo(alumno2);
            guardarDatosEnArchivo(alumno3);

            System.out.println("El archivo con la información ha sido generado.");

        } catch (IOException | NumberFormatException | Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static List<String[]> leerArchivoCSV(String archivo) throws IOException {
        List<String[]> datos = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(",");
                datos.add(valores);
            }
        }
        return datos;
    }

    public static double[] convertirAEnteros(String[] data) throws NumberFormatException {
        double[] calificaciones = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            calificaciones[i] = Double.parseDouble(data[i]);
        }
        return calificaciones;
    }


    public static void mostrarDatosAlumno(Alumno alumno) {
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Matrícula: " + alumno.getMatricula());
        System.out.print("Calificaciones: ");
        for (double calificacion : alumno.getCalificaciones()) {
            System.out.print(calificacion + " ");
        }
        System.out.println("\nPromedio: " + alumno.getPromedio() + "\n");
    }


    public static void guardarDatosEnArchivo(Alumno alumno) throws IOException {
        String nombreArchivo = "informacion_" + alumno.getMatricula() + ".txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write("Nombre: " + alumno.getNombre() + "\n");
            bw.write("Matrícula: " + alumno.getMatricula() + "\n");
            bw.write("Calificaciones: ");
            for (double calificacion : alumno.getCalificaciones()) {
                bw.write(calificacion + " ");
            }
            bw.write("\nPromedio: " + alumno.getPromedio() + "\n\n");
        }
    }
}
