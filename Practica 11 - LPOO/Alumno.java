public class Alumno {

    private String nombre;
    private String matricula;
    private double[] calificaciones = new double[7];
    private double promedio;


    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }


    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }


    public void calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        this.promedio = suma / calificaciones.length;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public double getPromedio() {
        return promedio;
    }
}