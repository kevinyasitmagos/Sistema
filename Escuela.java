public class Escuela {

    private Alumno[] alumnos = new Alumno[5];
    private int contador = 0;

    public void agregarAlumno(Alumno alumno) {
        if (contador < 5) {
            alumnos[contador] = alumno;
            contador++;
        } else {
            System.out.println("Limite alcanzado");
        }
    }

    public Alumno buscarAlumno(String matricula) {
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].getMatricula().equals(matricula)) {
                return alumnos[i];
            }
        }
        return null;
    }

    public void mostrarAlumnos() {
        for (int i = 0; i < contador; i++) {
            alumnos[i].mostrarAlumno();
        }
    }
}