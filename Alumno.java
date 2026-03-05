public class Alumno {

    private String nombre;
    private String matricula;
    private double[] calificaciones = new double[3];

    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void setCalificacion(int i, double calificacion) {
        calificaciones[i] = calificacion;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += calificaciones[i];
        }
        return suma / 3;
    }

    public void mostrarAlumno() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("-------------");
    }

    public String getMatricula() {
        return matricula;
    }
}