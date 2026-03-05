public class Main{
    public static void main (String [] args){
        
        PedirDato pedir = new PedirDato();
        Escuela escuela = new Escuela();

        int opcion;

        do {
            System.out.println("1) Registrar Alumno");
            System.out.println("2) Buscar Alumno");
            System.out.println("3) Mostrar Alumnos");
            System.out.println("4) Salir");

            opcion = pedir.pedirEntero("Opcion", 1, 4);

            switch (opcion){

            case 1:
                String nombre = pedir.pedirCadena("Nombre");
                String matricula = pedir.pedirCadena("Matricula");

                    Alumno alumno = new Alumno(nombre, matricula);
                    for (int i = 0; i < 3; i++) {
                        double calificacion = pedir.pedirDecimal(
                                "Calificacion " + (i + 1), 0, 10);
                        alumno.setCalificacion(i, calificacion);
                    }

                    escuela.agregarAlumno(alumno);
            break;
            case 2:
                String mat = pedir.pedirCadena("Buscar por matricula");
                
                Alumno buscar = escuela.buscarAlumno(mat);

                if (buscar != null) {
                buscar.mostrarAlumno();
                } else {
                System.out.println("Matricula inexistente");
                }
            break;
            case 3:
                  escuela.mostrarAlumnos();
            break;
            case 4:
                System.out.println("Saliendo...");
            break;
            }

        } while (opcion != 4);

    }
}