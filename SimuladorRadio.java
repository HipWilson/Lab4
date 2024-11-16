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

            switch (opcion) {
                case 1 -> resultado = radio.encender();
                case 2 -> resultado = radio.apagar();
                case 3 -> {
                    System.out.print("Ingrese incremento del volumen (+/-): ");
                    int incremento = scanner.nextInt();
                    resultado = radio.cambiarVolumen(incremento);
                }
                case 4 -> resultado = radio.cambiarBanda();
                case 5 -> {
                    System.out.print("Ingrese el cambio de frecuencia (ej. 0.5): ");
                    double incremento = scanner.nextDouble();
                    resultado = radio.cambiarEmisora(incremento);
                }
                case 6 -> {
                    System.out.print("Ingrese el nombre de la emisora para guardar: ");
                    String emisora = scanner.nextLine();
                    resultado = radio.guardarEmisora(emisora);
                }
                case 7 -> {
                    System.out.print("Ingrese la posicion de la emisora guardada: ");
                    int posicion = scanner.nextInt();
                    resultado = radio.cargarEmisora(posicion);
                }
                case 8 -> resultado = radio.conectarTelefono();
                case 9 -> resultado = radio.desconectarTelefono();
                case 10 -> resultado = radio.ModoEspera();
                case 11 -> resultado = radio.VerPronostico();
                case 0 -> resultado = "Feliz dia ...";
                default -> resultado = "Opcion invalida. Intente de nuevo.";
            }
            // Imprimir el resultado devuelto por los metodos
            if (!resultado.isEmpty()) {
                System.out.println(resultado);
            }
        } while (opcion != 0);
        
        scanner.close();
    }

}
