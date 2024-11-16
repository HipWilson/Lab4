import java.util.Scanner;
public class SimuladorRadio {
    public static void main(String[] args) {
        RadioClaseC radio = new RadioClaseC();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu del Radio ---");
            System.out.println("1. Encender radio");
            System.out.println("2. Apagar radio");
            System.out.println("3. Cambiar volumen");
            System.out.println("4. Cambiar banda (AM/FM)");
            System.out.println("5. Cambiar emisora");
            System.out.println("6. Guardar emisora");
            System.out.println("7. Cargar emisora");
            System.out.println("8. Conectar telefono");
            System.out.println("9. Desconectar telefono");
            System.out.println("10. Cambiar a llamada en espera");
            System.out.println("11. Ver pronostico del tiempo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            String resultado = ""; // Iniciar el mensaje
        }
    }

}
