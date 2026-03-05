import java.util.Scanner;

public class PedirDato{

    private final Scanner sc;

    public PedirDato() {
        this.sc = new Scanner(System.in);
    }

    public PedirDato(Scanner sc) {
        this.sc = sc;
    }

    public String pedirCadena(String mensaje) {
        while (true) {
            System.out.println(mensaje + ": ");
            String cadenaTemporal = sc.nextLine().trim();
            if (!cadenaTemporal.isEmpty()) {
                return cadenaTemporal;
            }
            System.out.println("Error el campo no puede estar vacio");
        }
    }

    public int pedirEntero(String mensaje) {
        return pedirEntero(mensaje, 1, Integer.MAX_VALUE);
    }

    public int pedirEntero(String mensaje, int min, int max) {
        while (true) {
            System.out.println(mensaje + ": ");
            try {
                int numeroTemporal = Integer.parseInt(sc.nextLine().trim());
                if (numeroTemporal >= min && numeroTemporal <= max) {
                    return numeroTemporal;
                }
                System.out.println("Error el número debe estar entre " + min + " y " + max);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor ingresa un número entero");
            }
        }
    }

    public double pedirDecimal(String mensaje) {
        return pedirDecimal(mensaje, 0.01, Double.MAX_VALUE);
    }

    public double pedirDecimal(String mensaje, double min, double max) {
        while (true) {
            System.out.println(mensaje + ": ");
            try {
                double numeroTemporal = Double.parseDouble(sc.nextLine().trim());
                if (numeroTemporal >= min && numeroTemporal <= max) {
                    return numeroTemporal;
                }
                System.out.println("Error el numero debe estar entre " + min + " y " + max);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida, por favor ingresa un numero decimal");
            }
        }
    }
}